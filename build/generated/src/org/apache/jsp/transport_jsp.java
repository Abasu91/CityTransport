package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class transport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"CityTransport.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div id=\"header\">\n");
      out.write("         <h1 style=\"margin-bottom:0; \">Choose intracity as well intercity services</h1></div>\n");
      out.write("         ");
 String h=(String)session.getAttribute("u_name");
           if(h==null)
           response.sendRedirect("Login.jsp");                       
         
      out.write(" \n");
      out.write("       <div id=\"displayname\">\n");
      out.write("           <marquee><b>\n");
      out.write("        ");

          String name=session.getAttribute("u_name").toString();
          String name1=session.getAttribute("l_name").toString();          
          out.println("Welcome"+" "+name+" "+name1); 
        
      out.write("\n");
      out.write("               </b>\n");
      out.write("          </marquee>\n");
      out.write("      </div>\n");
      out.write("           \n");
      out.write("<div id=\"menu\">\n");
      out.write("    <b>Menu</b><br>\n");
      out.write("        <a href=\" logout.jsp\"> Logout </a><br>\n");
      out.write("        <a href=\"aboutus.jsp\"> About us</a>\n");
      out.write("    <div id=\"content\">\n");
      out.write("      <a href=\"intracity.jsp\"> FEDEX INTRACITY SUPPORT </a><br>\n");
      out.write("      <p> <h3>The fedex intracity support allows you to search for any daily mode of transport like bus, cab and metro.</h3> \n");
      out.write("      <p> <h3> Travel with ease.</h3>\n");
      out.write("\n");
      out.write("     <a href=\"intercity.jsp\">FEDEX INTERCITY SUPPORT</a>\n");
      out.write(" <p> <h3>The Fedex intracity support allows you to rent a transport as per your convenience.</h3>\n");
      out.write("    <p> <h3> Have happy times with your loved ones.</h3>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</div>\n");
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
