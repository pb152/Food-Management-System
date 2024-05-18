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
<title>Insert title here</title>
<title>Update Product Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body style='background-color:#FFDDCA;'>
<h1 style="margin:20px 0 30px 0;color:white"><center>Welcome to <span style="color: gold;" border="2px">Foodie-BAY </span> </center></h1><hr>
<center><h2 style="color:white">Password Updated Successfully</h2></center><br><hr style="width:500px;margin-left:500px">

<table class="table" style="width:60%;margin-left:300px">
  <thead>
    <tr style="color:gold">
      <th scope="col">#</th>
      <th scope="col">Admin ID</th>
      <th scope="col">Admin Username</th>
      <th scope="col">Admin Password</th>
    </tr>
  </thead>
  <tbody>
    <tr style="color:white">
      <th scope="row">1</th>
      <td>${admin_id}</td>
      <td>${admin_username}</td>
      <td>${admin_password}</td>
     
    </tr>
</tbody>
</table>
<br><br>
<div style="text-align:center">
<h5><a href="/adminhomepage" style="color:gold">Admin Login Page</a></h5>
</div>


</body>
</html>