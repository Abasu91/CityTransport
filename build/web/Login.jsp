
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
<h2 style="margin-bottom:0; ">Please enter your email id and password to successfully login</h2></div>
<div id="content_login" style="background-color:#EEEEEE;height:1200px;width:1000px;float:left;">
    <form action="lauthenticate.jsp">
        <table>
            
            <tr><td><label id="epid"> <b>Email id:</b></label></td><td>  <input type="email" placeholder="xxx@yyy.com" name="T1" id="T1"></td></tr> 
            <tr><td><label id="epid"><b>Password:</b></label></td><td><input type="password" placeholder="******" name="T2" id="T2"></td></tr> 
            <tr><td><input type="submit" name="b2" id="b2" value="LOGIN"></td></tr>
        </table>
    </form>
   
    </body>
</html>
