package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <title>Login Form</title>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\t\t// Define the translations for each language\n");
      out.write("\t\tvar translations = {\n");
      out.write("\t\t\t'en': {\n");
      out.write("\t\t\t\t'login': 'LOGIN',\n");
      out.write("                                'email': 'Email',\n");
      out.write("\t\t\t\t'pass': 'password',\n");
      out.write("\t\t\t\t'submit': 'Submit',\n");
      out.write("\t\t\t\t'signup': 'Do not have an account? signup here.'\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\t'kinya': {\n");
      out.write("\t\t\t\t'login': 'kwinjira',\n");
      out.write("                                'email': 'imeri',\n");
      out.write("\t\t\t\t'pass': 'umubare wibanga',\n");
      out.write("\t\t\t\t'submit': 'ohereza',\n");
      out.write("\t\t\t\t'signup': ' udafite konti? Iyandikishe hano'\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\t'fr': {\n");
      out.write("\t\t\t\t'login': 'connectez-vous',\n");
      out.write("                                'email': 'e-mail',\n");
      out.write("\t\t\t\t'pass': 'mot de passe',\n");
      out.write("\t\t\t\t'submit': 'envoyer',\n");
      out.write("\t\t\t\t'signup': 'pas de compte? Registrer ici.'\n");
      out.write("\t\t\t}\n");
      out.write("\t\t};\n");
      out.write("\t\t\n");
      out.write("\t\t// Set the default language to English\n");
      out.write("\t\tvar currentLang = 'en';\n");
      out.write("\t\t\n");
      out.write("\t\t// Check if a language preference is stored in the browser's local storage\n");
      out.write("\t\tif (localStorage.getItem('language')) {\n");
      out.write("\t\t\tcurrentLang = localStorage.getItem('language');\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\t// If no language preference is stored, try to detect the user's browser language\n");
      out.write("\t\t\tvar userLang = navigator.language || navigator.userLanguage;\n");
      out.write("\t\t\tif (userLang.substring(0, 2) in translations) {\n");
      out.write("\t\t\t\tcurrentLang = userLang.substring(0, 2);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t// Update the website content with the translations for the current language\n");
      out.write("\t\tfunction updateLanguage() {\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tdocument.getElementById('login').innerHTML = translations[currentLang]['login'];\n");
      out.write("\t\t\tdocument.getElementById('email').placeholder = translations[currentLang]['email'];\n");
      out.write("                        document.getElementById('pass').placeholder = translations[currentLang]['pass'];\n");
      out.write("\t\t\tdocument.getElementById('submit').value = translations[currentLang]['submit'];\n");
      out.write("                        document.getElementById('signup').innerHTML = translations[currentLang]['signup'];\n");
      out.write("\t\t\tlocalStorage.setItem('language', currentLang); // Store the selected language in the browser's local storage\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t// Update the language when the user selects a different language\n");
      out.write("\t\tfunction changeLanguage(lang) {\n");
      out.write("\t\t\tcurrentLang = lang;\n");
      out.write("\t\t\tupdateLanguage();\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("        \n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\t<!--<link href=\"https://fonts.googleapis.com/css?family=Poppins:600&display=swap\" rel=\"stylesheet\">-->\n");
      out.write("\t<!--<script src=\"https://kit.fontawesome.com/a81368914c.js\"></script>-->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        \n");
      out.write("</head>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"updateLanguage()\">\n");
      out.write("\t<select onchange=\"changeLanguage(this.value)\">\n");
      out.write("\t\t<option value=\"en\">English</option>\n");
      out.write("\t\t<option value=\"kinya\">kinyarwanda</option>\n");
      out.write("\t\t<option value=\"fr\">Français</option>\n");
      out.write("\t</select>\n");
      out.write("  \n");
      out.write("\t<img class=\"wave\" src=\"img/wave.png\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"img\">\n");
      out.write("\t\t\t<img src=\"img/bg.svg\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"login-content\">\n");
      out.write("\t\t\t<form action=\"loginServlet\" method=\"POST\">\n");
      out.write("\t\t\t\t<img src=\"img/avatar.svg\">\n");
      out.write("\t\t\t\t<h1 class=\"title\" id=\"login\">LOGIN </h1>\n");
      out.write("           \t\t\n");
      out.write("           \t\t<div class=\"input-div one\">\n");
      out.write("           \t\t   <div class=\"i\">\n");
      out.write("           \t\t   \t\t\n");
      out.write("                               <i class=\"fa fa-envelope\"></i>\n");
      out.write("           \t\t   </div>\n");
      out.write("           \t\t   <div class=\"div\">\n");
      out.write("           \t\t   \t <input type=\"email\" id=\"email\" placeholder=\" Email\" name=\"email\" required oninput=\"validateEmail()\">\n");
      out.write("                                 <span id=\"emailError\" style=\"color: red;\"></span>\n");
      out.write("           \t\t   </div>\n");
      out.write("           \t\t\n");
      out.write("           \t\t</div>\n");
      out.write("           \t\t<div class=\"input-div pass\">\n");
      out.write("           \t\t   <div class=\"i\"> \n");
      out.write("           \t\t    \t<i class=\"fas fa-lock\"></i>\n");
      out.write("           \t\t   </div>\n");
      out.write("           \t\t   <div class=\"div\">\n");
      out.write("           \t\t    \t<!-- <h5>Password</h5> -->\n");
      out.write("           \t\t    \t<input type=\"password\"  placeholder=\"Enter Password \" name=\"password\" id=\"password\" required oninput=\"validatePassword()\" > \n");
      out.write("                             <span id=\"passError\" style=\"color: red;\"></span>\n");
      out.write("            \t   </div>\n");
      out.write("                            </div>\n");
      out.write("           \t\t<a href=\"signup.jsp\" id=\"signup\">Don't have a account !?</a>\n");
      out.write("            \t<input type=\"submit\" class=\"btn\" value=\"Register\" id=\"submit\">\n");
      out.write("                   <div>\n");
      out.write("<!--                          <a href=\"loginkiny.html\">Kinyarwanda</a>      -->\n");
      out.write("                            </div>\n");
      out.write("       \n");
      out.write("                        </form>  \n");
      out.write("       </div>\n");
      out.write("        </div>\n");
      out.write("    <!--<script type=\"text/javascript\" src=\"js/main.js\"></script>-->\n");
      out.write("      <script type=\"text/javascript\" src=\"validation.js\"></script>\n");
      out.write("      \n");
      out.write("</body>\n");
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
