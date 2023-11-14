<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>クライアントごとの訪問回数の表示</title>
</head>
<body>
	<h1>あなたが訪問した回数です</h1>
	<% Integer count = (Integer) session.getAttribute("mycounter"); %>
	<p><strong><%=count %> 回です。</strong> </p>
	<a href="/sample_pj/counter">再表示</a>
	<form action="/sample_pj/counter" method="post">
		<input type="submit" value="リセット">
	</form>
</body>
</html>