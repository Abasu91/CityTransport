package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manageaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <script>\n");
      out.write("              function validate1(page)\n");
      out.write("        {\n");
      out.write("           var x=document.forms[\"k1\"][\"w1\"].value;\n");
      out.write("           var y=document.forms[\"k1\"][\"w2\"].value;\n");
      out.write("           var z=document.forms[\"k1\"][\"w3\"].value;\n");
      out.write("           var w=document.forms[\"k1\"][\"w4\"].value;\n");
      out.write("           \n");
      out.write("         alert(page);\n");
      out.write("           if(x== null ||x==\"\"||y== null ||y==\"\"||z== null ||z==\"\"||w==null||z==\"\")\n");
      out.write("           {\n");
      out.write("             alert(\"You have one or multiple fields empty\")\n");
      out.write("             alert(\" Please fill to complete payment\")\n");
      out.write("             return false;\n");
      out.write("             }\n");
      out.write("             document.k1.action=page;\n");
      out.write("             document.k1.submit();\n");
      out.write("             //fire();\n");
      out.write("        }\n");
      out.write("         function validate2(page1)\n");
      out.write("        {\n");
      out.write("           var x=document.forms[\"k2\"][\"j1\"].value;\n");
      out.write("           var y=document.forms[\"k2\"][\"j2\"].value;\n");
      out.write("           var z=document.forms[\"k2\"][\"j3\"].value;\n");
      out.write("           var w=document.forms[\"k2\"][\"j4\"].value;\n");
      out.write("           var p=document.forms[\"k2\"][\"j5\"].value;\n");
      out.write("           var q=document.forms[\"k2\"][\"j6\"].value;\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           if(x== null ||x==\"\"||y== null ||y==\"\"||z== null ||z==\"\"||w== null ||w==\"\")\n");
      out.write("           {\n");
      out.write("             alert(\"You have one or multiple fields empty\")\n");
      out.write("             alert(\" Please fill to complete payment\")\n");
      out.write("             return false;\n");
      out.write("             }\n");
      out.write("             //fire();\n");
      out.write("             document.k2.action=page1;\n");
      out.write("             document.k2.submit();\n");
      out.write("        }\n");
      out.write("         \n");
      out.write("        \n");
      out.write("            function functionselect()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"intrabus\").style.display=\"none\";\n");
      out.write("                document.getElementById(\"interbus\").style.display=\"none\";\n");
      out.write("                \n");
      out.write("                var x=document.getElementById(\"ddl1\").value;\n");
      out.write("                if(x==\"A\")\n");
      out.write("                    document.getElementById(\"intrabus\").style.display=\"block\";\n");
      out.write("                if(x==\"B\")\n");
      out.write("                    document.getElementById(\"interbus\").style.display=\"block\";\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("            function fire(){\n");
      out.write("                \n");
      out.write("                alert(\"Paid\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#E6E6FA\">\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <div id=\"header\" style=\"background-color:#FFA500; width:1500px\">\n");
      out.write("<h1 style=\"margin-bottom:0; \">Select your Entity</h1><a href=\"adpower.jsp\">HOME</a>\"</div>\n");
      out.write("    \n");
      out.write("        <select id=\"ddl1\" onChange=\"functionselect()\">\n");
      out.write("        <option> select</option>   \n");
      out.write("        <option value=\"A\">Intra City Bus</option>\n");
      out.write("        <option value=\"B\">Inter City Bus</option>\n");
      out.write("        </select>\n");
      out.write("     <div id=\"intrabus\" style=\"display:none;\">\n");
      out.write("         <form action=\"/\" method=\"post\" name=\"k1\">\n");
      out.write("         <table>\n");
      out.write("        <tr><td>Enter Source</td><td><input type=\"text\" name=\"w1\"></td></tr> \n");
      out.write("        <tr><td>Enter Destination</td><td><input type=\"text\" name=\"w2\"></td></tr>\n");
      out.write("        <tr><td>Enter bus name</td><td><input type=\"text\" name=\"w3\"></td></tr>\n");
      out.write("        <tr><td>Enter fare</td><td><input type=\"text\" name=\"w4\"></td></tr>\n");
      out.write("        \n");
      out.write("         </table>\n");
      out.write("        \n");
      out.write("         <input type=\"submit\" value=\"Addbus\"  onClick=\" return validate1('addintrabus.jsp')\">\n");
      out.write("         <input type=\"submit\" value=\"Removebus\"  onClick=\" return validate1('removeintrabus.jsp')\"></input>\n");
      out.write("         <input type=\"submit\" value=\"Updatebus\" onClick=\"return validate1('updateintrabus.jsp')\"></input> \n");
      out.write("          </form>\n");
      out.write("         \n");
      out.write("     </div>\n");
      out.write("          <div id=\"interbus\" style=\"display:none;\">\n");
      out.write("         <form action=\"/\" method=\"post\" name=\"k2\">\n");
      out.write("         <table>\n");
      out.write("        <tr><td>Enter Source</td><td><input type=\"text\" name=\"j1\"></td></tr> \n");
      out.write("        <tr><td>Enter Destination</td><td><input type=\"text\" name=\"j2\"></td></tr>\n");
      out.write("        <tr><td>Enter Type</td><td><input type=\"text\" name=\"j3\"></td></tr>\n");
      out.write("        <tr><td>Enter Busname</td><td><input type=\"text\" name=\"j4\"></td></tr>\n");
      out.write("        <tr><td>Enter fare</td><td><input type=\"text\" name=\"j5\"></td></tr>\n");
      out.write("        <tr><td></td><td><input  type=\"hidden\" name=\"j6\"></td></tr>\n");
      out.write("        \n");
      out.write("         </table>\n");
      out.write("        \n");
      out.write("         <input type=\"submit\" value=\"Addbus\"  onClick=\" return validate2('addinterbus.jsp')\">\n");
      out.write("         <input type=\"submit\" value=\"Removebus\"  onClick=\" return validate2('removeinterbus.jsp')\"></input>\n");
      out.write("         <input type=\"submit\" value=\"Updatebus\" onClick=\"return validate2('updateinterbus.jsp')\"></input>\n");
      out.write("          </form>\n");
      out.write("         \n");
      out.write("     </div>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("     <br></br>\n");
      out.write("   \n");
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
