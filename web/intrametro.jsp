

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title> <link type="text/css" rel="stylesheet" href="CityTransport.css" />
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
        <%
         String h=(String)session.getAttribute("u_name");
           if(h==null)
  response.sendRedirect("Login.jsp");                       
 %>
        
       <% 

         Class.forName("oracle.jdbc.OracleDriver");
                 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SYSTEM","Database#13");
                 PreparedStatement ps=con.prepareStatement("select * from intrametro_details where  src=? and dest=?");
ps.setString(1,request.getParameter("r3"));
ps.setString(2,request.getParameter("r4"));
ResultSet rs=ps.executeQuery();
PreparedStatement ps1=con.prepareStatement("select * from intrametro_details where  src=? and dest=?");
ps1.setString(1,request.getParameter("r3"));
ps1.setString(2,request.getParameter("r4"));
ResultSet rs1=ps1.executeQuery();
 
	if(!rs1.next())
	{
            out.println("No trains were found");
        }
else
       {
        
         %>
          <div id="flip">SCROLL DOWN FOR RESULTS</div>
         <div id="panel">
         <table  class="CSS_Table_Example" margin-left: 150px;">
         
            <TR>
<!--               <TH>Source</TH>
               <TH>Destination</TH>-->
               <TH>Train Number</TH>
               <TH>Fare</TH>
               <TH>Frequency(mins)</TH>
               <TH>Zone</TH>
               <TH>Working Hours</TH>

           </TR>
           <%
           
 while(rs.next())
                         {
     %>
           <TR>
            
               <TD> <%= rs.getString(3) %> </TD>
               <TD> <%= rs.getString(4) %> </TD>
               <TD> <%= rs.getString(5) %> </TD>
               <TD> <%= rs.getString(6) %> </TD>
               <TD> <%= rs.getString(7) %> </TD>

           </TR>

       </table>
         </div>
               
       <BR>
       <% 
           }
         
}    
       %>
   

    </body>
</html>
