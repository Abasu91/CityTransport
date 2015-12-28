package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body bgcolor=#EEEEFF>\n");
      out.write("        \n");
      out.write("        <div float:middle>\n");
      out.write("             <div id=\"header\" style=\"background-color:#FFA500; width:1500px\">\n");
      out.write("                 <h1 style=\"margin-bottom:0; \">Hello User,please select to view your choice</h1><a href=\"transport.jsp\">HOME</a></div>\n");
      out.write("\n");
      out.write("        <form action=\"usbrecord.jsp\">\n");
      out.write("     <select name=\"ddl1\" onChange=\"functionselect()\" style=\"width:150px; height:30px; border-style: solid;border-color:#FF0000;margin-top:10px;\"; >\n");
      out.write("        <option> select</option>\n");
      out.write("        <h1>Select your choice</h1>\n");
      out.write("    <option value=\"Interbusrecord\">InterBusRecord</option>\n");
      out.write("    <option value=\"Intercarrecords\">InterCar</option>\n");
      out.write("    \n");
      out.write("       \n");
      out.write("    </select>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"search\" style=\"width:100px; height:30px;border-bottom-radius:5px; \">\n");
      out.write("        </form>\n");
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
