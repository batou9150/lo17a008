import java.sql.*;

public class interrogPostgresql {

	public static String roquette(String args) throws SQLException {
		Lexic lexic = new Lexic();
		Cleaner cleaner = new Cleaner(lexic);

		// ---- configure START
		String username = "lo17xxx";
		String password = "dblo17";
		// The URL that will connect to TECFA's MySQL server
		// Syntax: jdbc:TYPE:machine:port/DB_NAME
		String url = "jdbc:postgresql://tuxa.sme.utc/dblo17";

		String requete = AntlrMain.toSQLQuery(args, cleaner);
		if (requete == null)
			return null;
		requete = requete.replaceAll("rubrique.mot", "titre.rubrique");
		String result = "";
		System.out.println(requete);
		result += "<div class=\"alert alert-info\">" + Cleaner.postCorrection
				+ "</div>";
		result += "<div class=\"alert alert-info\">" + Cleaner.postLemme
				+ "</div>";
		if (!requete.trim().equals(""))
			result += "<div class=\"alert alert-warning\">" + requete
					+ "</div>";

		// INSTALL/load the Driver (Vendor specific Code)
		try {
			Class.forName("org.postgresql.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			Connection con;
			Statement stmt;

			// Establish Connection to the database at URL with usename and
			// password
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			// Send the query and bind to the result set
			ResultSet rs = stmt.executeQuery(requete);

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
				System.out.println("Message:   " + ex.getMessage());
				System.out.println("SQLState:  " + ex.getSQLState());
				System.out.println("ErrorCode: " + ex.getErrorCode());
				result += "<div class=\"alert alert-danger\">";
				result += "Message:   " + Utils.htmlAccents(ex.getMessage())
						+ "<br />";
				result += "SQLState:  " + ex.getSQLState() + "<br />";
				result += "ErrorCode: " + ex.getErrorCode() + "<br />";
				result += "</div>";
				ex = ex.getNextException();
				System.out.println("");
			}
		}
		return result;
	}
}
