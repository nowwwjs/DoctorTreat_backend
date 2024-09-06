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
		<c:if test="${not empty memberBoardshowDetail}">
			<div class="boardDetail-title">의료지식인</div>
			<div class="boardDetail-boardTextContainer">
				<div class="boardDetail-boardTop">
					<div class="boardDetail-boardTitle">${memberBoardshowDetail.medicalInfoTitle}</div>
					<div class="boardDetail-writer">
						<div class="boardDetail-name">${memberBoardshowDetail.memberName}</div>
						<div class="boardDetail-date">${memberBoardshowDetail.date}</div>
					</div>
					<form
						action="${pageContext.request.contextPath}/memberBoard/updateBoard.membo?id=${memberBoardshowDetail.id}"
						method="post">
						<button type="submit" class="boardDetail-modifyBtn">글 수정</button>
						<button type="submit"
							formaction="${pageContext.request.contextPath}/memberBoard/deleteBoard.membo?id=${memberBoardshowDetail.id}"
							class="boardDetail-deleteBtn">삭제</button>
					</form>
				</div>
				<div class="boardDetail-boardText">${memberBoardshowDetail.medicalInfoText}</div>
			</div>

			<!-- 의사댓글창 -->
			<c:if test="${not empty doctorCommentText}">
				<div class="boardDetail-comentBox">
					<div class="boardDetail-doctorName">내과 전문의 :
						${doctorComment.doctorName}</div>
					<div class="boardDetail-doctorComent">${doctorComment.commentText}</div>
				</div>
			</c:if>
		</c:if>
	</main>
</body>
<jsp:include page="/footer.jsp" />
</html>
