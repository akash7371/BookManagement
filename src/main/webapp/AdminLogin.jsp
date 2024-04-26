<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.akash.BookManagement.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link rel="stylesheet" href="ViewBook.css">
</head>
<body>
<div id="container">
<%
AdminBean ab = (AdminBean)session.getAttribute("abean");%>
<h3><% out.println("Welcome Admin: "+ab.getfName()+"<br>"); %></h3><br>
<button><a href="book.html">AddBook</a><br></button>&nbsp;&nbsp;&nbsp;
<button><a href="view">ViewAllBooks</a><br></button>&nbsp;&nbsp;&nbsp;
<button><a href="logout">Logout</a></button>
</div>
</body>
</html>