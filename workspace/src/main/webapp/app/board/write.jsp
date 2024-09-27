<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/board/write.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/summernote/summernote-lite.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<jsp:include page="/headerMember.jsp" />
</head>
<body>
	<main>
		<div class="member-write">의료지식인</div>

		<form class="member-write-wrap"
			action="${pageContext.request.contextPath}/memberBoardWriteOk.membo"
			method="post">
			<input class="member-write-title" type="text" name="medicalInfoTitle"
				placeholder="제목을 입력해 주세요.">
			<textarea id="summernote" class="member-write-content" placeholder="내용을 입력해주세요."
				name="medicalInfoText"></textarea>
			<button class="member-write-register">게시글 등록</button>
		</form>
	</main>
	<script src="${pageContext.request.contextPath}/static/summernote/summernote-lite.js"></script>
	<script src="${pageContext.request.contextPath}/static/summernote/lang/summernote-ko-KR.js"></script>
	<script>
	$(document).ready(function() {
	    $('#summernote').summernote({
	        height: 300, // 높이 조정
	        placeholder: '내용을 입력해주세요.'
	    });
	});
	</script>
</body>
<jsp:include page="/footer.jsp" />
</html>
