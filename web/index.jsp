<%-- 
    Document   : index
    Created on : Mar 13, 2017, 8:29:28 AM
    Author     : Kolade
--%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Date Web Application</title>
    </head>
    <%Date date = new Date();%>
    <body>
        <h1>Today's Date</h1>
        <p>Today's date is <%= date%></p>
    </body>
</html>
