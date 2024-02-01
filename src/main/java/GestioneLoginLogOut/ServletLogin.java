package GestioneLoginLogOut;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ControllerDb.Support;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	System.out.println("enter in servlet");
	// logica lato server
    Support db =new Support();
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
	response.setHeader("Pragma", "no-cache"); // HTTP 1.0
	response.setDateHeader("Expires", 0); // Proxies

	String email = request.getParameter("email");
	String password = request.getParameter("psw");
	String querySql = "SELECT * FROM Utente WHERE email=? AND passwordUtente=?";

	try {
		Connection con = db.OpenConnection();
		PreparedStatement pst = con.prepareStatement(querySql);
		pst.setString(1, email);
		pst.setString(2, password);

		ResultSet rs = pst.executeQuery();

		if (rs.next()) {
			HttpSession session = request.getSession(); // crea una nuova sessione
			session.setAttribute("email", email); // imposta l'attributo email nella sessione
			
			System.out.println("Login effettuata con successo");
			UserObject user=new UserObject();
			user.isLogged=true;
			session.setAttribute("userObj", user);
			
			response.sendRedirect("HomeAppuntamenti.jsp");
		} else {
			// response.sendRedirect("pagErrorDati.jsp");

			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Email o password  inseriti non corretti');");
			out.println("location='pagAccesso.html';");
			out.println("</script>");

		} // chiusura else

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}// chiusura do post

}// classe