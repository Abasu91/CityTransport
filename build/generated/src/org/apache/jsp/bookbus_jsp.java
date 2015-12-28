package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookbus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <script src=\"CityTransport.js\"></script>\n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"CityTransport.css\" />\n");
      out.write("         \n");
      out.write(" <script>\n");
      out.write("function addTextBoxData(e){\n");
      out.write("    e.href = e.href + \"?textbox=\" + document.getElementById('w4').value;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#F9F9FF\">\n");
      out.write("        ");
 String h=(String)session.getAttribute("u_name");
           System.out.println("hello"+h);
           if(h==null)
  response.sendRedirect("Login.jsp");                       

      out.write(" \n");
      out.write("<div id=\"header_home\" style=\"background-color:#0066CC; color:#E0E0FF\"><h1>Booking Details</h1></div>\n");
      out.write("        ");

         String i=request.getParameter("Id");
         System.out.println(i);
 
      out.write("\n");
      out.write(" <table border=\"1\" class=\"CSS_Table_Example\" width=\"600\" >\n");
      out.write("     <tr>\n");
      out.write("         <th>Busname</th>\n");
      out.write("          <th>Source</th>       \n");
      out.write("           <th>Destination</th>       \n");
      out.write("         <th>Fare</th>\n");
      out.write("     </tr>\n");
      out.write("     <tr>\n");
      out.write("         <td>");
      out.print( request.getParameter("Id") );
      out.write("</td>\n");
      out.write("         <td>");
      out.print( request.getParameter("source") );
      out.write("</td>\n");
      out.write("         <td>");
      out.print( request.getParameter("destination") );
      out.write("</td>\n");
      out.write("         <td>");
      out.print( request.getParameter("fare") );
      out.write("</td>\n");
      out.write("     </tr>\n");
      out.write(" </table>\n");
      out.write("      <h2 align=\"left\" textcolor:blue> Select your mode of Payment</h2>\n");
      out.write("     <select id=\"ddl1\" onChange=\"functionselect()\" style=\"width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;\">\n");
      out.write("        <option> select</option>   \n");
      out.write("    <option value=\"A\">VISA</option>\n");
      out.write("    <option value=\"B\">MASTERCARD</option>\n");
      out.write("    <option value=\"C\">DD</option>\n");
      out.write("    </select>\n");
      out.write("     <div id=\"visa\" style=\"display:none \">\n");
      out.write("          <form action=\"Payment.jsp\" name=\"k1\"  method=\"post\"> \n");
      out.write("               \n");
      out.write("              <h3>SELECT YOUR BANK</h3>     <select style=\"width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;\">\n");
      out.write("            <option>select</option>\n");
      out.write("            <option>State Bank of India</option>\n");
      out.write("            <option>Axis Bank</option>\n");
      out.write("            <option>Punjab National Bank</option>\n");
      out.write("            </select>\n");
      out.write("              \n");
      out.write("         <table>\n");
      out.write("        <tr><td>Card Number</td><td><input type=\"text\" name=\"w1\" style=\"width:150px; height:30px; border-width: 2px 2px 2px 2px; border-radius:5px\";></td></tr> \n");
      out.write("        <tr><td>Card Verification number</td><td><input type=\"text\" name=\"w2\" style=\"width:150px;height:30px;border-width: 2px 2px 2px 2px; border-radius:5px\";></td></tr>\n");
      out.write("        <tr><td>Expiry date</td><td><input type=\"date\" name=\"w3\" style=\"width:150px;height:30px;border-width: 2px 2px 2px 2px; border-radius:5px\";></td></tr>\n");
      out.write("        <tr><td>Date of Booking</td><td><input type=\"text\" name=\"w4\" style=\"width:150px;height:30px;border-width: 2px 2px 2px 2px; border-radius:5px\";></td></tr>\n");
      out.write("         </table>\n");
      out.write("             \n");
      out.write("        \n");
      out.write("         <input type=\"submit\" value=\"PAY\"  onClick=\"validate1();return false;\"></input>\n");
      out.write("         ");

         
         session.setAttribute("bdate",request.getParameter("w4"));
         
      out.write("\n");
      out.write("         <a href=\"pay.jsp?uname=");
      out.print(h);
      out.write("&bname=");
      out.print( request.getParameter("Id"));
      out.write("&src=");
      out.print( request.getParameter("source"));
      out.write("&dest=");
      out.print( request.getParameter("destination") );
      out.write("&fare=");
      out.print( request.getParameter("fare") );
      out.write("&bdate=2/21/2015\"  onclick=\"addTextBoxData(this)\" >PAY</a>\n");
      out.write("          </form>\n");
      out.write("     </div>\n");
      out.write("      <div id=\"mastercard\" style=\"display:none\">\n");
      out.write("           <form action=\"Payment.jsp\" name=\"k2\"  method=\"post\">\n");
      out.write("                \n");
      out.write("              <h3>SELECT YOUR BANK</h3>     <select style=\"width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;\">\n");
      out.write("            <option>select</option>\n");
      out.write("            <option>State Bank of India</option>\n");
      out.write("            <option>Axis Bank</option>\n");
      out.write("            <option>Punjab National Bank</option>\n");
      out.write("            </select>\n");
      out.write("         <table>\n");
      out.write("             <tr><td>Card Number</td><td><input type=\"text\" id=\"j1\" name=\"j1\" style=\"width:150px;height:30px;border-width: 2px 2px 2px 2px; border-radius:10px;\" onchange=\"verifycardinfo();\"></td></tr> \n");
      out.write("        <tr><td>Card Verification number</td><td><input type=\"text\" id=\"j2\"name=\"j2\" style=\"width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;\" onchange=\"verifycardcvv()\";></td></tr>\n");
      out.write("        <tr><td>Expiry date</td><td><input type=\"date\" name=\"j3\" style=\"width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;\"></td></tr>\n");
      out.write("       \n");
      out.write("         </table>\n");
      out.write("           \n");
      out.write("          \n");
      out.write("          <input type=\"submit\" value=\"PAY\"  onClick=\"validate2();return false;\"></input>\n");
      out.write("     </div>\n");
      out.write("      <div id=\"DemandDraft\" style=\"display:none\">\n");
      out.write("          <form action=\"Payment.jsp\" name=\"k3\"  method=\"post\"> \n");
      out.write("         <table>\n");
      out.write("        <tr><td>DD NO</td><td><input type=\"text\" name=\"p1\" style=\"width:150px;height:30px;border-width: 3px 3px 3px 3px; border-radius:10px;\"></td></tr> \n");
      out.write("       \n");
      out.write("         </table>\n");
      out.write("           \n");
      out.write("          <input type=\"submit\" value=\"PAY\"  onClick=\"validate3();return false;\"></input>\n");
      out.write("     </div>\n");
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
