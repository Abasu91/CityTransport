<%-- 
    Document   : cab
    Created on : Apr 24, 2015, 10:00:31 PM
    Author     : ARIJIT
--%>


<%@page import="java.sql.Statement"%>
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
        <title>JSP Page</title>
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
                 String ID = request.getParameter("w1");
//                 Statement st = con.createStatement();
//                 ResultSet rs = st.executeQuery("select * from cab where pick_location='"+ID+"'");
                
                 PreparedStatement ps=con.prepareStatement("select * from cab where  pick_location=? ");
                 ps.setString(1,request.getParameter("w1"));
//                 ps.setString(2,request.getParameter("r4"));
                 ResultSet rs=ps.executeQuery();
                 PreparedStatement ps1=con.prepareStatement("select * from cab where  pick_location=? ");
                 ps1.setString(1,request.getParameter("w1"));
//ps1.setString(2,request.getParameter("r4"));
                 ResultSet rs1=ps1.executeQuery();
                 System.out.println(rs1.next());
 
	if(rs.next())
	{
            out.println("No cabs were found");
        }
else
       {
        
         %>
          <div id="flip">SCROLL DOWN FOR RESULTS</div>
         <div id="panel">
         <table BORDER="1" style="border-radius: 5px; background-color: deepskyblue; height: 120px;width:1000px; margin-left: 150px;">
         
            <TR>
<!--               <TH>Source</TH>
               <TH>Destination</TH>-->
               <TH>Service Name</TH>
               <TH>Pick Location</TH>
<!--               <TH>Frequency(mins)</TH>-->
               <TH>Base Fare</TH>
               <TH>Phone Number</TH>

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
