package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.activation.DataSource;
import javax.naming.InitialContext;
import javax.naming.Context;
import java.sql.PreparedStatement;
import java.sql.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        ");

            try{         
            Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","SYSTEM","Database#13");
                 System.out.println("connected");
           

String u_name=request.getParameter("t1");
String l_name=request.getParameter("t2");
String u_email=request.getParameter("t3");
String u_password=request.getParameter("t4");
//PreparedStatement ps=con.prepareStatement("insert into user_details(u_name,l_name,u_email,u_password)values(?,?,?,?)");
Statement st = con.createStatement();

//ps.setString(1,u_name);
//ps.setString(2,l_name);
//ps.setString(3,u_email);
//ps.setString(4,u_password);

//int i=ps.executeUpdate();

int i = st.executeUpdate("insert into userdtl values('"+u_name+"','"+l_name+"','"+u_email+"','"+u_password+"')");
st.executeUpdate("commit");
out.println(i);

if(i>0)
{

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("alert(\"You Have Registered Successfully!!!\");\n");
      out.write("location.href=\"Login.jsp\";\n");
      out.write("</script>\n");

System.out.println(u_name);
//response.sendRedirect("Login.jsp");
}

else{
    
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        alert(\"Email id already exists\");\n");
      out.write("        location.href=\"Signup.jsp\";\n");
      out.write("    </script>\n");
      out.write("    ");

}


            }
            catch(Exception e) {System.out.println(e.getMessage()); }

      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
