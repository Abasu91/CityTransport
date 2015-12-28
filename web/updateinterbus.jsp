
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <form action="saveinterbus.jsp" method="post">
      <table>
        <tr><td>Enter Source</td><td><input type="text" name="j1" value="<%=request.getParameter("j1")%>"> </td></tr> 
        <tr><td>Enter Destination</td><td><input type="text" name="j2"  value="<%=request.getParameter("j2")%>"></td></tr>
        <tr><td>Enter Type</td><td><input type="text" name="j3"  value="<%=request.getParameter("j3")%>"></td></tr>
        <tr><td>Enter BusNumber</td><td><input type="text" name="j4"  value="<%=request.getParameter("j4")%>"td></tr>
        <tr><td>Enter Fare</td><td><input type="text" name="j5" value="<%=request.getParameter("j5")%>"td></tr>
<!--        <tr><td>Enter fare</td><td><input type="text" name="j6" value="<%=request.getParameter("j6")%>"td></tr>-->
        
         </table>
        <input type="text"  hidden="true" name="o1" value="<%=request.getParameter("j1")%>"></input>
        <input type="text" hidden="true" name="o2" value="<%=request.getParameter("j2")%>"></input>
        <input type="text" hidden="true" name="o3" value="<%=request.getParameter("j3")%>"></input>
        <input type="text" hidden="true" name="o4" value="<%=request.getParameter("j4")%>"></input>
        <input type="text" hidden="true" name="o5" value="<%=request.getParameter("j5")%>"></input>
        <input type="text" hidden="true" name="o6" value="<%=request.getParameter("j6")%>"></input>


        <input type="submit" value="save"></input>
     </form>
           
    </body>
</html>
