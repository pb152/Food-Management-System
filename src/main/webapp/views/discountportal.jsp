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
	<center><h1 style="color: white">Final Bill</h1></center>
	<br>
			<hr style="width: 500px; margin-left: 500px; border: 2px solid white">
	
 <center><h1 style="color:gold" }>Amount : &#8377 ${total_bill } </h1>  </center> 
<center><h2 style="color:gold" }>Discount :  - &#8377 ${discount_money } </h2>  </center>	

<hr style="width: 500px; margin-left: 500px; border: 2px solid white">

<center><h1 style="color:#FF4500" }>Total bill : &#8377 ${final_total_bill } </h1>  </center>

<hr style="width: 500px; margin-left: 500px; border: 2px solid white">
<br><br>

 <center><h3 style="color:white"> Which option would you prefer ?</h3></center><br>
<center>
<h3><button type="submit" method="get" onclick="location.href='takeawayy'" >TakeAway</button><br><br></h3>
<h3><button type="submit" method="get" onclick="location.href='homedelivery'" >Home Delivery</button> </h3></center>
  
</body>
</html>