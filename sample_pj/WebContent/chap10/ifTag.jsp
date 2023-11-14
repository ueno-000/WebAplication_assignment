<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>c:ifタグ</title>
</head>
<body>
	<h1>点数が90点以上かどうかを判定</h1>
	<c:if test="${myScore >= 90 }">
		<p>90点以上です！</p>
	</c:if>
	<p>あなたの点数：<c:out value="${myScore}"/> </p>
</body>
</html>