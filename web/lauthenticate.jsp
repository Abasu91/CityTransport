

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
                 String u_email = request.getParameter("T1");
                 String u_password = request.getParameter("T2");
        System.out.println("hiiiiiii");
//PreparedStatement ps=con.prepareStatement("select * from user_details where u_email=? and u_password=?");
//ps.setString(1,request.getParameter("T1"));
//ps.setString(2,request.getParameter("T2"));
//ResultSet rs=ps.executeQuery();
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("select * from userdtl where u_email='"+u_email+"' and u_password='"+u_password+"'");
                
                 if(rs.next())
	{  
                //HttpSession session1=request.getSession(true);
		session.setAttribute("u_name",rs.getString(1));
		session.setAttribute("l_name",rs.getString(2));
		session.setAttribute("u_email",rs.getString(3));
               %>
		  <script type="text/javascript">
		alert("logged in");
                location.href="transport.jsp";
              </script>
              <%
		//response.sendRedirect("transport.jsp");
	}
	else
	{
                     System.out.println("done?");
		%>
		<script type="text/javascript">
		alert("Invalid Entry-Please Enter Proper USername OR Password....");
                location.href="Login.jsp"
		</script>
		<% 
		session.setAttribute("u_nam","Invalid Entry");
		//response.sendRedirect("Login.jsp");
	}

%>

    </body>
</html>
