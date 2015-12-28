

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.activation.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="CityTransport.css" />
    </head>
    <body>
          <div id="header_login" style="background-color:#FFA500; width:1500px">
<h2 style="margin-bottom:0; ">Find Specific Records:</h2></div>
<div id="content_login" style="background-color:#EEEEEE;height:1200px;width:1000px;float:left;">
    <form action="lauthenticate.jsp">
        <table>
            <tr><td><a href="spcl.jsp" style="font-size:25px;"><b><i>Find list of customers who prefer using AC InterBus travel</i></b> </a></td><tr>
                <tr><td><a href="spcl2.jsp" style="font-size:25px;"><b><i>Find list of customers who booked services(car/bus) on the same date and travelled to Saltlake </i></b> </a></td><tr>
                <tr><td><a href="spcl1.jsp" style="font-size:25px;"><b><i>Find list of customers who prefer using a Sedan to a Van in Rental travel</i></b> </a></td><tr>
           
        </table>
    </form>
   
    </body>
</html>
