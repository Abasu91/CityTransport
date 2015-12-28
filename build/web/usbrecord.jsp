


<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
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
    <body bgcolor="yellow">
        <div id="header" style="background-color:#FFA500; width:1500px">
            <h1 style="margin-bottom:0; ">History with Fedex</h1><a href="transport.jsp">TRAVEL</a></div>
        <%
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SYSTEM","Database#13");
         String tablename=request.getParameter("ddl1");
         PrintWriter out1=response.getWriter();
         Statement st = con.createStatement();
         String h=(String)session.getAttribute("u_name");
        
         out.println(h);
         
           if(h==null)
           response.sendRedirect("Login.jsp");                       
          
         //String query ="select * from interbusrecord where name like 'h'";
ResultSet rs = st.executeQuery("select * from "+tablename+"where name like '"+h+"%'" );
ResultSetMetaData rsmd = rs.getMetaData();

int columnsNumber = rsmd.getColumnCount();
%>
    <center><table border="3">
    <%
for(int i = 1 ; i <= columnsNumber; i++){ %>
<th><%= rsmd.getColumnName(i)%> </th>  
<% }
while (rs.next()) { %>
<tr>
<% for(int i = 1 ; i <= columnsNumber; i++){
    %>
    <td>
        <%=rs.getString(i)%></td>
    
<%
} %></tr>
<% 
    }
        %>
        </table></center>
        
    </body>
</html>
