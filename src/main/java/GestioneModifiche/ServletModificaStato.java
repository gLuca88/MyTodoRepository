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

public class ServletModificaStato extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Support db=new Support();
	
	public ServletModificaStato() {
		//vuoto
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		String idAppuntamento = request.getParameter("idCompletatoModifica");
		String nuovoStatus = request.getParameter("statusNuovo");
		try {
			Connection  con =db.OpenConnection();
			String query = "SELECT * FROM Impegni WHERE id = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, idAppuntamento);
			ResultSet rs = pstmt.executeQuery();
			if (!rs.next()) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('id appuntamento non trovato!!!');");
				out.println("location='HomeAppuntamenti.jsp';");
				out.println("</script>");
				return;

			}//close if
			else {
				query = "UPDATE impegni SET status=? WHERE id=?";
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, nuovoStatus);
				pstmt.setString(2, idAppuntamento);
				int modifiche = pstmt.executeUpdate();
				if(modifiche>0) {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('status modificato!!');");
					out.println("location='HomeAppuntamenti.jsp';");
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
		}
		
	}//close do post
	
	
	
	
	
}//chiusura servlet
