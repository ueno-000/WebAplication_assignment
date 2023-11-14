<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>出力用JSP</title>
</head>
<body>
	<h1>サーブレットからのデータを受け取ります</h1>
		<%
			String str = (String)request.getAttribute("myMessage");
		%>
	<p><%=str %></p>
</body>
</html>