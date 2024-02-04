package Model;

import java.sql.Date;
import java.sql.Time;

public class Appuntamento {
	private int id;
	private Date dataAppuntamento;
	private String descrizione;
	private Time oraInizio;
	private Time oraFine;
	private String stato;

	public Appuntamento(int id, Date dataAppuntamento, String descrizione, Time oraInizio, Time oraFine, String stato) {
		super();
		this.id = id;
		this.dataAppuntamento = dataAppuntamento;
		this.descrizione = descrizione;
		this.oraInizio = oraInizio;
		this.oraFine = oraFine;
		this.stato = stato;
	}

	public Appuntamento(Date dataAppuntamento, String descrizione, Time oraInizio, Time oraFine, String stato) {
		super();
		this.dataAppuntamento = dataAppuntamento;
		this.descrizione = descrizione;
		this.oraInizio = oraInizio;
		this.oraFine = oraFine;
		this.stato = stato;
	}

	public Appuntamento() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataAppuntamento() {
		return dataAppuntamento;
	}

	public void setDataAppuntamento(Date dataAppuntamento) {
		this.dataAppuntamento = dataAppuntamento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Time getOraInizio() {
		return oraInizio;
	}

	public void setOraInizio(Time oraInizio) {
		this.oraInizio = oraInizio;
	}

	public Time getOraFine() {
		return oraFine;
	}

	public void setOraFine(Time oraFine) {
		this.oraFine = oraFine;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

}// classe
