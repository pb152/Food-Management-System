<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>Insert title here</title>
</head>
<body style='background-color: #FFDDCA;'>
	<h1 style="margin: 20px 0 30px 0; color: white">
		<center>Welcome to <span style="color: gold;" border="2px">Foodie-BAY</span></center>
	</h1>
	<hr>
	<center><h2 style="color: white">Total Amount</h2></center>
	<br>
			<hr style="width: 500px; margin-left: 500px; border: 2px solid white">
	
<center><h1 style="color:gold" name="total_bill" value="${total_bill}" }>Amount : &#8377 ${total_bill} </h1>  </center>
<br><br>
<form action="/couponDiscount">
  <div class="mb-3">
    <h4 style="margin-left:440px"><label for="exampleInputEmail1" class="form-label" style="color:gold">Coupon Name</label></h4>
    <input type="number" name="total_bill"  value="${total_bill }" style="display: none ;"> 
    <input style="width:600px;margin-left:450px"  name="coupon_name" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" oninput="this.value = this.value.toUpperCase()" >
  </div><br>
  
  <hr style="width:700px;margin-left:400px">
  
 <center> <button type="submit" class="btn btn-primary" style="background-color:gold;color:black">Apply</button></center>
</form>

</body>
</html>