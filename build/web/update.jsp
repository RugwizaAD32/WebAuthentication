<%-- 
    Document   : update
    Created on : Mar 13, 2023, 5:11:45 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.PrintWriter"%>
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
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="styles.css" />
    <title>Update Information</title>
  </head>
  
  <style>
        html {
    /*height: 100%;*/
  }
  body {
      background-image: url(final.png);
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
  color:#141414;
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
      <h1 class="text-center my-5">Update Information</h1>
      <form action="UpdateServlet" method="post">
        <div class="form-group">
          <label for="id">id</label>
          <input
            type="text"
            class="form-control"
            id="id"
            name="id"
            placeholder="Enter ID of the info you want to update"
            required
          />
        </div>
        <div class="form-group">
          <label for="fname">Parent/Guardian Name</label>
          <input
            type="text"
            class="form-control"
            id="fname"
            name="fname"
            placeholder="Enter Parent/Guardian Name"
            required
          />
        </div>
        <div class="form-group">
          <label for="lname">Parent/Guardian Email</label>
          <input
            type="text"
            class="form-control"
            id="email"
            name="email"
            placeholder="Enter Parent/Guardian Email "
            required
          />
        </div>
         <div class="form-group">
          <label for="email">Phone</label>
          <input
            type="text"
            class="form-control"
            id="phone"
            name="phone"
            placeholder="Enter Your phone "
            required
          />
        </div>
          <div class="form-group">
          <label for="email">Religion</label>
          <input
            type="text"
            class="form-control"
            id="password"
            name="password"
            placeholder="Enter Your Religion "
            required
          />
        </div>
        <button type="submit" class="btn btn-primary">Update</button>
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

