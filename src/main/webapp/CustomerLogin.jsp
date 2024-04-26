<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.akash.BookManagement.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer</title>
<link rel="stylesheet" href="ViewBook.css">
</head>
<body>
<div id="container">
<%
CustomerBean cb = (CustomerBean)session.getAttribute("cbean");%>
<h3><%out.println("Welcome "+cb.getfName()+"<br>"); %></h3><br>

<button><a href="cview">ViewAllBooks</a></button>&nbsp;&nbsp;&nbsp;&nbsp;
<button><a href="logout">Logout</a></button>
</div>
</body>
</html>