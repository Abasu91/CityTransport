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
           

String source=request.getParameter("j1");
String destination=request.getParameter("j2");
String type=request.getParameter("j3");
String busno=request.getParameter("j4");
int s=Integer.parseInt(busno);
String fare=request.getParameter("j5");
int f=Integer.parseInt(fare);
//String busname=request.getParameter("j6");
//PreparedStatement ps=con.prepareStatement("insert into user_details(u_name,l_name,u_email,u_password)values(?,?,?,?)");
Statement st = con.createStatement();

//ps.setString(1,u_name);
//ps.setString(2,l_name);
//ps.setString(3,u_email);
//ps.setString(4,u_password);

//int i=ps.executeUpdate();

int i = st.executeUpdate("insert into interbus_details values('"+source+"','"+destination+"','"+type+"','"+s+"','"+f+"')");
st.executeUpdate("commit");
out.println(i);

if(i>0)
{
%>
<script type="text/javascript">
alert("You Have added Successfully!!!");
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