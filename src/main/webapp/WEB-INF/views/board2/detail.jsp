<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Detail Page</h2>
	<table>
		<th>정보</th>
		<th>데이터</th>
		<tr>
			<td>작성일자</td>
			<td><fmt:formatDate value="${data.date}" pattern="yyyy-MM-dd"/></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${data.name}</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${data.title}</td>
		</tr>
	</table>
	<hr>
	내용
	<div>
	${data.content}
	</div>
	<br>
	<hr>
	<a href="/update/?bo_no=${data.bo_no}" role="button">수정</a>
	<a href="/delete/?bo_no=${data.bo_no}" role="button">삭제</a>
</body>
</html>