<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>ニュースページ</h2>
<p>本日のニュース</p>
<%for(int i=0; i < 4; i++){%>
	<p>タイトル<%=i+1 %></p>
<% } %>