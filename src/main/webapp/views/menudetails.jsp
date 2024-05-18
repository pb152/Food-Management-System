<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>MENU -</h1>
	<table class="table table-striped">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Food ID</th>
				<th scope="col">Category</th>
				<th scope="col">Food Name</th>
				<th scope="col">Price</th>
				<th scope="col">Food Description</th>
				<th scope="col">Choice</th>
			<!-- 	<th>checkbox</th>
				<th>qty</th> -->
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${foodlist}" var="p">
				<tr>
					<th scope="row">${p.food_id }</th>
					<td>${p.food_category }</td>
					<td>${p.food_name }</td>
					<td>${p.food_price }</td>
					<td>${p.food_desc }</td>
					<td><a href="addtocart/${p.food_id}">Add To Cart</a></td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>