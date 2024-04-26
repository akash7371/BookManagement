<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.akash.BookManagement.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Management System</title>
<link rel="stylesheet" href="ViewBook.css">
</head>
<body>
<div id="container">
<% AdminBean ab =(AdminBean)session.getAttribute("abean"); %>
<h3> <% out.println("Page Of Admin: "+ab.getfName()+"<br>");%></h3>
<h3> <% out.println("Book Details Updated Succesfully...<br>"); %></h3><br><br>
<button><a href="view">ViewAllBooks</a></button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button><a href="logout">Logout</a></button>
</div>
</body>
</html>