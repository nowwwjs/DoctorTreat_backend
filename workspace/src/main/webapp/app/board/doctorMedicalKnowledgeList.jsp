<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>의료 지식인</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/board/medicalKnowledgeList.css">
<jsp:include page="/header.jsp" />
</head>
<body>
	<main>
		<div class="medicalKnowledgeList-title">의료지식인</div>
		<div class="medicalKnowledgeList-selectContainer">
			<div id="medicalKnowledgeList-all">전체</div>
		</div>


		<ul class="medicalKnowledgeList-board">
			<c:forEach var="board" items="${doctorBoardshowlist}">
				<li>
					<hr> <a
					href="${pageContext.request.contextPath}/html/board/member/boardDetail.html">
						<div class="medicalKnowledgeList-boardList">${board.medicalInfoTitle}</div>
						<div class="medicalKnowledgeList-text">
							${board.medicalInfoText}...</div>
						<div class="medicalKnowledgeList-writer">
							<img
								src="${pageContext.request.contextPath}/static/image/QnA.png">
							${board.memberName}
						</div>
				</a>
				</li>
			</c:forEach>
		</ul>
		
		<!-- 페이지 -->
		<div class="medicalKnowledgeList-page">
			<ul class="medicalKnowledgeList-pagenation">
				<li><a href="">1</a></li>
				<li><a href="">2</a></li>
				<li><a href="">3</a></li>
				<li><a href="">4</a></li>
				<li><a href="">5</a></li>
				<li><a href="">&gt;</a></li>
			</ul>
		</div>
	</main>
	<jsp:include page="/footer.jsp" />
</body>
</html>
