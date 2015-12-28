

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="header" style="background-color:#FFA500; width:1350px">
<h2 style="margin-bottom:0; ">Please enter your email id and password to successfully login</h2></div>
<div id="content" style="background-color:#EEEEEE;height:1200px;width:1000px;float:left;">
    <form action="adauthenticate.jsp">
        <table>
            <tr><td style="font-size:20px;font-family: Arial; ">Enter Id</td><td><input type="text" name="n1" placeholder="xxx@yyy.com"; style="height:20px;"></td></tr>
            <tr><td style="font-size:20px;font-family: Arial; ">Password</td><td><input type="password" name="n2" placeholder="********" ; style="height:20px;"></td></tr>
            <tr><td><input type="submit" value="Login" style="height:40px;border-radius:5px; width:100px; color:#0000FF; font-size:15px;"></td></tr>
           </table>
    </form>
    </body>
</html>
