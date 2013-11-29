import java.sql.*;
import java.util.Scanner;

public class interrogPostgresql {
	public static void main(String args[]) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		Lexic lexic = new Lexic();
		Cleaner cleaner = new Cleaner(lexic);
		String requeteLN;

		// ---- configure START
		String username = "lo17xxx";
		String password = "dblo17";
		// The URL that will connect to TECFA's MySQL server
		// Syntax: jdbc:TYPE:machine:port/DB_NAME
		String url = "jdbc:postgresql://tuxa.sme.utc/dblo17";

		do {
			System.out.print("Texte : ");
			requeteLN = scanner.nextLine();
			String requete = TalMain.toSQLQuery(requeteLN, cleaner);

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
				while (rs.next()) {
					String s = rs.getString(1);
					System.out.println(s);
				}
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
		} while (!requeteLN.equals("*"));
		scanner.close();
	}
}
