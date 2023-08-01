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
      out.write("  <head>\n");
      out.write("    <title>CRUD System</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("<!--    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">-->\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/sty.css\">\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("<!--  <style>\n");
      out.write("        html {\n");
      out.write("    /*height: 100%;*/\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .container {\n");
      out.write("  position: relative;\n");
      out.write("  /*max-width: 600px;*/\n");
      out.write("  /*height: 500px;*/\n");
      out.write("  /*padding: 50px;*/\n");
      out.write("  color:#FF5733;\n");
      out.write("  /*text-align: center;*/\n");
      out.write("}\n");
      out.write(".row {\n");
      out.write("/*border: 1px solid #ccc;*/\n");
      out.write("display: block;\n");
      out.write("width: 100%;\n");
      out.write("/*height: 40px;*/\n");
      out.write("padding: 0 20px;\n");
      out.write("border-radius: 20px;\n");
      out.write("/*font-family: \"Muli-Bold\";*/\n");
      out.write("background: none; }\n");
      out.write(".form-control:focus {\n");
      out.write("border: 1px solid #ae3c33; }\n");
      out.write("  \n");
      out.write(".col-md-6 offset-md-3{\n");
      out.write("    color:#FF5733;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>-->\n");
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
      out.write("                    <a href=\"home.jsp\" class=\"btn\">DASHBOARD</a>\n");
      out.write("                    <a href=\"signup.jsp\" class=\"btn\">SIGN UP</a>\n");
      out.write("                    <a href=\"index.jsp\" class=\"btn\">Admission</a>\n");
      out.write("                    <a href=\"logout.jsp\" class=\"btn\">log out</a>\n");
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
