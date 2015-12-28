
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link type="text/css" rel="stylesheet" href="CityTransport.css" />
        <title>JSP Page</title>
         <script>
              function validate1()
        {
           var x=document.forms["k1"]["w1"].value;
           var y=document.forms["k1"]["w2"].value;
           var z=document.forms["k1"]["w3"].value;
           
           
           if(x== null ||x==""||y== null ||y==""||z== null ||z=="")
           {
             alert("You have one or multiple fields empty")
             alert(" Please fill to complete payment")
             return false;
             }
             fire();
        }
         function validate2()
        {
           var x=document.forms["k2"]["j1"].value;
           var y=document.forms["k2"]["j2"].value;
           var z=document.forms["k2"]["j3"].value;
           
           
           if(x== null ||x==""||y== null ||y==""||z== null ||z=="")
           {
             alert("You have one or multiple fields empty")
             alert(" Please fill to complete payment")
             return false;
             }
             fire();
        }
         function validate3()
        {
           var x=document.forms["k3"]["p1"].value;
           
           
           
           if(x== null ||x=="")
           {
             alert("You have one or multiple fields empty")
             alert(" Please fill to complete payment")
             return false;
             }
             fire();
        }
        
            function functionselect()
            {
                document.getElementById("visa").style.display="none";
                document.getElementById("mastercard").style.display="none";
                document.getElementById("DemandDraft").style.display="none";
                var x=document.getElementById("ddl1").value;
                if(x=="A")
                    document.getElementById("visa").style.display="block";
                if(x=="B")
                    document.getElementById("mastercard").style.display="block";
                if(x=="C")
                    document.getElementById("DemandDraft").style.display="block";
                    
            }
            function fire(){
                
                alert("Paid");
            }
        </script>
    </head>
    <body bgcolor="#E6E6FA">
        <% String h=(String)session.getAttribute("u_name");
           if(h==null)
  response.sendRedirect("Login.jsp");                       
%> 
<i><h1 style="background-color:#FFA500; width:1500px">Booking Info</h1></i>
        <%
         int d=Integer.parseInt(request.getParameter("dis"));
         int f=Integer.parseInt(request.getParameter("fare"));
         System.out.println(d);
 %>
 <table border="1" class="CSS_Table_Example" border="3">
     <tr>
         <th>Source</th>       
           <th>Destination</th> 
           <th>Type</th>
         <th>Fare</th>
     </tr>
     <tr>
         <td><%= request.getParameter("src") %></td>
         <td><%= request.getParameter("det") %></td>
         <td><%=request.getParameter("type")%></td>
         <td><%=f*d%></td>
         
     </tr>
 </table>
         <i><h2 style="background-color:#FFA500; width:1500px"> Select your mode of Payment</h2></i>
     <select id="ddl1" onChange="functionselect()">
        <option> select</option>   
    <option value="A">VISA</option>
    <option value="B">MASTERCARD</option>
    <option value="C">DD</option>
    </select>
     <div id="visa" style="display:none ">
         <h3>SELECT YOUR BANK</h3>     <select>
            <option>select</option>
            <option>Commerce Bank</option>
            <option>Bank of America</option>
            <option>US Bank</option>
            </select>
          <form action="Payment.jsp" name="k1"  method="post"> 
         <table>
        <tr><td>Card Number</td><td><input type="text" name="w1"></td></tr> 
        <tr><td>Card Verification number</td><td><input type="text" name="w2"></td></tr>
        <tr><td>Expiry date</td><td><input type="date" name="w3"></td></tr>
        <tr><td>Booking Date</td><td><input type="text" name="w4"></td></tr>
       
        
        
         </table>
        
<!--         <input type="submit" value="PAY"  onClick="validate1();return false;"></input>-->
 <a href="pay1.jsp?uname=<%=h%>&cno=<%= request.getParameter("carno")%>&src=<%= request.getParameter("src")%>&dest=<%= request.getParameter("det") %>&fare=<%= request.getParameter("fare") %>&bdate=4/27/2015">PAY</a>
          </form>
     </div>
      <div id="mastercard" style="display:none">
          <h3>SELECT YOUR BANK</h3>     <select>
            <option>select</option>
            <option>US Bank</option>
            <option>Commerce Bank</option>
            <option>Bank of America</option>
            </select>
           <form action="Payment.jsp" name="k2"  method="post"> 
         <table>
        <tr><td>Card Number</td><td><input type="text" name="j1"></td></tr> 
        <tr><td>Card Verification number</td><td><input type="text" name="j2"></td></tr>
        <tr><td>Expiry date</td><td><input type="date" name="j3"></td></tr>
         </table>
          
          <input type="submit" value="PAY"  onClick="validate2();return false;"></input>
     </div>
      <div id="DemandDraft" style="display:none">
          <form action="Payment.jsp" name="k3"  method="post"> 
         <table>
        <tr><td>DD NO</td><td><input type="text" name="p1"></td></tr> 
       
         </table>
           
          <input type="submit" value="PAY"  onClick="validate3();return false;"></input>
          
     </div>
   
     <br></br>
   
    </body>
</html>
