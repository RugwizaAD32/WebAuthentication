<%-- 
    Document   : logout
    Created on : Mar 12, 2023, 5:14:14 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.PrintWriter"%>
<% 
    // invalidate the current session and redirect to the login page
//    session.invalidate(); 
//    response.sendRedirect("Login.jsp");
%>
<%
    PrintWriter out1 = response.getWriter();

    HttpSession session1 = request.getSession(false);
    if (session1 != null) {
        // Display the session ID
        String sessionId = session1.getId();
        System.out.println("Session ID: " + sessionId + " is invalidate");
        session1.invalidate();
    }
    out1.println("<script type=\"text/javascript\">");
    out1.println("alert('Logout Successsful!!!!');");
    out1.println("window.location.assign('welcome.jsp');");
    out1.println("</script>");
%>
