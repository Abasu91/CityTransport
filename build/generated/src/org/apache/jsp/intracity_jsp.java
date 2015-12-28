package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class intracity_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("           function functionselect()\n");
      out.write("           {\n");
      out.write("               document.getElementById(\"searchmetro\").style.display=\"none\";\n");
      out.write("               document.getElementById(\"searchbus\").style.display=\"none\";\n");
      out.write("               document.getElementById(\"taxi\").style.display=\"none\";\n");
      out.write("               var x=document.getElementById(\"ddl1\").value;\n");
      out.write("               if(x==\"A\")\n");
      out.write("               {    document.getElementById(\"searchbus\").style.display=\"block\";\n");
      out.write("                   \n");
      out.write("               }\n");
      out.write("               if(x==\"C\")\n");
      out.write("               {    document.getElementById(\"searchmetro\").style.display=\"block\";\n");
      out.write("                   \n");
      out.write("               }\n");
      out.write("               if(x==\"B\")\n");
      out.write("                   {\n");
      out.write("                        document.getElementById(\"taxi\").style.display=\"block\";\n");
      out.write("                   }\n");
      out.write("           }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");

         String h=(String)session.getAttribute("u_name");
           if(h==null)
  response.sendRedirect("Login.jsp");                       
 
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"header\" style=\"background-color:#FFA500; width:1500px\">\n");
      out.write("<h1 style=\"margin-bottom:0; \">Welcome to Intracity Services</h1></div>\n");
      out.write("<div id=\"menu\" style=\"background-color:#FFD700;height:1200px;width:200px;float:left;font-size:22px \"/>\n");
      out.write("    \n");
      out.write("        <b>Menu</b><br>\n");
      out.write("        <a href=\" logout.jsp\">Logout </a><br>\n");
      out.write("        <a href=\"aboutus.jsp\"> About us</a>\n");
      out.write("        <div id=\"content\" style=\"background-color:#EEEEEE;height:1200px;width:1000px;float:left;\">\n");
      out.write("    <h1 align=\"center \" background-colour:#EEEEEE>Kolkata Public Transport Fares  </h1>\n");
      out.write("    <h2 alighn=\"left\" textcolor:blue> Choose your desired transport</h2>\n");
      out.write("    <select id=\"ddl1\" onChange=\"functionselect()\">\n");
      out.write("        <option> select</option>   \n");
      out.write("    <option value=\"A\">BUS</option>\n");
      out.write("    <option value=\"B\">CAB</option>\n");
      out.write("    <option value=\"C\">AMTRACK</option>\n");
      out.write("    \n");
      out.write("</select>\n");
      out.write("    <div id=\"searchbus\" style=\"display:none \">\n");
      out.write("        <form action=\"intrabus.jsp\">\n");
      out.write("        <table>\n");
      out.write("        <tr><td>Source</td><td><input type=\"text\" name=\"r1\"></td></tr> \n");
      out.write("        <tr><td>Destination</td><td><input type=\"text\" name=\"r2\"></td></tr>\n");
      out.write("        <tr><td><input type=\"submit\" name=\"b\" value=\"Find Buses\"></td></tr></table></form>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"searchmetro\" style=\"display:none \">\n");
      out.write("        <form action=\"intrametro.jsp\">\n");
      out.write("        <table>\n");
      out.write("        <tr><td>Source Station</td><td><input type=\"text\" name=\"r3\"></td></tr> \n");
      out.write("        <tr><td>Destination Station</td><td><input type=\"text\" name=\"r4\"></td></tr>\n");
      out.write("        <tr><td><input type=\"submit\" name=\"b\" value=\"SEARCH\"></td></tr></table></form>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"taxi\" style=\"display:none\">\n");
      out.write("        <form action=\"cab.jsp\">\n");
      out.write("<!--        <h3>Details</h3>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr><td >Booking fee</td><td>NA</td></tr>\n");
      out.write("            <tr><td >Minimum Fare</td><td> Rs 25</td></tr>\n");
      out.write("            <tr><td > Fare above Minimum Fare</td><td> Rs 12 per Km</td></tr>\n");
      out.write("            <tr><td >Waiting Charges per hour</td><td> NA</td></tr>\n");
      out.write("            <tr><td >Luggage Charges</td><td> Rs 20 extra for big luggages</td></tr>-->\n");
      out.write("<tr><td><label>PickUp Location</label><td><input type=\"text\" id=\"w1\"></input></td</tr>\n");
      out.write("<tr><td><input type=\"submit\" name=\"b1\" value=\"SEARCH\"></td></tr></table></form>\n");
      out.write("\n");
      out.write("</table></form>\n");
      out.write("<!--        <a href=\"taxichart.jsp\">Contact details</a>-->\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("  \n");
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
