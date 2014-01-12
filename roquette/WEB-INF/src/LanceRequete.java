import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.json.*;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class LanceRequete extends HttpServlet {

	private static final long serialVersionUID = -7593848046688416193L;

	static String username = null;
	static String password = null;
	static String url = null;

	static Lexic lexic = null;
	static Cleaner cleaner = null;

	String naturalQuery = null;
	static String queryPostCorrection = null;
	String queryPostLemme = null;
	String SQLQuery = null;
	String results = null;
	String error = null;
	int count = -1;

	public LanceRequete() throws java.lang.ClassNotFoundException {
		// Search org.postgresql.Driver
		Class.forName("org.postgresql.Driver");

		username = "lo17xxx";
		password = "dblo17";
		url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
		lexic = new Lexic();
		cleaner = new Cleaner(lexic);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		naturalQuery = null;
		queryPostCorrection = null;
		queryPostLemme = null;
		SQLQuery = null;
		results = null;
		error = null;
		count = -1;
		naturalQuery = request.getParameter("requete");
		if (naturalQuery.trim().equals("")) {
			error = "Requ&ecirc;te vide !";
		} else if (naturalQuery != null) {
			System.out.println("-> \"" + naturalQuery + "\"");

			// Cleaning
			queryPostLemme = cleaner.cleanString(naturalQuery);
			if (queryPostLemme != null && !queryPostLemme.trim().equals("")) {
				System.out.println("Après correction : \""
						+ queryPostCorrection + "\"");
				System.out.println("Après lemmatisation : \"" + queryPostLemme
						+ "\"");

				// Create sql query
				SQLQuery = toSQLQuery();
				if (SQLQuery != null && !SQLQuery.trim().equals("")) {
					try {
						results = interrogPostgresql();
						if (results == null || results.trim().equals("")
								|| count == 0) {
							error = "Aucun r&eacute;sultats";
						}
					}
					// print out decent error messages
					catch (SQLException ex) {
						error = null;
						System.err.println("==> SQLException: ");
						while (ex != null) {
							error += "Message:   "
									+ Utils.htmlAccents(ex.getMessage())
									+ "<br />";
							error += "SQLState:  " + ex.getSQLState()
									+ "<br />";
							error += "ErrorCode: " + ex.getErrorCode()
									+ "<br />";
							results = null;
							System.out.println("Message:   " + ex.getMessage());
							System.out
									.println("SQLState:  " + ex.getSQLState());
							System.out.println("ErrorCode: "
									+ ex.getErrorCode());
							ex = ex.getNextException();
							System.out.println("");
						}
					}
				}
			}
		}

		try {
			JSONWriter w = new JSONWriter(out);
			w.object();
			w.key("naturalQuery").value(
					naturalQuery != null ? naturalQuery : "");
			w.key("queryPostCorrection").value(
					queryPostCorrection != null ? queryPostCorrection : "");
			w.key("queryPostLemme").value(
					queryPostLemme != null ? queryPostLemme : "");
			w.key("SQLQuery").value(SQLQuery != null ? SQLQuery : "");
			if (count != 0)
				w.key("results").value(results != null ? results : "");
			if (count != -1)
				w.key("count").value(count);
			w.key("error").value(error != null ? error : "").endObject();
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	public String interrogPostgresql() throws SQLException {
		// Establish Connection to the database at URL with usename and
		// password
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		// Send the query and bind to the result set
		ResultSet rs = stmt.executeQuery(SQLQuery);

		ResultSetMetaData rsmd = rs.getMetaData();
		int nbCol = rsmd.getColumnCount();
		int pageIndex = -1;
		count = 0;

		String result = "<table class=\"table\"><tr>";
		for (int i = 1; i <= nbCol; i++) {
			result += "<th>" + rsmd.getColumnLabel(i) + "</th>";
			if (rsmd.getColumnLabel(i).equals("page"))
				pageIndex = i;
			else if (rsmd.getColumnLabel(i).equals("count")) {
				count = -2;
			}
		}
		result += "</tr>";

		while (rs.next()) {
			count++;
			result += "<tr>";
			for (int i = 1; i <= nbCol; i++) {
				result += "<td>";
				String s = rs.getString(i).trim();
				if (pageIndex != -1) {

					result += "<a href=\"#\" target=\"_self\" onclick=load_LCI(\""
							+ rs.getString(pageIndex).trim()
							+ "\")>"
							+ s
							+ "</a>";
				} else {
					result += s + "";
				}
				result += "</td>";
			}
			result += "</tr>";
		}

		result += "</table>";

		// Close resources
		stmt.close();
		con.close();

		return result;
	}

	public String toSQLQuery() {
		String result = null;
		try {
			GrammarLexer lexer = new GrammarLexer(new ANTLRReaderStream(
					new StringReader(queryPostLemme)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			GrammarParser parser = new GrammarParser(tokens);

			result = parser.listerequetes();
			result = result.replaceAll("\t", "");
			result = result.trim();
			result = result.replaceAll("( )+", " ");
			result = result.replaceAll("rubrique.mot", "titre.rubrique");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
}
