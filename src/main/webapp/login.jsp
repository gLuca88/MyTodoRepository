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
<style>
h1 {
	text-align: center;
	color: white;
	font-family: Arial;
}

.newsletter {
	background-color: #fff;
	padding: 20px;
	margin: 20px;
	margin-bottom: 10px;
	border-radius: 10px;
	box-shadow: 0 0 10px #333;
}

.newsletter h2 {
	text-align: center;
}

.newsletter form {
	display: table;
	margin: 0 auto;
}

.newsletter label, .newsletter input {
	display: table-row;
	padding: 10px;
}

header {
	background-color: black;
}

a {
	text-align: center;
	color: white;
	font-family: Arial;
}
</style>
</head>

<body>
	<header>

		<h1>Benvenuto nella nostra applicazione</h1>


	</header>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="newsletter">
		<h2>LOGIN</h2>
		<form action=ServletLogin method="post">
			<table>
				<tr>
					<td><label for="email"><b>Email</b></label> <input
						type="email" id="email" placeholder="Enter Email" name="email"
						required></td>
				</tr>
				<tr>
					<td><label for="psw"><b>Password</b></label> <input
						type="password" id="password" placeholder="Enter Password"
						name="psw" required></td>
				</tr>
				<tr>
					<td><input type="submit" value="accedi"></td>
				</tr>
			</table>

		</form>
	</div>
	<footer class="text-center text-center text-white bg-dark">
		<div class="container p-4 pb-0">
			<section class="">
				<div class="row">
					<hr class="w-100 clearfix d-md-none" />
					<div class="col-md-2 col-lg-2 col-xl-2 mx-auto mt-3">
						<h6 class="text-uppercase mb-4 font-weight-bold">creatori</h6>
						<p>
							<a class="text-white">Gianluca Radesca</a>
						</p>
					</div>
				</div>
			</section>
			<hr class="my-3">
			<section class="p-3 pt-0">
				<div class="row d-flex align-items-center">
					<div class="col-md-7 col-lg-8 text-center text-md-start">
						<div class="p-3">
							© 2020 Copyright: <a class="text-white"
								href="https://mdbootstrap.com/">MDBootstrap.com</a>
						</div>
					</div>
				</div>
			</section>
		</div>
	</footer>
</body>

</html>