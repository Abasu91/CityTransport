

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="CityTransport.css" />
        <script type="text/javascript" src="CityTransport.js"></script>
        <script>
            function functionselect()
            {
                document.getElementById("searchbus").style.display="none";
                document.getElementById("searchcar").style.display="none";
                var x=document.getElementById("ddl1").value;
                if(x=="A")
                    document.getElementById("searchbus").style.display="block";
                if(x=="B")
                    document.getElementById("searchcar").style.display="block";
                    
            }
        </script>
    <div style="background-color: #FF0F00">
    <body>
        <%
         String h=(String)session.getAttribute("u_name");
           if(h==null)
  response.sendRedirect("Login.jsp");                       
 %>
        
         <div id="header" style="background-color:#FFA500;">
<h1 style="margin-bottom:0; ">Welcome to Intercity Services</h1></div>
<div id="menu">
    
        <b>Menu</b><br>
        <a href=" logout.jsp">Logout </a><br>
        <a href="aboutus.jsp"> About us</a>
        <div id="content" style="background-color:#EEEEEE;height:1200px;width:1000px;float:left;">
            <h1 id="h1">Lawrence Tourism Service </h1>
    <h2 alighn="left" textcolor:blue> Select your mode of Travel</h2>
     <select id="ddl1" style="width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;" onchange="functionselect()">
        <option> select</option>   
    <option value="A">BUS</option>
    <option value="B">CAR</option>
    </select>
   
    <div id="searchbus" style="display:none ">
         <form action="interbus.jsp">
        <table>
            <tr><td>Source</td><td><select name="w1" style="width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;">
                        <option>Lawrence</option>
                        <option>Missouri</option>
                        <option>Chicago</option>
                    </select></td></tr> 
        <tr><td>Destination</td><td><select name="w2" style="width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;">
             <option>Denver</option>
                        <option>Saltlake</option>
                        <option>NewYork</option>
                </select>
            </td></tr>
        <tr><td>Type(AC Volvo/Regular)</td><td><select ty="text" name="w3" style="width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;">
             <option>AC</option>
             <option>Regular</option></select>
                
                        </td></tr>
        <tr><td><input type="submit" name="c" value="Find Buses"></td></tr></table>
         </form>
    </div>
   
    <div id="searchcar" style="display:none">
        <form action="intercar.jsp">
        <div id="pickup">
        <table>
                        <tr><td>Pickup Point</td><td><select id="k1" name="k1">
                                    <option>Lawrence</option>
                                    <option>Missouri</option>
                                    <option>Chicago</option>
                    </select></td></tr> 
        <tr><td>Drop-off point</td><td><select id="k2" name="k2">
                    <option>Lawrence</option>
                    <option>Chicago</option>
                    <option>Saltlake</option>
                </select></td></tr>
                    <tr><td>Type(Sedan/Van)</td><td><select id="k3" name="k3">
                                <option>Sedan</option>
                                <option>Van</option>
                </select></td></tr>
                    <tr><td>Pickup Date(MM/DD/YYYY)</td><td><input type="text" id="k4" onchange="checkdate();"></input> </td></tr>
                      <tr><td>Drop-off Date(MM/DD/YYYY)</td><td><input type="text" id="k5" onchange="checkdate();"></input> </td></tr>
        <tr><td><input type="submit" name="c" value="Find Cars" style="width:100px;height:20px;border-width: 1px 1px 1px 1px; border-radius:5px;" ></td></tr>
       <!-- <label><b>Pickup Information:</b></label>
        <tr><td>Pick-up Date</td><td><input type="text" id="pdate" placeholder="MM/DD/YYYY" onchange="checkdate();"></td></tr> 
        <tr><td>Pickup Time</td><td><select id="ptime">
                    <option> </option>
                    <option>12:00AM</option>
                    <option>9:00AM</option>
                    <option>12:00PM</option>
                    <option>9:00PM</option>
                </select></td></tr>
         <tr><td>Pickup Location</td><td><select id="plocation">
                    <option> </option>
                    <option>Airport</option>
                    <option>In-City</option>
                 </select></td></tr>
         <tr><td>Pick up City/Airport Name</td><td><input type="text" name="k1"></td></tr>
        
        </table>
        </div>
        <div id="dropoff">
            <table>
                <label><b>Drop off information:</b></label>
                
                <tr><td>Drop-off Date</td><td><input type="text" id="ddate" placeholder="MM/DD/YYYY" onchange="checkdate1();"></td></tr>     
         
           <tr><td>Drop off Time</td><td><select id="dtime">
                    <option> </option>
                    <option>12:00AM</option>
                    <option>9:00AM</option>
                    <option>12:00PM</option>
                    <option>9:00PM</option>
                </select></td></tr>
         <tr><td>Drop-off Location</td><td><select id="dlocation">
                    <option> </option>
                    <option>Airport</option>
                    <option>In-City</option>
                 </select></td></tr>
         <tr><td>Drop off City/Airport Name</td><td><input type="text" name="k2"></td></tr>
         <tr><td>Type(AC/Non-AC)</td><td><input type="text" name="k3"></td></tr>
        
        </table>
        </div>
            <table> <tr><td><input type="submit" name="c" id="c" value="Find Cars"></td></tr></table>  -->
            
        </form>
    </div>
    
   
        </div>
    </body>
</html>
