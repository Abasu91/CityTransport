/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Section Intercity
function functionselect()
 {
     alert("Entered");
    document.getElementById("searchbus").style.display="none";
    document.getElementById("searchcar").style.display="none";
    var x=document.getElementById("ddl1").value;
     if(x==="A")
         alert("2");
        document.getElementById("searchbus").style.display="block";
     if(x==="B")
        document.getElementById("searchcar").style.display="block";
                    
  }
  
 //Section Signup
 
 function validate()
        {
           var x=document.forms["k1"]["t1"].value;
           var y=document.forms["k1"]["t2"].value;
           var z=document.forms["k1"]["t3"].value;
           var w=document.forms["k1"]["t4"].value;
           var p=document.forms["k1"]["t5"].value;
           if(x=== null ||x===""||y=== null ||y===""||z=== null ||z===""||w=== null ||w==="")
           {
             alert("You have one or multiple fields empty");
             alert(" Please complete Registration to login");
             return false;
             }
             if(w!==p){
                 alert("Passwords donot match");
                 return false;
             }
             }
function checkdate()
{
    var edate=document.getElementById("pdate").value;
    if (isValidDate(edate))
    {
        //document.getElementById("pdate").value=x;
    var parts = edate.split("/");
    var day = parseInt(parts[1], 10);
    //alert(day);
    var month = parseInt(parts[0], 10);
    var year = parseInt(parts[2], 10);
    var d=new Date(year,month-1,day);
    var f= ("00" + (d.getMonth() + 1)).slice(-2) + "/" + ("00" + d.getDate()).slice(-2) + "/" + d.getFullYear() ;
    document.getElementById("pdate").value=f;
    }
    
    else {
        alert("Not in format");
    }
}

function checkdate1(){
//    alert("Entered");
     var edate=document.getElementById("k4").value;
    if (isValidDate(edate))
    {
        //document.getElementById("pdate").value=x;
    var parts = edate.split("/");
    var day = parseInt(parts[1], 10);
    //alert(day);
    var month = parseInt(parts[0], 10);
    var year = parseInt(parts[2], 10);
    var d=new Date(year,month-1,day);
    var f= ("00" + (d.getMonth() + 1)).slice(-2) + "/" + ("00" + d.getDate()).slice(-2) + "/" + d.getFullYear() ;
    document.getElementById("ddate").value=f;
    }
    
    else {
        alert("Not in format");
    }
}

function checkdate2(){
//    alert("Entered");
     var edate1=document.getElementById("k4").value;
     var parts1 = edate1.split("/");
     var day1 = parseInt(parts1[0], 10);
     var month1 = parseInt(parts1[0], 10);
     var year1 = parseInt(parts1[2], 10);
     var d1=new Date(year1,month1-1,day1);
     var edate=document.getElementById("k5").value;
    if (isValidDate(edate))
    {
        //document.getElementById("pdate").value=x;
    var parts = edate.split("/");
    var day = parseInt(parts[1], 10);
    //alert(day);
    var month = parseInt(parts[0], 10);
    var year = parseInt(parts[2], 10);
    var d=new Date(year,month-1,day);
     if(d1<d)
     {
      var f= ("00" + (d.getMonth() + 1)).slice(-2) + "/" + ("00" + d.getDate()).slice(-2) + "/" + d.getFullYear() ;
      document.getElementById("ddate").value=f;
     }
    else{
        alert("Incorrect");
    }
     
  }
  
 }




    


function isValidDate(dateStr) {
    // Checks for the following valid date formats:
    // MM/DD/YY   MM/DD/YYYY   MM-DD-YY   MM-DD-YYYY
    // Also separates date into month, day, and year variables

    var datePat = /^(\d{1,2})(\/|-)(\d{1,2})\2(\d{2}|\d{4})$/;

    // To require a 4 digit year entry, use this line instead:
    // var datePat = /^(\d{1,2})(\/|-)(\d{1,2})\2(\d{4})$/;

    var matchArray = dateStr.match(datePat); // is the format ok?
    if (matchArray === null) {
        alert("Date is not in a valid format.");
        return false;
    }
    month = matchArray[1]; // parse date into variables
    day = matchArray[3];
    year = matchArray[4];
    if (month < 1 || month > 12) { // check month range
        alert("Month must be between 1 and 12.");
        return false;
    }
    if (day < 1 || day > 31) {
        alert("Day must be between 1 and 31.");
        return false;
    }
    if ((month==4 || month==6 || month==9 || month==11) && day==31) {
        alert("Month "+month+" doesn't have 31 days!")
        return false
    }
    if (month == 2) { // check for february 29th
        var isleap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        if (day>29 || (day==29 && !isleap)) {
            alert("February " + year + " doesn't have " + day + " days!");
            return false;
        }
    }
    return true;  // date is valid
}

//bookbus.jsp

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
            
//cards
function verifycardinfo(){
    alert("test");
    var x=document.getElementById("j1").value;
    alert(x);
    var fx=x.substring(0,1);
    if(fx!=0 && x.length==16)
    {
        alert("Valid Card details entered");
    }
    
    else
    {
        alert("Invalid Card Details");
    }
        
}

function verifycardcvv(){
    var x=document.getElementById("j2").value;
    if(x.length>3)
    {
        alert("Invalid CVV");
    }
}