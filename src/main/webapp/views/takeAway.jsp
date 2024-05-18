<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-image: url("/image/food_bg5.jpg");
	background-position: center;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% auto;
}
</style>
<meta charset="ISO-8859-1">
<title>Home Delivery Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

</head>
<body style='background-color: #FFDDCA;'>
	<h1 style="margin: 20px 0 30px 0; color: white">
		<center>
			Welcome to <span style="color: gold;" border="2px">Foodie-BAY
			</span>
		</center>
	</h1>
	<hr>
	<center>
		<h2 style="color: white">Take Away details</h2>
	</center>
	<br>
	<hr style="width: 500px; margin-left: 500px">

	<h2 class="fw-bold mb-2 text-uppercase" style="color:gold;margin-left:20px">Your order will be ready within 30 minutes.</h2>
	<h2 class="text-50 mb-5" style="color:white;margin-left:20px">Thanks for ordering with us !</h2>
	<br>
	<center><h2 class="text-50 mb-5" style="color:gold">Please! Fill the feedback form</h2></center>
	<br>
	<div style="text-align: center">
		<h5>
			<button class="btn btn-outline-light btn-lg px-5" type="submit" onclick="location.href='addFeedback'">Feedback</button>
		</h5>
	</div>
</body>
</html>