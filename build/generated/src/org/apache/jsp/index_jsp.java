package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("          <div id=\"container\" >\n");
      out.write("\n");
      out.write("<div id=\"header\" style=\"background-color:#FFA500; width:1500px\">\n");
      out.write("<h1 style=\"margin-bottom:0; \">FEDEX Online City Transport Services</h1></div>\n");
      out.write("\n");
      out.write("<div id=\"menu\" style=\"background-color:#FFD700;height:1200px;width:200px;float:left;font-size:22px \">\n");
      out.write("    \n");
      out.write("        <b>Menu</b><br>\n");
      out.write("        \n");
      out.write("        <a href=\"Adsignup.jsp\">Admin Login</a><br>\n");
      out.write("    <a href=\" Login.jsp\">  User Login </a><br>\n");
      out.write("<a href=\"Signup.jsp\">Register</a><br>\n");
      out.write("<a href=\"aboutus.jsp\">About us</a><br></div>\n");
      out.write("\n");
      out.write("<div id=\"content\" style=\"background-color:#EEEEEE;height:1200px;width:1000px;float:left;\">\n");
      out.write("    <h1 align=\"center \" background-colour:#EEEEEE>  View Book Travel</h1>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"footer\" style=\"background-color:#FFA500;clear:both;text-align:center;\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
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