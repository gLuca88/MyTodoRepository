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

public class ServletElimina extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Support db = new Support();

	public ServletElimina() {
		// vuoto
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String idAppuntamento = request.getParameter("NumeroIdDue");
		try {
			Connection con = db.OpenConnection();
			String query = "SELECT * FROM Impegni WHERE id = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, idAppuntamento);
			ResultSet rs = pstmt.executeQuery();
			if (!rs.next()) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('id appuntamento non trovato!!!');");
				out.println("location='PagModificaAppuntamento.jsp';");
				out.println("</script>");
				return;
			} // close if
			else {
				query = "DELETE FROM impegni WHERE id = ?";
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, idAppuntamento);
				int eliminazione = pstmt.executeUpdate();
				if (eliminazione > 0) {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('appunatmento eliminato!!');");
					out.println("location='PagModificaAppuntamento.jsp';");
					out.println("</script>");
				}
			}
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Problem");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // close catch

	}// close dopost

}// close servlet
