<%-- 
    Document   : delete
    Created on : Mar 8, 2023, 5:08:39 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.io.PrintWriter"%>    
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
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
	<title>Delete Info</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>

 <style>
        html {
    /*height: 100%;*/
  }
  body {
      background-image: url(wave.jpge);
      background-size: cover;
    /*margin:0;*/
    /*padding:0;*/
    font-family: sans-serif;
    /*background: linear-gradient(#141e30, #243b55);*/
  }
  .container {
  position: relative;
  /*max-width: 600px;*/
  /*height: 500px;*/
  /*padding: 50px;*/
  color:black;
  /*text-align: center;*/
}
.form-control {
border: 1px solid #ccc;
display: block;
width: 100%;
height: 40px;
padding: 0 20px;
border-radius: 20px;
font-family: "Muli-Bold";
background: none; }
.form-control:focus {
border: 1px solid #333231; }
  
    </style>

<body>
	<div class="container">
		<h1>Delete Student Info</h1>
		<form action="DeleteServlet" method="post">
			<div class="form-group">
				<label for="tableName">ID</label>
				<input type="text" class="form-control" id="id" name="id" required>
			</div>
			<button type="submit" class="btn btn-danger">Delete</button>
		</form>
	</div>
    
    
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

