<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/board/boardDetail.css">
<jsp:include page="/header.jsp" />
</head>
<body>
	<main>

		<!-- 의료지식인 게시글 상세페이지 -->
		<div class="boardDetail-title">의료지식인</div>


		<div class="boardDetail-boardTextContainer">
			<div class="boardDetail-boardTop">
				<div class="boardDetail-boardTitle">${memberBoardshowDetail[0].medicalInfoTitle}</div>
				<div class="boardDetail-writer">
					<div class="boardDetail-name">${memberBoardshowDetail[0].memberName}</div>
					<div class="boardDetail-date">${memberBoardshowDetail[0].medicalInfoDate}</div>
				</div>
				<form
					action="${pageContext.request.contextPath}/memberBoard/updateBoard.membo?id=${memberBoardshowDetail[0].id}"
					method="post">
					<button type="submit" class="boardDetail-modifyBtn">글 수정</button>
					<button type="submit"
						formaction="${pageContext.request.contextPath}/memberBoard/deleteBoard.membo?id=${memberBoardshowDetail[0].id}"
						class="boardDetail-deleteBtn">삭제</button>
				</form>
			</div>
			<div class="boardDetail-boardText">${memberBoardshowDetail[0].medicalInfoText}</div>
		</div>

		<!-- 의사댓글창 -->
		<div class="boardDetail-comentBox">
			<div class="boardDetail-doctorName">${memberBoardshowDetail[0].doctorMajor}
				: ${memberBoardshowDetail[0].doctorName}</div>
			<div class="boardDetail-doctorComent">${memberBoardshowDetail[0].commentText}</div>
		</div>


	</main>
</body>
<jsp:include page="/footer.jsp" />
</html>
