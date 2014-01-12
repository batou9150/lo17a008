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

		// ---- configure START
		username = "lo17xxx";
		password = "dblo17";
		// The URL that will connect to TECFA's MySQL server
		// Syntax: jdbc:TYPE:machine:port/DB_NAME
		url = "jdbc:postgresql://tuxa/dblo17";
		// ---- configure END

		String requete;
		requete = request.getParameter("requete");
		System.out.println(requete);
		if (requete != null && requete.trim() != "") {
			// INSTALL/load the Driver (Vendor specific Code)
			try {
				Class.forName("org.postgresql.Driver");
			} catch (java.lang.ClassNotFoundException e) {
				System.err.print("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			}
			try {
				String result = interrogPostgresql.roquette(requete);
				if(result == null){
					out.println("<div class=\"alert alert-danger\">Aucun r&eacute;sultats</div>");
				} else {
					out.println(result);
				}
			} catch (SQLException e) {
			}
		} else if (requete != null) {
			out.println("<div class=\"alert alert-danger\">Requete vide</div>");
		}
	}
}
