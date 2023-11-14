<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>c:chooseタグ</title>
</head>
<body>
	<h1>点数から評価を表示</h1>
	<c:choose>
		<c:when test="${myScore >=90 }">
			<p>あなたの評価はAです</p>
		</c:when>
		<c:when test="${myScore >=70 }">
			<p>あなたの評価はBです</p>
		</c:when>
		<c:otherwise>
			<p>あなたの評価はCです</p>
		</c:otherwise>
	</c:choose>
	<p>あなたの点数：<c:out value="${myScore}"/> </p>
</body>
</html>