<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   

<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>test</title>
<script type="text/javascript">
 function goBoardWrite(){
	 location.href = "boardWrite2"
 }
 
 function logout(){
	 location.href = "logout"
 }
</script>



</head>

<body>
	<table>
		<tr>
			<td>제목</td>
			<td>작성자</td>
			<td>작성시간</td>
			<td>작성날짜</td>
			<td>번호</td>
		</tr>
		<c:forEach items="${list}" var="test">
		<tr>
			<td>${test.title}</td>
			<td><a href="/detail/?bo_no=${test.bo_no}">${test.name}</a></td>
			<td>${test.time}</td>
			<td>${test.date}</td>
			<td>${test.bo_no}</td>
		</tr>
		</c:forEach>
	</table>
	<button type="button" onclick="javascript:goBoardWrite();">작성하기</button>
	 	<button type="button" onclick="javascript:logout();">logout</button>
	
	

</body>

</html>