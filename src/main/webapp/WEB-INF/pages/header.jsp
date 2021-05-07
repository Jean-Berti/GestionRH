<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="#" style="color: #0080ff">GestionRH</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link " aria-current="page"
					href="index">Accueil</a></li>
				<li class="nav-item"><a class="nav-link " aria-current="page"
					href="contactUs">Contact</a></li>
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="aboutUs">Qui sommes-nous ?</a></li>
				<li class="nav-item"><a class="nav-link " aria-current="page"
					href="managerList">Manager</a></li>
				<li class="nav-item"><a class="nav-link " aria-current="page"
					href="employeeList">Employee</a></li>
				<li class="nav-item"><a class="nav-link " aria-current="page"
					href="parametres">Parametres</a></li>
				<li class="nav-item dropdown flagDrop"><a
					class="nav-link dropdown-toggle active" href="#"
					id="navbarDropdown" role="button" data-bs-toggle="dropdown"
					aria-expanded="false"> 🇫🇷 </a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item" href="#">🇬🇧</a></li>
					</ul></li>
			</ul>
			<form class="d-flex">
				<!-- Button trigger modal -->
				<button type="button" class="btn btn-outline-primary"
					data-bs-toggle="modal" data-bs-target="#loginBackdrop">Login</button>
				<!-- 				<button type="button" class="btn btn-outline-secondary btn-sm"> -->
				<!-- 					Logout</button> -->
			</form>
		</div>
	</div>
</nav>

<!-- End navbar -->
