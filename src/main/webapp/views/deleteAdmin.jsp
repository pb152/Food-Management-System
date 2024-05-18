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
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body style='background-color:#FFDDCA;'>
<h1 style="margin:20px 0 30px 0;color:white" ><center>Welcome to <span style="color: gold;" border="2px">Foodie-BAY </span> </center></h1><hr>
	<center><h2 style="color:white">Delete Admin</h2></center><hr style="width:700px;margin-left:400px">
	
		
	<form action="successAdminDelete">
	<div class="mb-3">
    <h4 style="margin-left:440px"><label for="exampleInputEmail1" class="form-label" style="color:gold">Admin Id</label></h4>
    <input style="width:600px;margin-left:450px" value="${admin_id}" name="admin_id" type="number"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
  </div><br>
	
  <div class="mb-3">
    <h4 style="margin-left:440px"><label for="exampleInputEmail1" class="form-label" style="color:white">Admin Username</label></h4>
    <input style="width:600px;margin-left:450px" value="${admin_username}" name="admin_username" type="text" disabled class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
  </div><br>
  
  <div class="mb-3">
   <h4 style="margin-left:440px"><label for="exampleInputPassword1" class="form-label" style="color:gold">Admin Password</label></h4> 
    <input name="admin_password" type="text" value= "${admin_password}" style="width:600px;margin-left:450px" disabled class="form-control" id="exampleInputPassword1" required>
  </div><br>
  
 
  <hr style="width:700px;margin-left:400px">
 <center> <button type="submit" class="btn btn-primary" style="background-color:gold;color:black">Delete Admin</button></center>
</form>
	
</body>
</html>