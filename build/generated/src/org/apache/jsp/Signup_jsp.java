package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.naming.InitialContext;
import java.sql.Connection;
import javax.activation.DataSource;
import javax.naming.Context;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"CityTransport.js\"></script>\n");
      out.write("        <link  href=\"CityTransport.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- <script>\n");
      out.write("         function validate()\n");
      out.write("        {\n");
      out.write("           var x=document.forms[\"k1\"][\"t1\"].value;\n");
      out.write("           var y=document.forms[\"k1\"][\"t2\"].value;\n");
      out.write("           var z=document.forms[\"k1\"][\"t3\"].value;\n");
      out.write("           var w=document.forms[\"k1\"][\"t4\"].value;\n");
      out.write("           var p=document.forms[\"k1\"][\"t5\"].value;\n");
      out.write("           if(x== null ||x==\"\"||y== null ||y==\"\"||z== null ||z==\"\"||w== null ||w==\"\")\n");
      out.write("           {\n");
      out.write("             alert(\"You have one or multiple fields empty\")\n");
      out.write("             alert(\" Please complete Registration to login\")\n");
      out.write("             return false;\n");
      out.write("             }\n");
      out.write("             if(w!=p){\n");
      out.write("                 alert(\"Passwords donot match\")\n");
      out.write("                 return false;\n");
      out.write("             }\n");
      out.write("             }\n");
      out.write("      </script>-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header_sup\" style=\"background-color:#FFA500; width:1500px\">\n");
      out.write("<h1 style=\"margin-bottom:0; \">Register within seconds</h1></div>\n");
      out.write("<div id=\"content_sup\" style=\"background-color:#EEEEEE;height:1200px;width:1000px;float:left;\">\n");
      out.write("    <form action=\"insert.jsp\" name=\"k1\" onsubmit=\"return validate()\" method=\"post\"> \n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("                <td>   First Name:</td><td> <input type=\"text\"  name=\"t1\" id=\"t1\"></td></tr>\n");
      out.write("            <tr><td>Last Name:</td><td><input type=\"text\" name=\"t2\" id=\"t2\"></td></tr>\n");
      out.write("            <tr><td>Email id:</td><td><input type=\"email\" placeholder=\"xxx@yyy.com\" name=\"t3\" id=\"t3\"></td></tr>\n");
      out.write("            <tr><td>Password:</td><td><input type=\"password\" placeholder=\"********\" name=\"t4\" id=\"t4\"></td></tr>\n");
      out.write("            <tr><td>Confirm Password:</td><td><input type=\"password\" placeholder=\"********\" name=\"t5\" id=\"t5\"></td></tr>\n");
      out.write("            <tr><td><input type=\"submit\" name=\"b1\" value=\"Signup\"></td></tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</div>\n");
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
