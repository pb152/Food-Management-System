<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOMEPAGE</title>
<link href="https://fonts.googleapis.com/css2?family=Charm:wght@700&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<style>
body{
           background-image: url("/image/food_bg5.jpg");
            background-position: center;
            background-repeat: no-repeat;
            background-attachment: fixed; 
            background-size:100% auto;
           
}
.card {
    width: 300px;
    padding: 10px;
    border-radius: 20px;
    background: orange;
    border: none;
    color: #fff;
    height: 300px;
    display: flex;
    position: relative;
    align-items: center;
    justify-content: center
}

.container {
    height: 50vh;
    width: 17vw;
    display:inline-block;
    margin-left:20px;
}

.card h1 {
    font-size: 45px;
    margin-bottom: 0px
}

.card span {
    font-size: 29px
}

.image {
    position: absolute;
    opacity: .1;
    left: 0;
    top: 0
}

.image2 {
    position: absolute;
    bottom: 0;
    right: 0;
    opacity: .1
}
</style>
</head>
<body style="color:white">
<h1 style="font-family: 'Charm', cursive;display:inline; font-size:5rem;margin:10px 0 0 220px;letter-spacing:2px"><span style="color:orange;font-size:9rem">F</span>oodie-BAY</h1><br>
<h3 style="margin-left:150px">Your <span style="color:orange">One-Stop</span> Cafe for all your Cravings .</h3>

<div class="d-flex justify-content-left align-items-center container" style="display:inline;float:left">
    <div class="d-flex card text-center">
        <div class="image"><img src="https://i.imgur.com/DC94rZe.png" width="70"></div>
        <div class="image2"><img src="https://i.imgur.com/DC94rZe.png" width="70"></div>
        <h1>40% OFF</h1><span class="d-block">No More</span><span class="d-block">Lazy Monday</span>
        <div class="mt-5" ><h4 >Code : <span style="background-color:black">MONDAY </span></h4> </div>
    </div>
</div>

<div class="d-flex justify-content-left align-items-center container" style="display:inline;float:left">
    <div class="d-flex card text-center">
        <div class="image"><img src="https://i.imgur.com/DC94rZe.png" width="70"></div>
        <div class="image2"><img src="https://i.imgur.com/DC94rZe.png" width="70"></div>
        <h1>25% OFF</h1><span class="d-block">Enjoy with</span><span class="d-block">Loved once</span>
        <div class="mt-5" ><h4 >Code : <span style="background-color:black">HOLIDAY </span></h4> </div>
    </div>
</div>

<div class="d-flex justify-content-left align-items-center container" style="display:inline;">
    <div class="d-flex card text-center">
        <div class="image"><img src="https://i.imgur.com/DC94rZe.png" width="70"></div>
        <div class="image2"><img src="https://i.imgur.com/DC94rZe.png" width="70"></div>
        <h1>15% OFF</h1><span class="d-block"> Hot outside,</span><span class="d-block">Order Drinks</span>
        <div class="mt-5" ><h4 >Code : <span style="background-color:black">SUMMER </span></h4> </div>
    </div>
</div>


<form action="customerhomepage" style="display:inline-block;margin:0 0 30px 110px">
<h2 style="display:inline"><button type="submit" style="border-radius: 100%;border: 5px solid green;padding: 20px; height: 140px;width: 140px;display:inline;color:green"> ORDER </button></h2>
</form>


<form action="adminhomepage" style="display:inline-block;margin:0 0 30px 460px">
<h2 ><button type="submit" style="border-radius: 100%;padding: 15px;border: 5px solid red; height: 140px;width: 140px;display:inline;color:red">ADMIN</button>
</h2>
</form>




</form>
</body>
</html>