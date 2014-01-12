import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

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

		naturalQuery = request.getParameter("requete");
		if (naturalQuery == null) return;
		else if(naturalQuery.trim().equals("")) {
			out.println("<div class=\"alert alert-danger\">Requete vide</div>");
			return;
		}
		out.println("<div class=\"alert alert-success\">" + naturalQuery + "</div>");
		System.out.println("\"" + naturalQuery + "\"");
		
		// Cleaning
		queryPostLemme = cleaner.cleanString(naturalQuery);
		if (queryPostLemme == null || queryPostLemme.trim().equals("")) return;
		out.println("<div class=\"alert alert-info\">" + queryPostCorrection + "</div>");
		System.out.println("Après correction : \"" + queryPostCorrection + "\"");
		out.println("<div class=\"alert alert-info\">" + queryPostLemme + "</div>");
		System.out.println("Après lemmatisation : \"" + queryPostLemme + "\"");
		
		// Create sql query
		SQLQuery = toSQLQuery();
		if (SQLQuery == null || SQLQuery.trim().equals("")) return;
		out.println("<div class=\"alert alert-warning\">" + SQLQuery + "</div>");
		
		String result = interrogPostgresql();
		out.println(result);
		if (result == null || result.trim().equals("")) {
			out.println("<div class=\"alert alert-danger\">Aucun r&eacute;sultats</div>");
		}
	}

	public String interrogPostgresql() {		
		String result = "";

		try {
			// Establish Connection to the database at URL with usename and
			// password
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			// Send the query and bind to the result set
			ResultSet rs = stmt.executeQuery(SQLQuery);

			ResultSetMetaData rsmd = rs.getMetaData();
			int nbCol = rsmd.getColumnCount();
			int pageIndex = -1;
			int compteur = 0;

			String tmpResult = "";
			tmpResult += "<tr>\n";
			for (int i = 1; i <= nbCol; i++) {
				tmpResult += "<td>" + rsmd.getColumnLabel(i) + "</td>\n";
				if (rsmd.getColumnLabel(i).equals("page"))
					pageIndex = i;
			}
			tmpResult += "</tr>\n";

			while (rs.next()) {
				compteur++;
				tmpResult += "<tr>\n";
				for (int i = 1; i <= nbCol; i++) {
					tmpResult += "<td>\n";
					String s = rs.getString(i).trim();
					if (pageIndex != -1) {

						tmpResult += "<a href=\"#\" target=\"_self\" onclick=load_LCI(\""
								+ rs.getString(pageIndex).trim()
								+ "\")>"
								+ s
								+ "</a><br>\n";
					} else {
						tmpResult += s + "<br>\n";
					}
					tmpResult += "</td>\n";
				}
				tmpResult += "</tr>\n";
			}

			tmpResult += "</table></div><div id=\"display\" class=\"col-md-4\"></div>\n";

			// Close resources
			stmt.close();
			con.close();

			result += "<div class=\"col-md-3\">Il y a " + compteur
					+ " r&eacute;sultats.<table class=\"table\">\n" + tmpResult;

		}
		// print out decent erreur messages
		catch (SQLException ex) {
			System.err.println("==> SQLException: ");
			while (ex != null) {
				result += "<div class=\"alert alert-danger\">";
				result += "Message:   " + Utils.htmlAccents(ex.getMessage())
						+ "<br />";
				result += "SQLState:  " + ex.getSQLState() + "<br />";
				result += "ErrorCode: " + ex.getErrorCode() + "<br />";
				result += "</div>";
				
				System.out.println("Message:   " + ex.getMessage());
				System.out.println("SQLState:  " + ex.getSQLState());
				System.out.println("ErrorCode: " + ex.getErrorCode());
				ex = ex.getNextException();
				System.out.println("");
			}
		}
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
