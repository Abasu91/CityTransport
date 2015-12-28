


<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <% 

        Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SYSTEM","Database#13");
                 
                 String source=request.getParameter("o1");
                 String destination=request.getParameter("o2");
                 String type=request.getParameter("o3");
                 String seat=request.getParameter("o4");
                 String fare=request.getParameter("o5");
                 
                 Statement st=con.createStatement();
                 int p =st.executeUpdate(" delete from interbus_details where src='"+source+"' and dest='"+destination+"' and type='"+type+"' and busnumber="+seat+" and fare='"+fare+"' ");
                 st.executeUpdate("commit");
                 String source1=request.getParameter("j1");
                 String destination1=request.getParameter("j2");
                 String type1=request.getParameter("j3");
                 String seat1=request.getParameter("j4");
                 String busname1=request.getParameter("j6");
                 String fare1=request.getParameter("j5");
                 int y =st.executeUpdate("insert into interbus_details values('"+source1+"','"+destination1+"','"+type1+"','"+seat1+"','"+fare1+"')");
                 %>
                 <script>
                     location.href="manageaccount.jsp";
                 </script>
    </body>
</html>
