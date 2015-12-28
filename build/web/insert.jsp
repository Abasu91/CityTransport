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
           

String u_name=request.getParameter("t1");
String l_name=request.getParameter("t2");
String u_email=request.getParameter("t3");
String u_password=request.getParameter("t4");
//PreparedStatement ps=con.prepareStatement("insert into user_details(u_name,l_name,u_email,u_password)values(?,?,?,?)");
Statement st = con.createStatement();

//ps.setString(1,u_name);
//ps.setString(2,l_name);
//ps.setString(3,u_email);
//ps.setString(4,u_password);

//int i=ps.executeUpdate();

int i = st.executeUpdate("insert into userdtl values('"+u_name+"','"+l_name+"','"+u_email+"','"+u_password+"')");
st.executeUpdate("commit");
out.println(i);

if(i>0)
{
%>
<script type="text/javascript">
alert("You Have Registered Successfully!!!");
location.href="Login.jsp";
</script>
<%
System.out.println(u_name);
//response.sendRedirect("Login.jsp");
}

else{
    %>
    <script type="text/javascript">
        alert("Email id already exists");
        location.href="Signup.jsp";
    </script>
    <%
}


            }
            catch(Exception e) {System.out.println(e.getMessage()); }
%>
    </body>
</html>