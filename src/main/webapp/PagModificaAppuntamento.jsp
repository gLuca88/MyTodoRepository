<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="FrontHome.css">


</head>


<body class="container mt-5">






	<img src="immagineApp.jpeg" alt="immagine">
	<a href="HomeAppuntamenti.jsp">Home</a>
	<br>
	<br>
	<form action="ServletVisualizzazione" method="get">
		<input class="btn btn-info" type="submit"
			value="visualizza appuntamenti">
	</form>
	<h1 class="mb-4">Elimina Appuntamento:</h1>
	<form id="prenotazioneForm" action=ServletElimina method="post">
		<div class="form-group">
			<label for="NumeroId">Inserisci ID dell'appuntamento da
				Eliminare:</label> <input type="number" class="form-control"
				id="NumeroIdDue" name="NumeroIdDue" required>
		</div>
		<br> <input class="btn btn-info" type="submit" value="ELIMINA">
	</form>
	<h1 class="mb-4">Modifica appuntamento:</h1>
	<form id="prenotazioneForm" action=ServletModificaGenerale
		method="post">
		<div class="form-group">
			<label for="NumeroId">Inserisci ID dell'appuntamento da
				modificare:</label> <input type="number" class="form-control" id="NumeroId"
				name="NumeroId" required>
		</div>

		<div class="form-group">
			<label for="data">Inserisci nuova data:</label> <input type="date"
				class="form-control" id="data" name="data" required>
		</div>

		<label for="orario">Inserisci nuovo orario inizio:</label> <select
			class="form-control" id="orarioInizio" name="orarioInizio">

			<option value="08:00">08:00</option>
			<option value="08:30">08:30</option>
			<option value="09:00">09:00</option>
			<option value="09:30">09:30</option>
			<option value="10:00">10:00</option>
			<option value="10:30">10:30</option>
			<option value="11:00">11:00</option>
			<option value="11:30">11:30</option>
			<option value="12:00">12:00</option>
			<option value="12:30">12:30</option>
			<option value="13:00">13:00</option>
			<option value="13:30">13:30</option>
			<option value="14:00">14:00</option>
			<option value="14:30">14:30</option>
			<option value="15:00">15:00</option>
			<option value="15:30">15:30</option>
			<option value="16:00">16:00</option>
			<option value="16:30">16:30</option>
			<option value="17:00">17:00</option>
			<option value="17:30">17:30</option>
			<option value="18:00">18:00</option>
		</select> <label for="orario">Inserisci nuovo orario fine:</label> <select
			class="form-control" id="orarioFine" name="orarioFine">

			<option value="08:30">08:30</option>
			<option value="09:00">09:00</option>
			<option value="09:30">09:30</option>
			<option value="10:00">10:00</option>
			<option value="10:30">10:30</option>
			<option value="11:00">11:00</option>
			<option value="11:30">11:30</option>
			<option value="12:00">12:00</option>
			<option value="12:30">12:30</option>
			<option value="13:00">13:00</option>
			<option value="13:30">13:30</option>
			<option value="14:00">14:00</option>
			<option value="14:30">14:30</option>
			<option value="15:00">15:00</option>
			<option value="15:30">15:30</option>
			<option value="16:00">16:00</option>
			<option value="16:30">16:30</option>
			<option value="17:00">17:00</option>
			<option value="17:30">17:30</option>
			<option value="18:00">18:00</option>
			<option value="18:30">18:30</option>
			<option value="19:00">19:00</option>
			<option value="19:30">19:30</option>
			<option value="20:00">20:00</option>
		</select>

		<div class="form-group">
			<label for="descrizione">Inserisci Nuova Descrizione:</label>
			<textarea class="form-control" id="descrizione" name="descrizione"
				rows="5" cols="40"
				placeholder="Scrivi qui la descrizione dell'appuntamento"></textarea>
		</div>
		<label for="statusNuovo">Inserisci Nuovo status :</label><br>
		<select class="form-control" id="statusNuovo" name="statusNuovo">
			<option value="Non Definito">Non Definito</option>
			<option value="Fatto">Fatto</option>
			<option value="Da Fare">Da Fare</option>

		</select> <br> <input class="btn btn-info" type="submit" value="Modifica">

	</form>
</body>
</html>