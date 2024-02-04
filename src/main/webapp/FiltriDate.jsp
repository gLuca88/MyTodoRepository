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
<body>





	<img src="immagineApp.jpeg" alt="immagine">
	<a href="HomeAppuntamenti.jsp">HOME</a>
	<br>
	<br>
	<br>
	<h1 class="mb-4">Cerca I Tuoi Appuntamenti:</h1>
	<form id="FiltroData" action=ServletCercaPerData method="get">
		<div id="data-filter" class="form-group">
			<label for="dataFiltro">Seleziona una Data</label> <input type="date"
				class="form-control" id="dataFiltro" name="dataFiltro">
		</div>
		<br> <input class="btn btn-info" type="submit"
			value="Filtra per Data">
	</form>
	<br>
	<hr>
	<!--Filtro Prezzi-->
	<form id="FiltroDataDue" action=ServletRicercaTraDueDate method="get">
		<div id="data-filter" class="form-group">

			<label for="primaData">Da Data :</label> <input type="date"
				class="form-control" id="primaData" name="primaData"> <label
				for="secondaData">A Data :</label> <input type="date"
				class="form-control" id="secondaData" name="secondaData">
		</div>
		<br> <input class="btn btn-info" type="submit"
			value="Filtra per Date">
	</form>
	<br>
	<br>

	<hr>



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