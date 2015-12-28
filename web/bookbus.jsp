

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script src="CityTransport.js"></script>
         <link type="text/css" rel="stylesheet" href="CityTransport.css" />
         
 <script>
function addTextBoxData(e){
    e.href = e.href + "?textbox=" + document.getElementById('w4').value;
}
</script>
        
    </head>
    <body bgcolor="#F9F9FF">
        <% String h=(String)session.getAttribute("u_name");
           System.out.println("hello"+h);
           if(h==null)
  response.sendRedirect("Login.jsp");                       
%> 
<div id="header_home" style="background-color:#0066CC; color:#E0E0FF"><h1>Booking Details</h1></div>
        <%
         String i=request.getParameter("Id");
         System.out.println(i);
 %>
 <table border="1" class="CSS_Table_Example" width="600" >
     <tr>
         <th>Busname</th>
          <th>Source</th>       
           <th>Destination</th>       
         <th>Fare</th>
     </tr>
     <tr>
         <td><%= request.getParameter("Id") %></td>
         <td><%= request.getParameter("source") %></td>
         <td><%= request.getParameter("destination") %></td>
         <td><%= request.getParameter("fare") %></td>
     </tr>
 </table>
      <h2 align="left" textcolor:blue> Select your mode of Payment</h2>
     <select id="ddl1" onChange="functionselect()" style="width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;">
        <option> select</option>   
    <option value="A">VISA</option>
    <option value="B">MASTERCARD</option>
    <option value="C">DD</option>
    </select>
     <div id="visa" style="display:none ">
          <form action="Payment.jsp" name="k1"  method="post"> 
               
              <h3>SELECT YOUR BANK</h3>     <select style="width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;">
            <option>select</option>
            <option>State Bank of India</option>
            <option>Axis Bank</option>
            <option>Punjab National Bank</option>
            </select>
              
         <table>
        <tr><td>Card Number</td><td><input type="text" name="w1" style="width:150px; height:30px; border-width: 2px 2px 2px 2px; border-radius:5px";></td></tr> 
        <tr><td>Card Verification number</td><td><input type="text" name="w2" style="width:150px;height:30px;border-width: 2px 2px 2px 2px; border-radius:5px";></td></tr>
        <tr><td>Expiry date</td><td><input type="date" name="w3" style="width:150px;height:30px;border-width: 2px 2px 2px 2px; border-radius:5px";></td></tr>
        <tr><td>Date of Booking</td><td><input type="text" name="w4" style="width:150px;height:30px;border-width: 2px 2px 2px 2px; border-radius:5px";></td></tr>
         </table>
             
        
<!--         <input type="submit" value="PAY"  onClick="validate1();return false;"></input>-->
         <%
         
         session.setAttribute("bdate",request.getParameter("w4"));
         %>
         <a href="pay.jsp?uname=<%=h%>&bname=<%= request.getParameter("Id")%>&src=<%= request.getParameter("source")%>&dest=<%= request.getParameter("destination") %>&fare=<%= request.getParameter("fare") %>&bdate=04/27/2015"  onclick="addTextBoxData(this)" >PAY</a>
          </form>
     </div>
      <div id="mastercard" style="display:none">
           <form action="Payment.jsp" name="k2"  method="post">
                
              <h3>SELECT YOUR BANK</h3>     <select style="width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;">
            <option>select</option>
            <option>State Bank of India</option>
            <option>Axis Bank</option>
            <option>Punjab National Bank</option>
            </select>
         <table>
             <tr><td>Card Number</td><td><input type="text" id="j1" name="j1" style="width:150px;height:30px;border-width: 2px 2px 2px 2px; border-radius:10px;" onchange="verifycardinfo();"></td></tr> 
        <tr><td>Card Verification number</td><td><input type="text" id="j2"name="j2" style="width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;" onchange="verifycardcvv()";></td></tr>
        <tr><td>Expiry date</td><td><input type="date" name="j3" style="width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;"></td></tr>
       
         </table>
           
          
          <input type="submit" value="PAY"  onClick="validate2();return false;"></input>
     </div>
      <div id="DemandDraft" style="display:none">
          <form action="Payment.jsp" name="k3"  method="post"> 
         <table>
        <tr><td>DD NO</td><td><input type="text" name="p1" style="width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;"></td></tr> 
       
         </table>
           
          <input type="submit" value="PAY"  onClick="validate3();return false;"></input>
     </div>
   
     <br></br>
   
    </body>
</html>
