<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Home Page</title>
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
		<h2 style="color: white">MENU List</h2>
	</center>
	<br>
	<hr style="width: 500px; margin-left: 500px; border: 2px solid white">
	<div style="text-align: center">
		<table class="table table-striped" style="background-color:orange">
			<thead class="thead-dark">
				<tr style="color:black">
					<th scope="col">Food ID</th>
					<th scope="col">Category</th>
					<th scope="col">Food Name</th>
					<th scope="col">Price</th>
					<th scope="col">Food Description</th>
					
					<th scope="col" style="background-color:#FF4500">Choice</th>
					<!-- 	<th>checkbox</th>
				<th>qty</th> -->

				</tr>
			</thead>
			<tbody >
				<c:forEach items="${foodlist}" var="p">
					<tr style="color:white">
						<th scope="row">${p.food_id }</th>
						<td>${p.food_category }</td>
						<td>${p.food_name }</td>
						<td>${p.food_price }</td>
						<td>${p.food_desc }</td>
						<td style="background-color:#FF4500"><a href="addtocart/${p.food_id}" style="color:black">Add To Cart</a></td>

					</tr>
				</c:forEach>
				</tbody>
				</table>
				<br><br>
				<h4>
					<a href="customerhomepage"
						style="color: white; text-decoration: none">Go Back !</a>
				</h4>
				<hr	style="width: 500px; margin-left: 500px; border: 2px solid white">
				</div>
</body>
</html>