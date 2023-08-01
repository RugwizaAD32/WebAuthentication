package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.io.PrintWriter;
import java.util.Base64;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class View_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>CRUD System</title>\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <style>\n");
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
      out.write("    </style>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6 offset-md-3\">\n");
      out.write("          <div class=\"card mt-5\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("              <h1 class=\"text-center mb-4\">CRUD System</h1>\n");
      out.write("              <p class=\"text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("              <div class=\"d-flex justify-content-center mb-3\">\n");
      out.write("                <a href=\"index.jsp\" class=\"btn btn-primary mr-3\">Add Info</a>\n");
      out.write("                <a href=\"View.jsp\" class=\"btn btn-primary mr-3\">Display Info</a><br>\n");
      out.write("                <a href=\"update.jsp\" class=\"btn btn-primary mr-3\">Update Info</a><br>\n");
      out.write("                <a href=\"delete.jsp\" class=\"btn btn-primary\">Delete Info</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS -->\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Display Data</title>\n");
      out.write("\t<!-- Include Bootstrap CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("     <style>\n");
      out.write("         \n");
      out.write("         /* Style the table */\n");
      out.write("table {\n");
      out.write("    width: 100%;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the table header */\n");
      out.write("thead {\n");
      out.write("    background-color: #f8f9fa;\n");
      out.write("    color: #212529;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the table header cells */\n");
      out.write("th {\n");
      out.write("    text-align: left;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the table body cells */\n");
      out.write("td {\n");
      out.write("    text-align: left;\n");
      out.write("    padding: 8px;\n");
      out.write("    vertical-align: top;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the table rows */\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the table rows when hovered over */\n");
      out.write("tr:hover {\n");
      out.write("    background-color: #e2e6ea;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("         \n");
      out.write("         </style>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("<h1>Student Info</h1>\n");
      out.write("<table class=\"table\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th>ID</th>\n");
      out.write("<th>Parent/Guardian Name</th>\n");
      out.write("<th>Parent/Guardian Email</th>\n");
      out.write("<th>Phone</th>\n");
      out.write("<th>Image</th>\n");
      out.write("<th>Pdf</th>\n");
      out.write("<th>Religion</th>\n");
      out.write("                                        \n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("<tbody>\n");

					// Load the JDBC driver
Class.forName("org.postgresql.Driver");

					// Connect to the database
Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/form", "postgres", "3200");

					// Create a statement
					Statement stmt = con.createStatement();

					// Execute the query
					ResultSet rs = stmt.executeQuery("SELECT * FROM admission");
                                       
					// Loop through the result set and display the data
					while (rs.next()) {
                
						int id= rs.getInt("id");
						String fname = rs.getString("fname");
                                                String email = rs.getString("email");
                                                String phoneNumber = rs.getString("phonenumber");
                                                byte[] image = rs.getBytes("picfile");
						byte[] pdf = rs.getBytes("pdffile");
                                                String password = rs.getString("password");
                                                // Output the image data as a base64-encoded string
                                            	String base64Image = Base64.getEncoder().encodeToString(image);
                                                String base64Pdf = Base64.getEncoder().encodeToString(pdf);
			

						
      out.write("\n");
      out.write("<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(id);
      out.write("</td>\n");
      out.write("                                                        <td>");
      out.print(fname);
      out.write("</td>\n");
      out.write("                                                        <td>");
      out.print(email);
      out.write("</td>\n");
      out.write("                                                        <td>");
      out.print(phoneNumber);
      out.write("</td>\n");
      out.write("                                                        <td>");
      out.print(image);
      out.write("  </td>\n");
      out.write("                                                        <td>");
      out.print(pdf);
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(password);
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t");

					}

					// Close the database connection
                                          System.out.println("EmailSent:"+rs);
					rs.close();
					stmt.close();
					con.close();
				
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("    <div class=\"jumbotron\">\n");
      out.write("    \n");
      out.write("   \n");
      out.write("      <a class=\"btn btn-lg btn-danger\" href=\"logout.jsp\" role=\"button\">Log out</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\t<!-- Include Bootstrap JS -->\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("       ");

    } else {
        // Session is invalid or has expired
        // Redirect to login page or show an error message
        out1.println("<script type=\"text/javascript\">");
        out1.println("alert('you need to login first');");
        out1.println("window.location.assign('login.jsp');");
        out1.println("</script>");
    }


      out.write("\n");
      out.write("        \n");
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
