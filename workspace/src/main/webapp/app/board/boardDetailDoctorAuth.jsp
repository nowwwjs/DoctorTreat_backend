<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>의료지식인 게시글 상세페이지</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/board/boardDetail.css?v=1.0" />
<jsp:include page="/headerDoctor.jsp" />
</head>
<body>
	<main>
		<!-- 의료지식인 게시글 상세페이지 -->
		<div class="boardDetail-title">의료지식인</div>
		<div class="boardDetail-boardTextContainer">
			<div class="boardDetail-boardTitle">${doctorBoardshowDetail.medicalInfoTitle}</div>
			<div class="boardDetail-writer">
				<div class="boardDetail-name">${doctorBoardshowDetail.memberName}</div>
				<div class="boardDetail-date">${doctorBoardshowDetail.medicalInfoDate}</div>
			</div>
			<div class="boardDetail-boardText">${doctorBoardshowDetail.medicalInfoText}</div>
		</div>
		<!-- 의사 댓글창 -->
		<div class="boardDetail-comentBox">
			<div class="boardDetail-name">${doctorBoardshowDetail.doctorMajor}</div>
			<c:forEach var="comment" items="${comments}">
				<div class="boardDetail-doctorName">내과 전문의 :
					${comment.doctorName}</div>
				<div class="boardDetail-doctorComment">&nbsp;&nbsp;${comment.doctorCommentText}</div>

				<!-- 댓글 수정/삭제 버튼 -->
				<button class="boardDetail-comentModify"
					onclick="toggleEditComment(${comment.doctorCommentNumber})">수정</button>
				<form
					action="${pageContext.request.contextPath}/BoardCommentDelete.docbo"
					method="post">
					<input type="hidden" name="doctorCommentNumber"
						value="${comment.doctorCommentNumber}" /> <input type="hidden"
						name="infoNumber"
						value="${doctorBoardshowDetail.medicalInfoNumber}" />
					<button type="submit" class="boardDetail-comentDelete">삭제</button>
				</form>
				<div id="editArea_${comment.doctorCommentNumber}"
					style="display: none;">
					<form
						action="${pageContext.request.contextPath}/BoardComment.docbo?infoNumber=${infoNumber}"
						method="post" onsubmit="return validateCommentForm(this);">
						<input type="hidden" name="doctorCommentNumber"
							value="${comment.doctorCommentNumber}" /> <input type="hidden"
							name="medicalInfoNumber"
							value="${doctorBoardshowDetail.medicalInfoNumber}" />
						<textarea name="doctorCommentText" class="boardDetail-comment">${comment.doctorCommentText}</textarea>
						<button type="submit" class="doctorModify">수정 완료</button>
					</form>
				</div>
			</c:forEach>
		</div>

		<form class="boardDetail-commentContainer"
			action="${pageContext.request.contextPath}/BoardComment.docbo?infoNumber=${infoNumber}"
			method="post">
			<input type="hidden" name="medicalInfoNumber"
				value="${doctorBoardshowDetail.medicalInfoNumber}" /> <input
				type="hidden" name="doctorNumber" value="${doctorNumber}" />
			<!-- 동적으로 doctorNumber 설정 -->
			<textarea name="doctorCommentText" placeholder="댓글을 달아주세요"
				class="boardDetail-comment"></textarea>
			<button type="submit" class="doctorModify">등록</button>
		</form>
	</main>
	<jsp:include page="/footer.jsp" />
	<script
		src="${pageContext.request.contextPath}/static/js/board/boardModify.js"></script>
</body>
</html>