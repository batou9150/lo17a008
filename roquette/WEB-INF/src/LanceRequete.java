import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class LanceRequete extends HttpServlet {

	private static final long serialVersionUID = -7593848046688416193L;

	String username;
	String password;
	String url;
	String requete = "";
	String nom;
	int nbre;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Lance requete!</title>");
		out.println("</head>");
		out.println("<body>");

		// ---- configure START
		username = "lo17xxx";
		password = "dblo17";
		// The URL that will connect to TECFA's MySQL server
		// Syntax: jdbc:TYPE:machine:port/DB_NAME
		url = "jdbc:postgresql://tuxa/dblo17";
		// ---- configure END

		String requete;
		requete = request.getParameter("requete");
		if (requete != null && requete.trim() != "") {
			// INSTALL/load the Driver (Vendor specific Code)
			try {
				Class.forName("org.postgresql.Driver");
			} catch (java.lang.ClassNotFoundException e) {
				System.err.print("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			}
			try {
				out.println(interrogPostgresql.roquette(requete));
			} catch (SQLException e) {
			}
		} else if (requete != null) {
			out.println("Requete vide");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
