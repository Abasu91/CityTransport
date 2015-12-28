
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>

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
  $("#flip").click(function(){
    $("#panel").slideToggle("slow");
  });
});
</script>
 
<style type="text/css"> 
#panel,#flip
{
padding:5px;
text-align:center;
background-color:#e5eecc;
border:solid 1px #c3c3c3;
}
#panel
{
padding:50px;
display:none;
}
</style>

    </head>
    <body>
        <% String h=(String)session.getAttribute("u_name");
           if(h==null)
  response.sendRedirect("Login.jsp");                       
%> 
        <%
         Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SYSTEM","Database#13");
                 PreparedStatement ps=con.prepareStatement("select * from interbus_details where  src=? and dest=? and type=?");
                 ps.setString(1,request.getParameter("w1"));
                 ps.setString(2,request.getParameter("w2"));
                 ps.setString(3,request.getParameter("w3"));
                 ResultSet rs=ps.executeQuery();
                 PreparedStatement ps1=con.prepareStatement("select * from interbus_details where  src=? and dest=? and type=?");
                 ps1.setString(1,request.getParameter("w1"));
                 ps1.setString(2,request.getParameter("w2"));
                 ps1.setString(3,request.getParameter("w3"));
                 ResultSet rs1=ps1.executeQuery();
 
	if(!rs1.next())
	{
            out.println("No buses were found");
        }
else
       {
        
         %>
         <div id="flip">SCROLL DOWN FOR RESULTS</div>
         <div id="panel">
         <table class="CSS_Table_Example" height: 120px;width="600"; margin-left: 150px;">
            <TR>
               <TH>Source</TH>
               <TH>Destination</TH>
               <th>TYPE</th>
               <TH>Bus No</TH>
               <TH>Fare</TH>

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
                
                <TD>  <a href=<%= "\"bookbus.jsp?Id=" + rs.getString(4)  %>&source=<%=rs.getString(1)%>&destination=<%=rs.getString(2)%>&fare=<%= rs.getString(5)+"\"" %>> BOOK</a></TD>

           </TR>

      
               
       
       <% 
           }
         
}    
       %>
         </table>
         </div>
        <!--<div id="flip">LAWRENCE BUS SERVICE</div>
<div id="panel">Travel with Comfort and Speed </div>-->

    </body>
</html>
