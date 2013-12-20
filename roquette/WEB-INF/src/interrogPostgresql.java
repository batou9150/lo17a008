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

		String requete = TalMain.toSQLQuery(args, cleaner);
		String result = "";

		System.out.println(requete);

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

			result += "<table border=\"1\">\n";
			result += "<tr>\n";
			for (int i = 1; i <= nbCol; i++) {
				result += "<td>" + rsmd.getColumnLabel(i) + "</td>\n";
			}
			result += "</tr>\n";

			while (rs.next()) {
				result += "<tr>\n";
				for (int i = 1; i <= nbCol; i++) {
					result += "<td>\n";
					String s = rs.getString(i).trim();
					if (requete.matches(".*page.*")) {

						result += "<a href=\"http://tuxa.sme.utc/~lo17a008/LCI/"
								+ s
								+ "\" target=\"_blank\">"
								+ s
								+ "</a><br>\n";
					} else {
						result += s + "<br>\n";
					}
					result += "</td>\n";
				}
				result += "</tr>\n";
			}

			result += "</table>\n";

			// Close resources
			stmt.close();
			con.close();

		}
		// print out decent erreur messages
		catch (SQLException ex) {
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage());
				System.out.println("SQLState:  " + ex.getSQLState());
				System.out.println("ErrorCode: " + ex.getErrorCode());
				ex = ex.getNextException();
				System.out.println("");
			}
		}
		return result;
	}
}
