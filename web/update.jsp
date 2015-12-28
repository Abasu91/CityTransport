
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.activation.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
       
    </head>
    <body>

                </div>
            </div>
        </div>
                        <hr/>
                        <form action="Updated.jsp" method="post" name="f1">
                        <%  
                        
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SYSTEM","soumyajit");
    String itemid=request.getParameter("code");
    session.setAttribute("itid",itemid);
    PreparedStatement ps;
    ps=con.prepareStatement("Select * from ITEMS where itemid='"+itemid+"'");
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {%>
        
            <div class="form-group"><label class="l1">ItemId<input type="text" readonly="readonly" name="t1" class="form-control" id="nameField"  value="<%=rs.getString(1)%>" /></label></div>
            <div class="form-group"><label class="l1">ItemImage<input type="text" name="t2" class="form-control" id="nameField" value="<%=rs.getString(2)%>" /></label></div>
            <div class="form-group"><label class="l1">ItemPrice<input type="text" name="t3" class="form-control" id="nameField" value="<%=rs.getString(3)%>" /></label></div>
            <div class="form-group"><label class="l1">ItemName<input type="text" name="t4" class="form-control" id="nameField" value="<%=rs.getString(4)%>"  /></label></div>
            <div class="form-group"><label class="l1">ItemType<input type="text" name="t5" class="form-control" id="nameField" value="<%=rs.getString(5)%>"  /></label></div>
            <div class="form-group"><label class="l1">Ingredients<textarea class="form-control" name="t6" id="nameField"  /><%=rs.getString(6)%></textarea></label></div>
            <%
        
    }
    
    
    %>
    <button type="submit" class="btn btn-primary" id="b1" name="b1" value="Update Item">Update Items </button>
                        <%
                        }  
                           
%>                            
                        
<div>
    <%
                            
                             if (s1==null)
                        {
                            out.print("</ul></div></div></div>");
                            out.println("<h1>Login to get Admin Facilities</h1>");
                        }
    %>
</div>               
                  
                        
        </form>
        
        
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </body>
</html>