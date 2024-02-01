package GestioneInserimento;

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

public class ServletInserimento extends HttpServlet {
private static final long serialVersionUID = 1L;
Support db=new Support();	
public ServletInserimento() {
	
}
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	    System.out.println("enter servlet");
	    response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String dataAppuntamento = request.getParameter("data");
		String descrizione = request.getParameter("descrizione");
		String oraInizio = request.getParameter("orarioInizio");
		String oraFine = request.getParameter("orarioFine");
		String status=request.getParameter("status");
		try {
			Connection con=db.OpenConnection();
			String query = "SELECT * FROM impegni WHERE dataAppuntamento = ? AND ((oraInizio <= ? AND oraFine >= ?) OR (oraInizio <= ? AND oraFine >= ?))";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setObject(1, dataAppuntamento);
			pstmt.setObject(2, oraInizio);
			pstmt.setObject(3, oraInizio);
			pstmt.setObject(4, oraFine);
			pstmt.setObject(5, oraFine);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				out.println("<script type=\"text/javascript\">");
				out.println(
						"alert('Esiste già un appuntamento in questo momento oppure sovrascrive un altro appuntamento!!!');");
				out.println("location='HomeAppuntamenti.jsp';");
				out.println("</script>");
				return;
			}

			// If there are no overlapping appointments, insert the new appointment into the
			// database
			query = "INSERT INTO impegni(dataAppuntamento,descrizione,oraInizio,oraFine,status) VALUES (?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setObject(1, dataAppuntamento);
			pstmt.setString(2, descrizione);
			pstmt.setObject(3, oraInizio);
			pstmt.setObject(4, oraFine);
			pstmt.setString(5, status);
			int appuntamentiInseriti = pstmt.executeUpdate();

			if (appuntamentiInseriti > 0) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Appuntamento Inserito');");
				out.println("location='HomeAppuntamenti.jsp';");
				out.println("</script>");
			}
			// chiudiamo le connessioni
			pstmt.close();
			con.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Problem");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		
	    
	    
	
}//di post	
	

}//classe
