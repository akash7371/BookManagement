<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*, com.akash.BookManagement.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Book</title>
<link rel="stylesheet" href="cRegistration.css">
</head>
<body>
<div class="container">
<%
AdminBean ab = (AdminBean)session.getAttribute("abean");%>
<h3><%out.println("Page belong to: "+ab.getfName()); %></h3>
<% ArrayList<BookBean> al = (ArrayList<BookBean>)session.getAttribute("al");
String bCode = request.getParameter("bcode");
Iterator<BookBean> it = al.iterator();
while(it.hasNext())
{
	BookBean bb = it.next();
	if(bCode.equals(bb.getbCode()))
	{ %>
	<form action="update" method="post">
	<input type="hidden" name="bcode" value=<%=bb.getbCode() %>><br>
	<div class="cust-details">
	<div class="input-box">
		BookPrice: <input type="text" name="bprice" value=<%=bb.getbPrice() %>><br>
	</div>
	<div class="input-box">
		BookQty: <input type="text" name="bqty" value=<%= bb.getbQty() %>><br>
	</div>
	<div class="button">
		<input type="submit" value="UpdatebookDetails">
	</div>	
	</div>
	</form>
	<%	break;
	}
}
%>
</div>
</body>
</html>