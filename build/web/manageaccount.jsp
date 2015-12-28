
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script>
              function validate1(page)
        {
           var x=document.forms["k1"]["w1"].value;
           var y=document.forms["k1"]["w2"].value;
           var z=document.forms["k1"]["w3"].value;
           var w=document.forms["k1"]["w4"].value;
           
         alert(page);
           if(x== null ||x==""||y== null ||y==""||z== null ||z==""||w==null||z=="")
           {
             alert("You have one or multiple fields empty")
             alert(" Please fill to complete payment")
             return false;
             }
             document.k1.action=page;
             document.k1.submit();
             //fire();
        }
         function validate2(page1)
        {
           var x=document.forms["k2"]["j1"].value;
           var y=document.forms["k2"]["j2"].value;
           var z=document.forms["k2"]["j3"].value;
           var w=document.forms["k2"]["j4"].value;
           var p=document.forms["k2"]["j5"].value;
           var q=document.forms["k2"]["j6"].value;
           
           
           if(x== null ||x==""||y== null ||y==""||z== null ||z==""||w== null ||w=="")
           {
             alert("You have one or multiple fields empty")
             alert(" Please fill to complete payment")
             return false;
             }
             //fire();
             document.k2.action=page1;
             document.k2.submit();
        }
         
        
            function functionselect()
            {
                document.getElementById("intrabus").style.display="none";
                document.getElementById("interbus").style.display="none";
                
                var x=document.getElementById("ddl1").value;
                if(x=="A")
                    document.getElementById("intrabus").style.display="block";
                if(x=="B")
                    document.getElementById("interbus").style.display="block";
                
                    
            }
            function fire(){
                
                alert("Paid");
            }
        </script>
    </head>
    <body bgcolor="#E6E6FA">
       
        
        <div id="header" style="background-color:#FFA500; width:1350px; margin-top: -20px;">
<h1 style="margin-bottom:0; ">Select your Entity</h1><a href="adpower.jsp">HOME</a>"</div>
    
        <select id="ddl1" onChange="functionselect()">
        <option> select</option>   
        <option value="A">Intra City Bus</option>
        <option value="B">Inter City Bus</option>
        </select>
     <div id="intrabus" style="display:none;">
         <form action="/" method="post" name="k1">
         <table>
        <tr><td>Enter Source</td><td><input type="text" name="w1"></td></tr> 
        <tr><td>Enter Destination</td><td><input type="text" name="w2"></td></tr>
        <tr><td>Enter bus name</td><td><input type="text" name="w3"></td></tr>
        <tr><td>Enter fare</td><td><input type="text" name="w4"></td></tr>
        
         </table>
        
         <input type="submit" value="Addbus"  onClick=" return validate1('addintrabus.jsp')">
<!--         <input type="submit" value="Removebus"  onClick=" return validate1('removeintrabus.jsp')"></input>-->
         <input type="submit" value="Updatebus" onClick="return validate1('updateintrabus.jsp')"></input> 
          </form>
         
     </div>
          <div id="interbus" style="display:none;">
         <form action="/" method="post" name="k2">
         <table>
        <tr><td>Enter Source</td><td><input type="text" name="j1"></td></tr> 
        <tr><td>Enter Destination</td><td><input type="text" name="j2"></td></tr>
        <tr><td>Enter Type</td><td><input type="text" name="j3"></td></tr>
        <tr><td>Enter BusNumber</td><td><input type="text" name="j4"></td></tr>
        <tr><td>Enter fare</td><td><input type="text" name="j5"></td></tr>
        <tr><td></td><td><input  type="hidden" name="j6"></td></tr>
        
         </table>
        
         <input type="submit" value="Addbus"  onClick=" return validate2('addinterbus.jsp')">
<!--         <input type="submit" value="Removebus"  onClick=" return validate2('removeinterbus.jsp')"></input>-->
         <input type="submit" value="Updatebus" onClick="return validate2('updateinterbus.jsp')"></input>
          </form>
         
     </div>
        
   
     <br></br>
   
    </body>
</html>
