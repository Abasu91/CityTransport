

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         
    </head>
    <body>
        
        <% 
        session.setAttribute("u_name", null);
        session.invalidate();
            
         response.sendRedirect("home.jsp");
        %>    
    </body>
</html>
