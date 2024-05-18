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
<title>Home Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>

<body style='background-color:#FFDDCA;'>
<h1 style="margin:20px 0 30px 0;color:white"><center>Welcome to <span style="color: gold;" border="2px">Foodie-BAY </span> </center></h1><hr>
	<center><h2 style="color:white">Add Feedback</h2></center><hr style="width:700px;margin-left:400px">
	<br>
	<form action="successAddfeedback">
  <div class="mb-3">
    <h4 style="margin-left:440px"><label for="exampleInputEmail1" class="form-label" style="color:gold">Your Name</label></h4>
    <input style="width:600px;margin-left:450px"  name="cust_name" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
  </div><br>
  
  <div class="mb-3">
   <h4 style="margin-left:440px"><label for="exampleInputPassword1" class="form-label" style="color:white">Hospitality</label></h4> 
    <input name="hospitality" type="text" style="width:600px;margin-left:450px" class="form-control" id="exampleInputPassword1" required>
  </div><br>
  
   <div class="mb-3">
   <h4 style="margin-left:440px"><label for="exampleInputPassword1" class="form-label" style="color:gold">Food Quality</label></h4> 
 <!-- <input name="food_category" type="text" style="width:600px;margin-left:450px" class="form-control" id="exampleInputPassword1" required> -->   
     <select  name="quality" type="text" style="width:600px;margin-left:450px" class="btn btn-light dropdown-toggle" id="dropdownMenu2" required>
  <option value="Excellent">Excellent</option>
  <option value="Good">Good</option>
  <option value="Average">Average</option>
  <option value="Poor">Poor</option>
</select>
  </div><br>
  
 <div class="mb-3" >
    <h4 style="margin-left:440px"><label for="exampleInputPassword1" class="form-label" style="color:white">Suggestion</label></h4>
    <input name="suggestion" type="text" style="width:600px;margin-left:450px" class="form-control" id="exampleInputPassword1" required>    
  </div><br>
  
  <hr style="width:700px;margin-left:400px;margin-bottom:10px">
 <center> <button style="margin-bottom:30px;background-color:gold;color:black" type="submit" class="btn btn-primary">Submit</button></center>
</form>
	
</body>
</html>