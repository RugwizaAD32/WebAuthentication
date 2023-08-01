package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.io.PrintWriter;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/home.jsp");
  }

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
      out.write("  <head>\n");
      out.write("    <title>CRUD System</title>\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/sty.css\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("      <img class=\"wave\" src=\"img/wave.png\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("  \n");
      out.write("<!--\t\t<div class=\"img\">\n");
      out.write("\t\t\t<img src=\"img/da.png\">\n");
      out.write("                        \n");
      out.write("\t\t</div>-->\n");
      out.write("          <strong></strong>\n");
      out.write("                    <br><br>\n");
      out.write("                     <h1 class=\"title\" id=\"signup\">DASHBOARD </h1>\n");
      out.write("              <div class=\"login-content\">\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                      \n");
      out.write("                    <a href=\"index.jsp\" class=\"btn\">ADD INFOS</a>\n");
      out.write("                    \n");
      out.write("                    <a href=\"update.jsp\" class=\"btn\">UPDATE </a>\n");
      out.write("                    \n");
      out.write("                    <a href=\"delete.jsp\" class=\"btn\">DELETE </a>\n");
      out.write("                    \n");
      out.write("                    <a href=\"View.jsp\" class=\"btn\">DISPLAY</a>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("       \n");
      out.write("           \n");
      out.write("              \n");
      out.write("            \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS -->\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

    HttpSession sess = request.getSession(false);
    PrintWriter out1 = response.getWriter();
// Check if the session exists and is still valid
    if (sess != null && sess.getAttribute("email") != null) {
        String sessionId = sess.getId();
        System.out.println("Session ID: " + sessionId + " on this email " + sess.getAttribute("email") + " is validate");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n");
      out.write("      integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles.css\" />\n");
      out.write("    <title>Update Information</title>\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("        html {\n");
      out.write("    /*height: 100%;*/\n");
      out.write("  }\n");
      out.write("  body {\n");
      out.write("      background-image: url(final.png);\n");
      out.write("      background-size: cover;\n");
      out.write("    /*margin:0;*/\n");
      out.write("    /*padding:0;*/\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    /*background: linear-gradient(#141e30, #243b55);*/\n");
      out.write("  }\n");
      out.write("  .container {\n");
      out.write("  position: relative;\n");
      out.write("  /*max-width: 600px;*/\n");
      out.write("  /*height: 500px;*/\n");
      out.write("  /*padding: 50px;*/\n");
      out.write("  color:#FF5733;\n");
      out.write("  /*text-align: center;*/\n");
      out.write("}\n");
      out.write(".form-control {\n");
      out.write("border: 1px solid #ccc;\n");
      out.write("display: block;\n");
      out.write("width: 100%;\n");
      out.write("height: 40px;\n");
      out.write("padding: 0 20px;\n");
      out.write("border-radius: 20px;\n");
      out.write("font-family: \"Muli-Bold\";\n");
      out.write("background: none; }\n");
      out.write(".form-control:focus {\n");
      out.write("border: 1px solid #ae3c33; }\n");
      out.write("  \n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h1 class=\"text-center my-5\">Update Information</h1>\n");
      out.write("      <form action=\"UpdateServlet\" method=\"post\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"id\">id</label>\n");
      out.write("          <input\n");
      out.write("            type=\"text\"\n");
      out.write("            class=\"form-control\"\n");
      out.write("            id=\"id\"\n");
      out.write("            name=\"id\"\n");
      out.write("            placeholder=\"Enter ID of the info you want to update\"\n");
      out.write("            required\n");
      out.write("          />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"fname\">Parent/Guardian Name</label>\n");
      out.write("          <input\n");
      out.write("            type=\"text\"\n");
      out.write("            class=\"form-control\"\n");
      out.write("            id=\"fname\"\n");
      out.write("            name=\"fname\"\n");
      out.write("            placeholder=\"Enter Parent/Guardian Name\"\n");
      out.write("            required\n");
      out.write("          />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"lname\">Parent/Guardian Email</label>\n");
      out.write("          <input\n");
      out.write("            type=\"text\"\n");
      out.write("            class=\"form-control\"\n");
      out.write("            id=\"email\"\n");
      out.write("            name=\"email\"\n");
      out.write("            placeholder=\"Enter Parent/Guardian Email \"\n");
      out.write("            required\n");
      out.write("          />\n");
      out.write("        </div>\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("          <label for=\"email\">Phone</label>\n");
      out.write("          <input\n");
      out.write("            type=\"text\"\n");
      out.write("            class=\"form-control\"\n");
      out.write("            id=\"phone\"\n");
      out.write("            name=\"phone\"\n");
      out.write("            placeholder=\"Enter Your phone \"\n");
      out.write("            required\n");
      out.write("          />\n");
      out.write("        </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("          <label for=\"email\">Religion</label>\n");
      out.write("          <input\n");
      out.write("            type=\"text\"\n");
      out.write("            class=\"form-control\"\n");
      out.write("            id=\"password\"\n");
      out.write("            name=\"password\"\n");
      out.write("            placeholder=\"Enter Your Religion \"\n");
      out.write("            required\n");
      out.write("          />\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Update</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    ");

    } else {
        // Session is invalid or has expired
        // Redirect to login page or show an error message
        out1.println("<script type=\"text/javascript\">");
        out1.println("alert('you need to login first');");
        out1.println("window.location.assign('login.jsp');");
        out1.println("</script>");
    }


      out.write("\n");
      out.write("      \n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
