

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor=#EEEEFF>
        
        <div float:middle>
             <div id="header" style="background-color:#FFA500; width:1500px">
                 <h1 style="margin-bottom:0; ">Hello User,please select to view your choice</h1><a href="transport.jsp">HOME</a></div>

        <form action="usbrecord.jsp">
     <select name="ddl1" onChange="functionselect()" style="width:150px; height:30px; border-style: solid;border-color:#FF0000;margin-top:10px;"; >
        <option> select</option>
        <h1>Select your choice</h1>
    <option value="Interbusrecord">InterBusRecord</option>
    <option value="Intercarrecords">InterCar</option>
    
       
    </select>
        
        <input type="submit" value="search" style="width:100px; height:30px;border-bottom-radius:5px; ">
        </form>
        </div>
    </body>
</html>
