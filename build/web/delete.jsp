<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.activation.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <%
            try{         
            Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SYSTEM","Database#13");
                 System.out.println("connected");
           
String busname=request.getParameter("Id");
int s=Integer.parseInt(busname);
out.println(s);
PreparedStatement ps=con.prepareStatement("delete from interbus_details where BusNumber="+s);
int i=ps.executeUpdate();

//int i = st.executeUpdate("delete from interbus_details where number="+s+" ");
System.out.println(i);

if(i>0)
{
%>
<script type="text/javascript">
alert("You Have deleted Successfully!!!");
location.href="manageaccount.jsp";
</script>
<%
//System.out.println(u_name);
//response.sendRedirect("Login.jsp");
}

            }
            catch(Exception e) {System.out.println(e.getMessage()); }
%>
    </body>
</html>