<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL式に演算式を記述</title>
</head>
<body>
	<h1>EL式で算術演算の結果を出力</h1>
	<p>
		10 + 20 = ${10 + 20 } <br>
		10 * 20 = ${10 * 20 } <br>
		10 / 4 = ${10 / 4 } <br>
	</p>
	<h1>EL式で比較演算の結果を出力</h1>
	<p>
		文字列の比較："abc" == "abc" = ${"abc"=="abc"}
	</p>
</body>
</html>