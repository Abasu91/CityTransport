

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="CityTransport.css" />
         <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
</script>

<script> 
$(document).ready(function(){
  $("#flip1").click(function(){
    $("#panel1").slideToggle("slow");
  });
});
</script>
 
<style type="text/css"> 
#panel1,#flip1
{
padding:5px;
text-align:center;
background-color:#e5eecc;
border:solid 1px #c3c3c3;
}
#panel1
{
padding:50px;
display:none;
}
</style>
    </head>
    <body> <%
         String h=(String)session.getAttribute("u_name");
           if(h==null)
  response.sendRedirect("Login.jsp");                       
 %>
        
        <%
        
         Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SYSTEM","Database#13");
                 PreparedStatement ps=con.prepareStatement("select * from intercar_details where  src=? and dest=? and type=?");
                 ps.setString(1,request.getParameter("k1"));
                 ps.setString(2,request.getParameter("k2"));
                 ps.setString(3,request.getParameter("k3"));
                 ResultSet rs=ps.executeQuery();
                 PreparedStatement ps1=con.prepareStatement("select * from intercar_details where  src=? and dest=? and type=?");
                 ps1.setString(1,request.getParameter("k1"));
                 ps1.setString(2,request.getParameter("k2"));
                 ps1.setString(3,request.getParameter("k3"));
                 ResultSet rs1=ps1.executeQuery();
                 System.out.println(rs1.next());
 
	if(rs1.next())
	{
            out.println("We donot have cars currently int his route");
        }
else
       {
        
         %>
         
          <div id="flip1">Lawrence Rental</div>
          <div id="panel1">
         <table class="CSS_Table_Example" style="border-radius:5px;">
            <TR>
               <TH>Source</TH>
               <TH>Destination</TH>
               <th>TYPE</th>
               <th>Distance</TH>
               <TH>Fare per Km</TH>
               <TH>VIN</TH>
               

           </TR>
         
         
                  

           <%
           
 while(rs.next())
                         {
     %>
    
           <TR>
                <TD> <%= rs.getString(1) %> </TD>
                <TD> <%= rs.getString(2) %> </TD>
                <TD> <%= rs.getString(3) %> </TD>
                <TD> <%= rs.getString(4) %> </TD>
                <TD> <%= rs.getString(5) %> </TD>
                <TD><%=  rs.getString(6) %></TD>
       
                <TD> <TD>  <a href=<%= "\"bookcar.jsp?src=" + rs.getString(1)  %>&det=<%=rs.getString(2)%>&dis=<%=rs.getString(4)%>&carno=<%=rs.getString(6)%>&type=<%=rs.getString(3)%>&fare=<%= rs.getString(5)+"\"" %>> BOOK</a></TD></TD>
           </TR>

      
               
       
       <% 
           }
         
}    
       %>
         </table>
          </div>
         
    </body>
</html>
