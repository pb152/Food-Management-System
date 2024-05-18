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
           
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>

<body>
<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-dark text-white" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <div class="mb-md-5 mt-md-4 pb-5">

              <h2 class="fw-bold mb-2 text-uppercase">Add Admin </h2>
              <p class="text-white-50 mb-5">Please enter login and password!</p>
		<form action="adminsuccessAdd">
				
              <div class="form-outline form-white mb-4">
                <input type="text" name="admin_username" id="typeEmailX" class="form-control form-control-lg" placeholder=" Enter Username" required />
              </div>

              <div class="form-outline form-white mb-4">
                <input type="password" name="admin_password" id="typePasswordX" class="form-control form-control-lg" placeholder=" Enter Password" required />            
              </div>

              <button  class="btn btn-outline-light btn-lg px-5" type="submit">Add</button>

             </form>
            </div>

            <div>
              <p class="mb-0">Have a nice day !</p>
            </div>

          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>