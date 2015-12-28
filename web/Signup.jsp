
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.activation.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="CityTransport.js"></script>
        <link  href="CityTransport.css" type="text/css" rel="stylesheet" />
        <!-- <script>
         function validate()
        {
           var x=document.forms["k1"]["t1"].value;
           var y=document.forms["k1"]["t2"].value;
           var z=document.forms["k1"]["t3"].value;
           var w=document.forms["k1"]["t4"].value;
           var p=document.forms["k1"]["t5"].value;
           if(x== null ||x==""||y== null ||y==""||z== null ||z==""||w== null ||w=="")
           {
             alert("You have one or multiple fields empty")
             alert(" Please complete Registration to login")
             return false;
             }
             if(w!=p){
                 alert("Passwords donot match")
                 return false;
             }
             }
      </script>-->
    </head>
    <body>
        <div id="header_sup" style="background-color:#FFA500; width:1500px">
<h1 style="margin-bottom:0; ">Register within seconds</h1></div>
<div id="content_sup" style="background-color:#EEEEEE;height:1200px;width:1000px;float:left;">
    <form action="insert.jsp" name="k1" onsubmit="return validate()" method="post"> 
        <table>
            <tr>

                <td>   First Name:</td><td> <input type="text"  name="t1" id="t1"></td></tr>
            <tr><td>Last Name:</td><td><input type="text" name="t2" id="t2"></td></tr>
            <tr><td>Email id:</td><td><input type="email" placeholder="xxx@yyy.com" name="t3" id="t3"></td></tr>
            <tr><td>Password:</td><td><input type="password" placeholder="********" name="t4" id="t4"></td></tr>
            <tr><td>Confirm Password:</td><td><input type="password" placeholder="********" name="t5" id="t5"></td></tr>
            <tr><td><input type="submit" name="b1" value="Signup"></td></tr>
        </table>
    </form>
    
    
</div>
    </body>
</html>
