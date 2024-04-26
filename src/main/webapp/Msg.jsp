<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Management System</title>
<link rel="stylesheet" href="ViewBook.css">
</head>
<body>
<%
String msg = (String)request.getAttribute("msg");%>
<h3><% out.println(msg);%></h3>
<jsp:include page="home.html"></jsp:include>
</body>
</html>