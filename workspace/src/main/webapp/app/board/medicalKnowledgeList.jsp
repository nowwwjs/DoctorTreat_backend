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
			<c:forEach var="board" items="${memberBoardshowlist}">
				<li>
					<hr> <a
					href="${pageContext.request.contextPath}/memberBoardDetail.membo?id=${board.medicalInfoNumber}">
						<div class="medicalKnowledgeList-boardList">${board.medicalInfoTitle}</div>
						<div class="medicalKnowledgeList-text">
							${board.medicalInfoText}</div>
						<div class="medicalKnowledgeList-writer">
							<img
								src="${pageContext.request.contextPath}/static/image/QnA.png">
							${board.memberName}
						</div>
				</a>
				</li>
			</c:forEach>
		</ul>

		<!-- 글쓰기 버튼 -->
		<form
			action="${pageContext.request.contextPath}/memberBoardWrite.membo">
			<button class="medicalKnowledgeList-goWrite">의료지식인 질문하러 가기</button>
		</form>

		<!-- 페이지네이션 -->
		<div class="medicalKnowledgeList-page">
			<ul class="medicalKnowledgeList-pagenation">
				<!-- 이전 페이지 링크 -->
				<c:if test="${currentPage > 1}">
					<li><a href="?page=${currentPage - 1}">&lt;</a></li>
				</c:if>

				<!-- 페이지 번호 링크 -->
				<c:forEach var="i" begin="1" end="${totalPage}">
					<li class="${i == currentPage ? 'active' : ''}"><a
						href="?page=${i}">${i}</a></li>
				</c:forEach>

				<!-- 다음 페이지 링크 -->
				<c:if test="${currentPage < totalPage}">
					<li><a href="?page=${currentPage + 1}">&gt;</a></li>
				</c:if>
			</ul>
		</div>
	</main>
	<jsp:include page="/footer.jsp" />
</body>
</html>
