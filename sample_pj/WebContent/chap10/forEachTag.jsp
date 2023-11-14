<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>c:forEachタグ</title>
</head>
<body>
	<h1>買い物リストを一覧表示</h1>
	<p>
	<c:forEach var="goodsName" items="${myList}">
		<c:out value="${goodsName}"/><br>
	</c:forEach>
	</p>
</body>
</html>