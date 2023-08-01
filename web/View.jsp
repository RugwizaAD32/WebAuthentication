<%-- 
    Document   : View
    Created on : Mar 13, 2023, 4:30:11 PM
    Author     : HP
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Base64"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@include file="home.jsp" %>
<%
    HttpSession sess = request.getSession(false);
PrintWriter out1 = response.getWriter();
// Check if the session exists and is still valid
    if (sess != null && sess.getAttribute("email") != null) {
        String sessionId = sess.getId();
        System.out.println("Session ID: " + sessionId + " on this email " + sess.getAttribute("email") + " is validate");
%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Display Data</title>
	<!-- Include Bootstrap CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/sty.css">
     <style>
         
         /* Style the table */
table {
    width: 100%;
    border-collapse: collapse;
}

/* Style the table header */
thead {
    background-color: #f8f9fa;
    color: #212529;
}

/* Style the table header cells */
th {
    text-align: left;
    padding: 8px;
}

/* Style the table body cells */
td {
    text-align: left;
    padding: 8px;
    vertical-align: top;
}

/* Style the table rows */
tr:nth-child(even) {
    background-color: #f2f2f2;
}

/* Style the table rows when hovered over */
tr:hover {
    background-color: #e2e6ea;
    cursor: pointer;
}

         
         </style>
 

</head>
<body>
<div class="container">
<h1>Student Info</h1>
<table class="table">
<thead>
<tr>
<th>ID</th>
<th>Parent/Guardian Name</th>
<th>Parent/Guardian Email</th>
<th>Phone</th>
<th>Image</th>
<th>Pdf</th>
<th>Religion</th>
                                        
</tr>
</thead>
<tbody>
<%
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
			

						%>
<tr>
							<td><%=id%></td>
                                                        <td><%=fname%></td>
                                                        <td><%=email%></td>
                                                        <td><%=phoneNumber%></td>
                                                        <td><%=image%>  </td>
                                                        <td><%=pdf%></td>
							<td><%=password%></td>
						</tr>
						<%
					}

					// Close the database connection
                                          System.out.println("EmailSent:"+rs);
					rs.close();
					stmt.close();
					con.close();
				%>
			</tbody>
		</table>
	</div>
                        <div class="container">
   
    
   
      <a class="btn" href="logout.jsp" role="button">Log out</a>
    
  </div>
	<!-- Include Bootstrap JS -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        
       <%
    } else {
        // Session is invalid or has expired
        // Redirect to login page or show an error message
        out1.println("<script type=\"text/javascript\">");
        out1.println("alert('you need to login first');");
        out1.println("window.location.assign('login.jsp');");
        out1.println("</script>");
    }

%>
        
</body>
</html>
