package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"CityTransport.css\" /> \n");
      out.write("       <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("  .carousel-inner > .item > img,\n");
      out.write("  .carousel-inner > .item > a > img {\n");
      out.write("      width: 70%;\n");
      out.write("      margin: auto;\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <div id=\"container\" >\n");
      out.write("\n");
      out.write("<div id=\"header_home\"  style=\"background-color:#E9E9FF; margin-top: -20px;\">\n");
      out.write("<h1 style=\"margin-bottom:0; color:#0066FF; \">FEDEX Online City Transport Services</h1>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"menu_home\">\n");
      out.write("    \n");
      out.write("        <b>Menu</b><br>\n");
      out.write("        \n");
      out.write("        <a href=\"Adsignup.jsp\">Admin Login</a><br>\n");
      out.write("    <a href=\"Login.jsp\">User Login </a><br>\n");
      out.write("<a href=\"Signup.jsp\">Register</a><br>\n");
      out.write("<a href=\"aboutus.jsp\">About us</a><br></div>\n");
      out.write("\n");
      out.write("<div id=\"content_home\">\n");
      out.write("    <h1>  View Book Travel</h1>\n");
      out.write("    <div class=\"container\">\n");
      out.write("  <br>\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("<!--      <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>-->\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <img src=\"img1.gif\" alt=\"Bus\" width=\"260\" height=\"45\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"img2.jpg\" alt=\"Chania\" width=\"460\" height=\"345\">\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"img3.png\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("<!--     <div class=\"item\">\n");
      out.write("        <img src=\"img_flower2.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("      </div>-->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("                 \n");
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
