<%-- 
    Document   : welcome
    Created on : Mar 13, 2017, 8:42:42 PM
    Author     : Kolade
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <% 
            if(session.getAttribute("username")==null) {
                response.sendRedirect("login.jsp");
            } 
        
        %>
        <h1>Yaay!!! Welcome to JSP</h1>
    </body>
</html>
