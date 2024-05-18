<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>body{
           background-image: url("/image/food_bg5.jpg");
            background-position: center;
            background-repeat: no-repeat;
            background-attachment: fixed; 
            background-size:100% auto;
           
}</style>
<meta charset="ISO-8859-1">
<title>Add Product Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body style='background-color:#FFDDCA	;'>
<h1 style="margin:20px 0 30px 0;color:white"><center>Welcome to <span style="color: gold;" border="2px">Foodie-BAY </span> </center></h1><hr>
<center><h2 style="color:white">Food Added Successfully</h2></center><br><hr style="width:500px;margin-left:500px">

<table class="table" style="width:60%;margin-left:220px">
  <thead>
    <tr style="color:gold">
      <th scope="col">#</th>
      <th scope="col">Food Name</th>
      <th scope="col">Food Price</th>
      <th scope="col">Food Category</th>
      <th scope="col">Food Description</th>
    </tr>
  </thead>
  <tbody>
    <tr style="color:white">
      <th scope="row" >1</th>
      <td>${food_name}</td>
      <td>${food_price}</td>
      <td>${food_category}</td>
      <td>${food_desc}</td>
    </tr>
</tbody>
</table>
<br><br>
<div style="text-align:center;">
<h5><a href="/adminhome" style="color:gold">Admin Home Page</a></h5>
</div>
</body>
</html>