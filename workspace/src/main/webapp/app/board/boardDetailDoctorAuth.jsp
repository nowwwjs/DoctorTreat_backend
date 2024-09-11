<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>의료지식인 게시글 상세페이지</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/board/boardDetail.css?v=1.0" />
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
		<!-- 의사댓글창 -->
		<div class="boardDetail-comentBox">
			<div class="boardDetail-name">${doctorBoardshowDetail.doctorMajor}</div>
			<c:forEach var="comment" items="${comments}">
				<div class="boardDetail-doctorName">내과 전문의 : ${comment.doctorName}</div>
				<div class="boardDetail-doctorComment">&nbsp;&nbsp;${comment.doctorCommentText}</div>
				<!-- 댓글 수정/삭제 버튼 -->
				<button class="boardDetail-comentModify">수정</button>
				<form action="${pageContext.request.contextPath}/BoardCommentDelete.docbo" method="post">
  				  <input type="hidden" name="doctorCommentNumber" value="${comment.doctorCommentNumber}" />
    			  <input type="hidden" name="infoNumber" value="${doctorBoardshowDetail.medicalInfoNumber}" />
    			  <button type="submit" class="boardDetail-comentDelete">삭제</button>
    			</form>
			</c:forEach>
		</div>
	</main>
	<jsp:include page="/footer.jsp" />
</body>
</html>