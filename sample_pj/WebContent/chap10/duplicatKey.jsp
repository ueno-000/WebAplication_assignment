<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL式暗黙オブジェクト</title>
</head>
<body>
	<p>
		リクエストオブジェクトに登録：${result }<br>
		セッションオブジェクトに登録：${sessionScope.result }
	</p>
</body>
</html>