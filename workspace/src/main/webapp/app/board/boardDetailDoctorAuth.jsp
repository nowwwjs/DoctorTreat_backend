<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>의료지식인 게시글 상세페이지</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/board/boardDetail.css" />
<jsp:include page="/headerDoctor.jsp" />
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
		<div class="boardDetail-boardText">${doctorBoardshowDetail.medicalInfoText}
			</div>
	</div>
	<!-- 의사댓글창 -->
	<div class="boardDetail-comentBox">
	  <c:forEach var="comment" items="${comments}">
		 <div class="boardDetail-doctorName">${comment.doctorName}</div>
                    <div class="boardDetail-doctorComment">${comment.doctorCommentText}</div>
		</c:forEach>
	</div>
	<form action="" method="">
		<button class="boardDetail-comentModify">수정</button>
		<button class="boardDetail-comentDelete">삭제</button>
	</form>
	</main>
	<jsp:include page="/footer.jsp" />
</body>
</html>