


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
        <link type="text/css" rel="stylesheet" href="CityTransport.css" />
    </head>
    <body bgcolor=#F0F0FF>
        <div id="header" style="background-color:#FFA500; width:1500px">
            <h1 style="margin-bottom:0; ">Database Lookup Results</h1><a href="adpower.jsp">HOME</a></div>
        <%
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SYSTEM","Database#13");
         String tablename=request.getParameter("ddl1");
         PrintWriter out1=response.getWriter();
         Statement st = con.createStatement();
         String query ="select * from "+tablename;
ResultSet rs = st.executeQuery(query);
ResultSetMetaData rsmd = rs.getMetaData();

if(tablename.equals("userdtl"))
{

int columnsNumber = rsmd.getColumnCount();
%>
    <center><table  class="CSS_Table_Example" border="3" >
    <%
for(int i = 1 ; i <=columnsNumber; i++){ %>
<th><%= rsmd.getColumnName(i)%> </th>  
<% }
%>
<th>Action</th>
<%
while (rs.next()) { %>
<tr>
<% for(int i = 1 ; i < columnsNumber; i++){
    %>
    <td>
        <%=rs.getString(i)%></td>
   
    
<%
} %><td>*******</td> <td> <a href=<%= "\"delete.jsp?Id=" + rs.getString(4)  %>"\"" %>DELETE</a></TD>

<% 
    }
        %>
        </table></center>
        
        <%}
        
else{
    
int columnsNumber = rsmd.getColumnCount();
%>
    <center><table  class="CSS_Table_Example" border="3" >
    <%
for(int i = 1 ; i <= columnsNumber; i++){ %>
<th><%= rsmd.getColumnName(i)%> </th>  
<% }
%>
<th>Action</th>
<%
while (rs.next()) { %>
<tr>
<% for(int i = 1 ; i <= columnsNumber; i++){
    %>
    <td>
        <%=rs.getString(i)%></td>
   
    
<%
} %> <td> <a href=<%= "\"delete.jsp?Id=" + rs.getString(4)  %>"\"" %>DELETE</a></TD>

<% 
    }
        %>
        </table></center>
        
<% }
        %>
        

 
    </body>
</html>
