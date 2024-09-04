<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/board/write.css">
	<jsp:include page="/header.jsp" /> 
</head>
<body>
	<main>
		<div class="member-write">의료 지식IN</div>
		<form class="member-write-wrap" action="" method="">
			<input class="member-write-title" type="text" name=""
				placeholder="제목을 입력해 주세요.">
			<textarea class="member-write-content" placeholder="내용을 입력해주세요."></textarea>
			<button class="member-write-register">게시글 등록</button>
		</form>
	</main>
<script
	src="${pageContext.request.contextPath}/static/js/board/write.js"></script>
</body>
<jsp:include page="/footer.jsp" /> 
</html>