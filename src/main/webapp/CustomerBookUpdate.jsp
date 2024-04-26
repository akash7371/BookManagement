<%@page import="com.akash.BookManagement.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successfull</title>
<link rel="stylesheet" href="Update.css">
</head>
<body>
<div id="container">
<%
CustomerBean cb =(CustomerBean) session.getAttribute("cbean");%>
<h3><% out.println("Page of: "+cb.getfName());%></h3>
<h3><% out.println("Order will deliver to below Adsress:");%></h3>
<span><% out.println("Name: "+cb.getfName()+"<br>");%></span>
<span><% out.println("City: "+cb.getCity()+"<br>");%></span>
<span><%out.println("State: "+cb.getState()+" PinCode: "+cb.getpCode()+"<br>"); %></span>
<span><%out.println("Mobile: "+cb.getPhno()+"<br>"); %></span>
<br><br>
<button><a href="cview">ViewAllBooks</a></button>&nbsp;&nbsp;&nbsp;&nbsp;
<button><a href="logout">Logout</a></button>
</div>
</body>
</html>