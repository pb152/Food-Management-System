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

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Discount Cart</title>
</head>
<body style='background-color: #FFDDCA;'>
	<h1 style="margin: 20px 0 30px 0; color: white">
		<center>Welcome to <span style="color: gold;" border="2px">Foodie-BAY</span></center>
	</h1>
	<hr>
	<center><h2 style="color: white">Selected Item</h2></center>
	<br>
	<hr style="width: 500px; margin-left: 500px; border: 2px solid white">
	<div style="text-align: center">
		<table class="table table-striped">
			<thead class="thead-dark">
				<h2 style="color: white">CART</h2>
				<table class="table table-striped" style="background-color: orange">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Food ID</th>
							<th scope="col">Category</th>
							<th scope="col">Food Name</th>
							<th scope="col">Price</th>
							<th scope="col">Food Description</th>
							
							<th scope="col" style="background-color:#FF4500">Quantity</th>


						</tr>
					</thead>
					<tbody>
						<tr>
							<td scope="row">${food.food_id }</td>
							<td scope="row">${food.food_category }</td>
							<td scope="row">${food.food_name }</td>
							<td scope="row">${food.food_price }</td>
							<td scope="row">${food.food_desc }</td>
							
							<td scope="col" style="background-color:#FF4500">
							
							 <form action="/bill" method="get">
					 	 <input type="number" name="food_price"  value="${food.food_price }" style="display: none ;"> 
							 <input type="number" name="quantity"> 
							<button type="submit" style="background-color:gold">BUY</button>
							
							 </form>
							</td>
						</tr>
					</tbody>
				</table>
	<!--  		<h4>
					<a style="color: gold; text-decoration: none">Your Total Bill-</a>
					<span style="color: gold">${food.food_price}&#8377</span>
				</h4> 
			</thead>
		</table>
		<br> -->
	<!--  	<h4>
			<a href="takeaway" style="color: white; text-decoration: none">Takeaway
			</a>
		</h4>
		<hr style="width: 500px; margin-left: 500px; border: 2px solid white">

		<h4>
			<a href="homedelivery" style="color: gold; text-decoration: none">Home
				delivery</a>
		</h4>
		<hr style="width: 500px; margin-left: 500px; border: 2px solid white">
		<h4>
			<a href="customerhome"
				style="color: white; text-decoration: none">Go Back !</a>
		</h4>
		<hr style="width: 500px; margin-left: 500px; border: 2px solid white">
-->
	</div>
</body>
</html>