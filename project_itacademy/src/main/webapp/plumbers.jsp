<%@ page import="java.util.List" %>
<%@ page import="it.academy.Plumber" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Plumbers</title>
</head>
<body>
    <% List<Plumber> plumbers = (List<Plumber>) request.getAttribute("plumbers"); %>
    <% for(Plumber plumber : plumbers) { %>
    <div>Name: <%= plumber.getName()%></div>
    <div>Experience: <%= plumber.getExperience()%></div>
    <div>Fresh: <%= plumber.isFresh()%></div>
    <% }; %>
</body>
</html>
