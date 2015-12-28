package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intercity_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"CityTransport.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"CityTransport.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function functionselect()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"searchbus\").style.display=\"none\";\n");
      out.write("                document.getElementById(\"searchcar\").style.display=\"none\";\n");
      out.write("                var x=document.getElementById(\"ddl1\").value;\n");
      out.write("                if(x==\"A\")\n");
      out.write("                    document.getElementById(\"searchbus\").style.display=\"block\";\n");
      out.write("                if(x==\"B\")\n");
      out.write("                    document.getElementById(\"searchcar\").style.display=\"block\";\n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    <div style=\"background-color: #FF0F00\">\n");
      out.write("    <body>\n");
      out.write("        ");

         String h=(String)session.getAttribute("u_name");
           if(h==null)
  response.sendRedirect("Login.jsp");                       
 
      out.write("\n");
      out.write("        \n");
      out.write("         <div id=\"header\" style=\"background-color:#FFA500;\">\n");
      out.write("<h1 style=\"margin-bottom:0; \">Welcome to Intercity Services</h1></div>\n");
      out.write("<div id=\"menu\">\n");
      out.write("    \n");
      out.write("        <b>Menu</b><br>\n");
      out.write("        <a href=\" logout.jsp\">Logout </a><br>\n");
      out.write("        <a href=\"aboutus.jsp\"> About us</a>\n");
      out.write("        <div id=\"content\" style=\"background-color:#EEEEEE;height:1200px;width:1000px;float:left;\">\n");
      out.write("            <h1 id=\"h1\">Lawrence Tourism Service </h1>\n");
      out.write("    <h2 alighn=\"left\" textcolor:blue> Select your mode of Travel</h2>\n");
      out.write("     <select id=\"ddl1\" style=\"width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;\" onchange=\"functionselect()\">\n");
      out.write("        <option> select</option>   \n");
      out.write("    <option value=\"A\">BUS</option>\n");
      out.write("    <option value=\"B\">CAR</option>\n");
      out.write("    </select>\n");
      out.write("   \n");
      out.write("    <div id=\"searchbus\" style=\"display:none \">\n");
      out.write("         <form action=\"interbus.jsp\">\n");
      out.write("        <table>\n");
      out.write("            <tr><td>Source</td><td><select name=\"w1\" style=\"width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;\">\n");
      out.write("                        <option>Lawrence</option>\n");
      out.write("                        <option>Missouri</option>\n");
      out.write("                        <option>Chicago</option>\n");
      out.write("                    </select></td></tr> \n");
      out.write("        <tr><td>Destination</td><td><select name=\"w2\" style=\"width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;\">\n");
      out.write("             <option>Denver</option>\n");
      out.write("                        <option>Saltlake</option>\n");
      out.write("                        <option>NewYork</option>\n");
      out.write("                </select>\n");
      out.write("            </td></tr>\n");
      out.write("        <tr><td>Type(AC Volvo/Regular)</td><td><select ty=\"text\" name=\"w3\" style=\"width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;\">\n");
      out.write("             <option>AC</option>\n");
      out.write("             <option>Regular</option></select>\n");
      out.write("                \n");
      out.write("                        </td></tr>\n");
      out.write("        <tr><td><input type=\"submit\" name=\"c\" value=\"Find Buses\"></td></tr></table>\n");
      out.write("         </form>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    <div id=\"searchcar\" style=\"display:none\">\n");
      out.write("        <form action=\"intercar.jsp\">\n");
      out.write("        <div id=\"pickup\">\n");
      out.write("        <table>\n");
      out.write("                        <tr><td>Pickup Point</td><td><select id=\"k1\" name=\"k1\">\n");
      out.write("                                    <option>Lawrence</option>\n");
      out.write("                                    <option>Missouri</option>\n");
      out.write("                                    <option>Chicago</option>\n");
      out.write("                    </select></td></tr> \n");
      out.write("        <tr><td>Drop-off point</td><td><select id=\"k2\" name=\"k2\">\n");
      out.write("                    <option>Lawrence</option>\n");
      out.write("                    <option>Chicago</option>\n");
      out.write("                    <option>Saltlake</option>\n");
      out.write("                </select></td></tr>\n");
      out.write("                    <tr><td>Type(Sedan/Van)</td><td><select id=\"k3\" name=\"k3\">\n");
      out.write("                                <option>Sedan</option>\n");
      out.write("                                <option>Van</option>\n");
      out.write("                </select></td></tr>\n");
      out.write("                    <tr><td>Pickup Date(MM/DD/YYYY)</td><td><input type=\"text\" id=\"k4\" onchange=\"checkdate();\"></input> </td></tr>\n");
      out.write("                      <tr><td>Drop-off Date(MM/DD/YYYY)</td><td><input type=\"text\" id=\"k5\" onchange=\"checkdate();\"></input> </td></tr>\n");
      out.write("        <tr><td><input type=\"submit\" name=\"c\" value=\"Find Cars\" style=\"width:100px;height:20px;border-width: 1px 1px 1px 1px; border-radius:5px;\" ></td></tr>\n");
      out.write("       <!-- <label><b>Pickup Information:</b></label>\n");
      out.write("        <tr><td>Pick-up Date</td><td><input type=\"text\" id=\"pdate\" placeholder=\"MM/DD/YYYY\" onchange=\"checkdate();\"></td></tr> \n");
      out.write("        <tr><td>Pickup Time</td><td><select id=\"ptime\">\n");
      out.write("                    <option> </option>\n");
      out.write("                    <option>12:00AM</option>\n");
      out.write("                    <option>9:00AM</option>\n");
      out.write("                    <option>12:00PM</option>\n");
      out.write("                    <option>9:00PM</option>\n");
      out.write("                </select></td></tr>\n");
      out.write("         <tr><td>Pickup Location</td><td><select id=\"plocation\">\n");
      out.write("                    <option> </option>\n");
      out.write("                    <option>Airport</option>\n");
      out.write("                    <option>In-City</option>\n");
      out.write("                 </select></td></tr>\n");
      out.write("         <tr><td>Pick up City/Airport Name</td><td><input type=\"text\" name=\"k1\"></td></tr>\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"dropoff\">\n");
      out.write("            <table>\n");
      out.write("                <label><b>Drop off information:</b></label>\n");
      out.write("                \n");
      out.write("                <tr><td>Drop-off Date</td><td><input type=\"text\" id=\"ddate\" placeholder=\"MM/DD/YYYY\" onchange=\"checkdate1();\"></td></tr>     \n");
      out.write("         \n");
      out.write("           <tr><td>Drop off Time</td><td><select id=\"dtime\">\n");
      out.write("                    <option> </option>\n");
      out.write("                    <option>12:00AM</option>\n");
      out.write("                    <option>9:00AM</option>\n");
      out.write("                    <option>12:00PM</option>\n");
      out.write("                    <option>9:00PM</option>\n");
      out.write("                </select></td></tr>\n");
      out.write("         <tr><td>Drop-off Location</td><td><select id=\"dlocation\">\n");
      out.write("                    <option> </option>\n");
      out.write("                    <option>Airport</option>\n");
      out.write("                    <option>In-City</option>\n");
      out.write("                 </select></td></tr>\n");
      out.write("         <tr><td>Drop off City/Airport Name</td><td><input type=\"text\" name=\"k2\"></td></tr>\n");
      out.write("         <tr><td>Type(AC/Non-AC)</td><td><input type=\"text\" name=\"k3\"></td></tr>\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("            <table> <tr><td><input type=\"submit\" name=\"c\" id=\"c\" value=\"Find Cars\"></td></tr></table>  -->\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("        </div>\n");
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
