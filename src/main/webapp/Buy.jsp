<%@page import="java.util.*"%>
<%@page import="com.akash.BookManagement.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buy Book</title>
<link rel="stylesheet" href="aLogin.css">
</head>
<body>
<div id="container">
<%
CustomerBean cb = (CustomerBean)session.getAttribute("cbean");%>
<h3><% out.println("page belongs to "+cb.getfName()); %></h3>
<%  ArrayList<BookBean> al = (ArrayList<BookBean>)session.getAttribute("al");
String bcode = request.getParameter("bcode");
Iterator<BookBean> it = al.iterator();
while(it.hasNext())
{
	BookBean bb = it.next();
	if(bcode.equals(bb.getbCode()))
	{
		%>
		<form action="buyBook" method="post">
		
		<input type="hidden" name="bcode" value=<%=bb.getbCode() %>>
		<div class="admin">
		<div id="text">
			<span>Buy Book</span>
		</div>
		<div id="box">
			<span>Enter how many quantity you want:</span><br>
			<input type="text" name="qty" >
		</div>
		<div id="box">
			<span style="color: red;"> <% out.println("only "+bb.getbQty()+" left in stock<br>"); %></span>
		</div>
		<div id="submit">
			<input type="submit" value="BuyBooks">
		</div>
		</div>
		</form><% 
	}
}

%>
</div>
</body>
</html>