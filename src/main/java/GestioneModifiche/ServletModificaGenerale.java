package GestioneModifiche;

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

public class ServletModificaGenerale extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Support db = new Support();

	public ServletModificaGenerale() {
		// vuoto
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("NumeroId");
		String dataAppuntamento = request.getParameter("data");
		String descrizione = request.getParameter("descrizione");
		String oraInizio = request.getParameter("orarioInizio");
		String oraFine = request.getParameter("orarioFine");
		String status = request.getParameter("statusNuovo");
		try {
			Connection con = db.OpenConnection();
			String query = "SELECT * FROM impegni WHERE id = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();

			if (!rs.next()) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('id appuntamento non trovato!!!');");
				out.println("location='HomeAppuntamenti.jsp';");
				out.println("</script>");
				return;

			} // close if
			else {
				query = "UPDATE impegni SET dataAppuntamento=?, descrizione =?, oraInizio = ?,oraFine=?,status=? WHERE id=?";
				pstmt = con.prepareStatement(query);
				pstmt.setObject(1, dataAppuntamento);
				pstmt.setString(2, descrizione);
				pstmt.setObject(3, oraInizio);
				pstmt.setObject(4, oraFine);
				pstmt.setString(5, status);
				pstmt.setString(6, id);

				int appuntamentiInseriti = pstmt.executeUpdate();
				if (appuntamentiInseriti > 0) {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Appuntamento modificato!!');");
					out.println("location='HomeAppuntamenti.jsp';");
					out.println("</script>");
				}
				// chiudiamo le connessioni
				pstmt.close();
				con.close();

			} // close else

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Problem");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// close do post

}// close servlet
