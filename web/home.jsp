

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="CityTransport.css" /> 
       <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
    </head>
    <body>
          <div id="container" >

<div id="header_home"  style="background-color:#E9E9FF; margin-top: -20px;">
<h1 style="margin-bottom:0; color:#0066FF; ">FEDEX Online City Transport Services</h1>
 
</div>

<div id="menu_home">
    
        <b>Menu</b><br>
        
        <a href="Adsignup.jsp">Admin Login</a><br>
    <a href="Login.jsp">User Login </a><br>
<a href="Signup.jsp">Register</a><br>
<a href="aboutus.jsp">About us</a><br></div>

<div id="content_home">
    <h1>  View Book Travel</h1>
    <div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
<!--      <li data-target="#myCarousel" data-slide-to="3"></li>-->
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="img1.gif" alt="Bus" width="260" height="45">
      </div>

      <div class="item">
        <img src="img2.jpg" alt="Chania" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="img4.jpg" alt="Flower" width="460" height="345">
      </div>

<!--     <div class="item">
        <img src="img_flower2.jpg" alt="Flower" width="460" height="345">
      </div>-->
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
    

    </div>
                 

<div id="footer" style="background-color:#FFA500;clear:both;text-align:center;">
</div>


    </body>
</html>
