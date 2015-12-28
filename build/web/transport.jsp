
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link type="text/css" rel="stylesheet" href="CityTransport.css" />
    </head>
    <body>
         <div id="header">
             <h1 style="margin-bottom:0; "><i>Select from our classy intercity as well as intracity services</i></h1></div>
         <% String h=(String)session.getAttribute("u_name");
           if(h==null)
           response.sendRedirect("Login.jsp");                       
         %> 
       <div id="displayname">
           <marquee><b>
        <%
          String name=session.getAttribute("u_name").toString();
          String name1=session.getAttribute("l_name").toString();          
          out.println("Welcome"+" "+name+" "+name1); 
        %>
               </b>
          </marquee>
      </div>
           
<div id="menu">
    <b>Menu</b><br>
<!--    <a href="bdetails.jsp">Past Travel</a><br>  -->
        <a href=" logout.jsp"> Logout </a><br>
        <a href="aboutus.jsp"> About us</a>
    <div id="content" >
      <a href="intracity.jsp"> <img src="img7.gif" height='337' width='504'> </a><br>
      <p> <h3><i>The fedex intracity support allows you to search for any daily mode of transport like bus, cab and metro.</i></h3> 
      <p> <h3> <i>Travel with ease</i>.</h3>
     

     <a href="intercity.jsp"> <img src="img4.jpg" height='337' width='504' ></a>
     <p> <h3><i>The Fedex intracity support allows you to rent a transport as per your convenience.</i></h3>
     <p> <h3> <i>Have happy times with your loved ones.</i></h3>

    
</div>

    </body>
</html>
