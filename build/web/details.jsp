

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
                 <h1 style="margin-bottom:0; ">Hello Admin,please select to view your choice</h1><a href="adpower.jsp">HOME</a></div>

        <form action="info.jsp">
     <select name="ddl1" onChange="functionselect()" style="width:150px; height:30px; border-style: solid;border-color:#FF0000;margin-top:10px;"; >
        <option> select</option>
        <h1>Select your choice</h1>
    <option value="userdtl">userdtl</option>
    <option value="intrabus_details">intrabus</option>
     <option value="intrametro_details">intrametro</option>
      <option value="interbus_details">interbus</option>
       <option value="intercar_details">intercar</option>
       <option value="intercarrecords">intercarrecord</option>
       <option value="interbusrecord">interbusrecord</option>
       
    </select>
        
        <input type="submit" value="search" style="width:100px; height:30px;border-bottom-radius:5px; ">
        </form>
        </div>
    </body>
</html>
