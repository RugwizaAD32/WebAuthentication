package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navigator_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <style>\n");
      out.write("        *,\n");
      out.write("        ::before,\n");
      out.write("        ::after {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            width: 400px;\n");
      out.write("            height: 100vh;\n");
      out.write("            box-shadow: 12px 12px 15px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logo {\n");
      out.write("            justify-self: center;\n");
      out.write("            align-self: center;\n");
      out.write("            margin-top: 3em;\n");
      out.write("            width: 40%;\n");
      out.write("            height: 22%;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logo img {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            border-radius: 50%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-element {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 10vh;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-element button {\n");
      out.write("            all: unset;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: aliceblue;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .break {\n");
      out.write("            margin-top: 3em;\n");
      out.write("            justify-self: center;\n");
      out.write("            align-self: center;\n");
      out.write("            width: 80%;\n");
      out.write("            border-bottom: 3px solid orangered;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logout-sec {\n");
      out.write("            display: flex;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 22%;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-content: center;\n");
      out.write("            gap: 5%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logout {\n");
      out.write("            width: 20%;\n");
      out.write("            height: 50%;\n");
      out.write("            background-color: brown;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            margin: 2em 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .name {\n");
      out.write("            justify-self: center;\n");
      out.write("            align-self: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <img src=\"../imgs/logoPageDone.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-element\">\n");
      out.write("                <button type=\"submit\">DASHBOARD</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-element\">\n");
      out.write("                <button type=\"submit\">ADMISSION</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-element\">\n");
      out.write("                <button type=\"submit\">ACCOUNT</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-element\">\n");
      out.write("                <button type=\"submit\">CONTACT US</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"break\"></div>\n");
      out.write("            <div class=\"logout-sec\">\n");
      out.write("                <div class=\"logout\"></div>\n");
      out.write("                <div class=\"name\">LOGOUT</div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
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
