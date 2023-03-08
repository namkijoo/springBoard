<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function goBoardList(){
		location.href="test"
	}
	
	function addBoard(){
		var form = document.getElementById("insert_data");
		
		form.action="<c:url value='/boardWrite2Do'/>";
		form.submit();
	}
</script>
</head>
<body>
<form method="post" id="insert_data">
	제목: <input name="name" type="text" id="name">
	작성자 : <input name="title" type="text" id="tite">
	내용 : <input name="content" type="text" id="content">
	<button type="submit" onclick='javascript:addBoard()'>저장</button>
</form>
 <button type="button" onclick="javascript:goBoardList()">목록으로 돌아가기</button>
</body>
</html>

