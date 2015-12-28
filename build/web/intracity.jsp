

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.beans.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="CityTransport.css" />
        <title>JSP Page</title>
        <script>
            
           function functionselect()
           {
               document.getElementById("searchmetro").style.display="none";
               document.getElementById("searchbus").style.display="none";
               document.getElementById("taxi").style.display="none";
               var x=document.getElementById("ddl1").value;
               if(x=="A")
               {    document.getElementById("searchbus").style.display="block";
                   
               }
               if(x=="C")
               {    document.getElementById("searchmetro").style.display="block";
                   
               }
               if(x=="B")
                   {
                        document.getElementById("taxi").style.display="block";
                   }
           }
        </script>
    </head>
    
    <body>
        <%
         String h=(String)session.getAttribute("u_name");
           if(h==null)
  response.sendRedirect("Login.jsp");                       
 %>
        
        <div id="header" style="background-color:#FFA500; width:1500px">
<h1 style="margin-bottom:0; ">Welcome to Intracity Services</h1></div>
<div id="menu" style="background-color:#FFD700;height:1200px;width:200px;float:left;font-size:22px "/>
    
        <b>Menu</b><br>
        <a href=" logout.jsp">Logout </a><br>
        <a href="aboutus.jsp"> About us</a>
        <div id="content" style="background-color:#EEEEEE;height:1200px;width:1000px;float:left;">
    <h1 align="center " background-colour:#EEEEEE>Lawrence Public Transport </h1>
    <h2 alighn="left" textcolor:blue> Choose your desired transport</h2>
    <select id="ddl1" onChange="functionselect()">
        <option> select</option>   
    <option value="A">BUS</option>
    <option value="B">CAB</option>
    <option value="C">AMTRACK</option>
    
</select>
    <div id="searchbus" style="display:none ">
        <form action="intrabus.jsp">
        <table>
        <tr><td>Source</td><td><input type="text" name="r1"></td></tr> 
        <tr><td>Destination</td><td><input type="text" name="r2"></td></tr>
        <tr><td><input type="submit" name="b" value="Find Buses"></td></tr></table></form>
    </div>
    <div id="searchmetro" style="display:none ">
        <form action="intrametro.jsp">
        <table>
        <tr><td>Source Station</td><td><input type="text" name="r3"></td></tr> 
        <tr><td>Destination Station</td><td><input type="text" name="r4"></td></tr>
        <tr><td><input type="submit" name="b" value="SEARCH"></td></tr></table></form>
    </div>
    <div id="taxi" style="display:none">
        <form action="cab.jsp">
<!--        <h3>Details</h3>
        <table border="1">
            <tr><td >Booking fee</td><td>NA</td></tr>
            <tr><td >Minimum Fare</td><td> Rs 25</td></tr>
            <tr><td > Fare above Minimum Fare</td><td> Rs 12 per Km</td></tr>
            <tr><td >Waiting Charges per hour</td><td> NA</td></tr>
            <tr><td >Luggage Charges</td><td> Rs 20 extra for big luggages</td></tr>-->
<tr><td><label>PickUp Location</label><td><input type="text" id="w1"></input></td</tr>
<tr><td><input type="submit" name="b1" value="SEARCH"></td></tr></table></form>

</table></form>
<!--        <a href="taxichart.jsp">Contact details</a>-->
       
    </div>
</div>
  
    </body>
</html>
