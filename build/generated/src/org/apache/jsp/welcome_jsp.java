package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>welcome</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/sty.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("<!--\t<img class=\"wave\" src=\"img/wave.png\">-->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"img\">\n");
      out.write("\t\t\t<img src=\"img/AP.png\">\t\n");
      out.write("\t\t</div>\n");
      out.write("            <div class=\"login-content\">\n");
      out.write("\t\t\n");
      out.write("                 <p>\n");
      out.write("                <strong>WELCOME TO WEBTECH</strong>\n");
      out.write("                <br><br><br>\n");
      out.write("                   We are your go-to source for the latest news, reviews, and insights on all things technology. \n");
      out.write("                        Our team of experts are constantly on the lookout for the newest gadgets, software, and trends, \n");
      out.write("                        so you can stay up-to-date on the ever-evolving world of tech.\n");
      out.write("                        <br><br>\n");
      out.write("                       Whether you're a tech enthusiast or just looking for some guidance on the latest tech products, \n");
      out.write("                       our website has everything you need. From smartphones to laptops, \n");
      out.write("                       from gaming to artificial intelligence, we cover it all.\n");
      out.write(" <br><br>\n");
      out.write("                 We also offer detailed reviews on the latest products and services, \n");
      out.write("                 so you can make informed decisions on your next purchase. And if you're looking for tech tips and tutorials, \n");
      out.write("                 we've got you covered there too\n");
      out.write("                        </p>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("\t\t<div class=\"login-content\">\n");
      out.write("                    \n");
      out.write("                    <a href=\"home.jsp\" class=\"btni\">DASHBOARD</a>\n");
      out.write("                    <a href=\"signup.jsp\" class=\"btni\">SIGN UP</a>\n");
      out.write("                    <a href=\"index.jsp\" class=\"btni\">Admission</a>\n");
      out.write("                    <a href=\"logout.jsp\" class=\"btni\">log out</a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
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
