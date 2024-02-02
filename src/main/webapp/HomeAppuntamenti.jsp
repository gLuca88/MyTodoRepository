<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
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

<body>
<body class="container mt-5">


	<img src="immagineApp.jpeg" alt="immagine">
	<a href=LogoutServlet>LOGOUT</a>
	<br>
	<br>
	<br>
	<h1 class="mb-4">Registra il tuo appuntamento:</h1>
	<form id="prenotazioneForm" action=ServletInserimento method="post">

		<div class="form-group">
			<label for="data">Data Appuntamento:</label> <input type="date"
				class="form-control" id="data" name="data" required>
		</div>
		<br> <br> <label for="orarioInizio">Orario inizio:</label> <select
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
		</select> <label for="orarioFine">Orario Fine:</label> <select
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
			<br> <br> <label for="descrizione">Descrizione
				Appuntamento:</label>
			<textarea class="form-control" id="descrizione" name="descrizione"
				rows="5" cols="40"
				placeholder="Scrivi qui la descrizione dell'appuntamento"></textarea>
		</div>
		<br> <label for="status">Inserisci status :</label> <select
			class="form-control" id="status" name="status">
			<option value="Non Definito">Non Definito</option>
			<option value="Fatto">Fatto</option>
			<option value="Da Fare">Da Fare</option>

		</select> <br> <input class="btn btn-info" type="submit" value="Registra">
	</form>
	<br>
	<form action=ServletVisualizzazione method="get">
		<input class="btn btn-info" type="submit"
			value="visualizza appuntamenti">
	</form>
	<br>
	<div class="form-group">
		<form action=ServletModificaStato method="post">
			<label for="idCompletatoModifica">Inserisci ID Appuntamento A
				cui Modificare lo status:</label> <input class="form-control" type="number"
				id="idCompletatoModifica" name="idCompletatoModifica"><br>
			<label for="statusNuovo">Inserisci Nuovo status :</label><br><select
				class="form-control" id="statusNuovo" name="statusNuovo">
				<option value="Non Definito">Non Definito</option>
				<option value="Fatto">Fatto</option>
				<option value="Da Fare">Da Fare</option>

			</select> <br><input class="btn btn-info" type="submit" value="Modifica Status">
		</form>
		<a href="PagModificaAppuntamento.jsp">Sezione Modifica Tutto il tuo appuntamento o Elimina</a>
	</div>
	<footer>
		<div class="container">
			<p>Contattaci:</p>
			<ul>
				<li><a href="mailto:info@appuntamenti.it">info@appuntamenti.it</a></li>
				<li><a href="tel:+390123456789">+39 012 345 6789</a></li>
			</ul>
			<p>Seguici sui social:</p>
			<ul>

				<li><a href="https://www.Facebook.com/appuntamenti"><i
						class="fa fa-facebook"></i>Facebook</a></li>
				<li><a href="https://www.twitter.com/appuntamenti"><i
						class="fa fa-twitter"></i>Twitter</a></li>
				<li><a href="https://www.instagram.com/appuntamenti"><i
						class="fa fa-instagram"></i>Instagram</a></li>
			</ul>
		</div>
	</footer>
</body>

</html>