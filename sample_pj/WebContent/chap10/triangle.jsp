<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>三角形の情報を出力</title>
</head>
<body>
	<h1>三角形の情報</h1>
	<p>
		底辺：${triangle.base }<br>
		高さ：${triangle.height }<br>
		面積：${triangle.base * triangle.height /2 }
	</p>
</body>
</html>