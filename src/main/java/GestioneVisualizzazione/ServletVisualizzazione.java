package GestioneVisualizzazione;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ControllerDb.Support;
import Model.Appuntamento;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletVisualizzazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Support db=new Support();
	public ServletVisualizzazione() {
		//vuoto
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("enter servlet visualizzazione");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Lista appuntamenti</title>");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">");
		out.println("<style>");
		out.println("table {");
		out.println("border-collapse: collapse;");
		out.println("width: 100%;");
		out.println("color: #333;");
		out.println("font-family: monospace;");
		out.println("font-size: 20px;");
		out.println("text-align: left;");
		out.println("}");
		out.println("th {");
		out.println("background-color: #4CAF50;");
		out.println("color: white;");
		out.println("}");
		out.println("tr:nth-child(even) {");
		out.println("background-color: #f2f2f2;");
		out.println("}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Lista appuntamenti</h1>");
		out.println("<div class=\"table-responsive\">");
		out.println("<table class=\"table table-striped\">");
		out.println("<thead>");
		out.println("<tr>");
		out.println("<th>ID</th>");
		out.println("<th>Data appuntamento</th>");
		out.println("<th>Titolo appuntamento</th>");
		out.println("<th>Ora inizio</th>");
		out.println("<th>Ora fine</th>");
		out.println("<th>Status</th>"); // Additional column for status
		out.println("</tr>");
		out.println("</thead>");
		out.println("<tbody>");
		List<Appuntamento> appuntamenti = getAppuntamentiFromDB();
		for (Appuntamento appuntamento : appuntamenti) {
		    out.println("<tr>");
		    out.println("<td>" + appuntamento.getId() + "</td>");
		    out.println("<td>" + appuntamento.getDataAppuntamento() + "</td>");
		    out.println("<td>" + appuntamento.getDescrizione() + "</td>");
		    out.println("<td>" + appuntamento.getOraInizio() + "</td>");
		    out.println("<td>" + appuntamento.getOraFine() + "</td>");
		    out.println("<td>" + appuntamento.getStato() + "</td>"); // Status column
		    out.println("</tr>");
		}
		out.println("</tbody>");
		out.println("</table>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}//chiusura do get
	private List<Appuntamento> getAppuntamentiFromDB() {

		List<Appuntamento> appuntamenti = new ArrayList<Appuntamento>();
		try {
			Connection con = db.OpenConnection();
			String query = "SELECT * FROM impegni";
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Appuntamento appuntamento = new Appuntamento();
				appuntamento.setId(rs.getInt("id"));
				appuntamento.setDataAppuntamento(rs.getDate("dataAppuntamento"));
				appuntamento.setDescrizione(rs.getString("descrizione"));
				appuntamento.setOraInizio(rs.getTime("oraInizio"));
				appuntamento.setOraFine(rs.getTime("oraFine"));
				appuntamento.setStato(rs.getString("status"));
				appuntamenti.add(appuntamento);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Problem");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return appuntamenti;

	}// metodo che prende i dati dal db
	
	
	
	
}//chiusura classe
