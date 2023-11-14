<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>演習９</title>
</head>
<body>
	<p>１から１００の整数のうち奇数をすべて加算した値は</p>
	<%
		int sum = 0;
		for (int i = 0 ; i <= 100 ; i++){
			if(i%2 == 1)
		  		sum = sum + i;
		}
		out.println(sum);
		out.println("です");
	%>
	
</body>
</html>