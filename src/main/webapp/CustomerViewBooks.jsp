<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*, com.akash.BookManagement.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AllBooks</title>
<link rel="stylesheet" href="ViewBook.css">
</head>
<body ><div id="container">
<%
CustomerBean cb = (CustomerBean)session.getAttribute("cbean");
ArrayList<BookBean> al = (ArrayList<BookBean>)session.getAttribute("al");%>
<h3><% out.println("Page belongs to :"+cb.getfName()+"<br>"); %></h3>
<% if(al.size()==0){
	out.println("Book data not available<br>");
}
else{
	%>
	<table cellpadding="13" border="1" style="background-color: #fff;" >
		<tr>
			<th>BookCode</th>
			<th>BookName</th>
			<th>AuthorName</th>
			<th>BookPrice</th>
			<th>BookQuantity</th>
			<th>Option</th>
		</tr>
	<%Iterator<BookBean> it = al.iterator();
	while(it.hasNext()) {
		BookBean bb = (BookBean)it.next(); %>
		<tr>
			<td><%= bb.getbCode()%></td>
			<td><%= bb.getbName()%></td>
			<td><%= bb.getbAuthor() %></td>
			<td><%=bb.getbPrice() %></td>
			<td><%=bb.getbQty() %></td>
			<td><%="<a href='buy?bcode="+bb.getbCode()+"' ><button>Buy</button></a>"%></td>
		</tr><% 
	}	
}%>
</table>		
<br><br>
<button><a href="cview">ViewAllBooks</a></button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button><a href="logout">Logout</a></button>
</div>
</body>
</html>