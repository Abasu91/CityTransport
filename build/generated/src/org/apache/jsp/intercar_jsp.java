package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class intercar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script> \n");
      out.write("$(document).ready(function(){\n");
      out.write("  $(\"#flip1\").click(function(){\n");
      out.write("    $(\"#panel1\").slideToggle(\"slow\");\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write(" \n");
      out.write("<style type=\"text/css\"> \n");
      out.write("#panel1,#flip1\n");
      out.write("{\n");
      out.write("padding:5px;\n");
      out.write("text-align:center;\n");
      out.write("background-color:#e5eecc;\n");
      out.write("border:solid 1px #c3c3c3;\n");
      out.write("}\n");
      out.write("#panel1\n");
      out.write("{\n");
      out.write("padding:50px;\n");
      out.write("display:none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body> ");

         String h=(String)session.getAttribute("u_name");
           if(h==null)
  response.sendRedirect("Login.jsp");                       
 
      out.write("\n");
      out.write("        \n");
      out.write("        ");

        
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
 
	if(!rs1.next())
	{
            out.println("We donot have cars currently int his route");
        }
else
       {
        
         
      out.write("\n");
      out.write("         \n");
      out.write("          <div id=\"flip1\">Lawrence Rental</div>\n");
      out.write("          <div id=\"panel1\">\n");
      out.write("         <table BORDER=\"1\" style=\"border-radius:5px;\">\n");
      out.write("            <TR>\n");
      out.write("               <TH>Source</TH>\n");
      out.write("               <TH>Destination</TH>\n");
      out.write("               <th>TYPE</th>\n");
      out.write("               <th>Distance</TH>\n");
      out.write("               <TH>Fare per Km</TH>\n");
      out.write("               <TH>VIN</TH>\n");
      out.write("               \n");
      out.write("\n");
      out.write("           </TR>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("                  \n");
      out.write("\n");
      out.write("           ");

           
 while(rs.next())
                         {
     
      out.write("\n");
      out.write("    \n");
      out.write("           <TR>\n");
      out.write("                <TD> ");
      out.print( rs.getString(1) );
      out.write(" </TD>\n");
      out.write("                <TD> ");
      out.print( rs.getString(2) );
      out.write(" </TD>\n");
      out.write("                <TD> ");
      out.print( rs.getString(3) );
      out.write(" </TD>\n");
      out.write("                <TD> ");
      out.print( rs.getString(4) );
      out.write(" </TD>\n");
      out.write("                <TD> ");
      out.print( rs.getString(5) );
      out.write(" </TD>\n");
      out.write("                <TD>");
      out.print(  rs.getString(6) );
      out.write("</TD>\n");
      out.write("       \n");
      out.write("                <TD> <TD>  <a href=");
      out.print( "\"bookcar.jsp?src=" + rs.getString(1)  );
      out.write("&det=");
      out.print(rs.getString(2));
      out.write("&dis=");
      out.print(rs.getString(4));
      out.write("&type=");
      out.print(rs.getString(3));
      out.write("&fare=");
      out.print( rs.getString(5)+"\"" );
      out.write("> BOOK</a></TD></TD>\n");
      out.write("           </TR>\n");
      out.write("\n");
      out.write("      \n");
      out.write("               \n");
      out.write("       \n");
      out.write("       ");
 
           }
         
}    
       
      out.write("\n");
      out.write("         </table>\n");
      out.write("          </div>\n");
      out.write("         \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
