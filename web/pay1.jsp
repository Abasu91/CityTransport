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
           

String u_name=(String)session.getAttribute("u_name");
String l_name=(String)session.getAttribute("l_name");
String fullName=u_name+" "+l_name;
String cno=request.getParameter("cno");
String src=request.getParameter("src");
String dest=request.getParameter("dest");
String fare=request.getParameter("fare");
String bdate=request.getParameter("bdate");
//PreparedStatement ps=con.prepareStatement("insert into user_details(u_name,l_name,u_email,u_password)values(?,?,?,?)");
Statement st = con.createStatement();

//ps.setString(1,u_name);
//ps.setString(2,l_name);
//ps.setString(3,u_email);
//ps.setString(4,u_password);

//int i=ps.executeUpdate();

int i = st.executeUpdate("insert into IntercarRecords values('"+u_name+"','"+cno+"','"+src+"','"+dest+"','"+bdate+"')");
st.executeUpdate("commit");
out.println(i);

if(i>0)
{
%>
<script type="text/javascript">
alert("You Have Payed Successfully!!!");
location.href="home.jsp";
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