<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力内容確認</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String input = request.getParameter("input");
	%>
	<p> 入力値：<%=input %> </p>
</body>
</html>