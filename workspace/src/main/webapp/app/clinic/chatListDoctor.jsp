<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/clinic/patientList.css">
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
	<main>
		<!-- 환자목록 -->
		<div class="memberList-topContainer">
			<div class="memberList-title">비대면진료</div>
			<form action="${pageContext.request.contextPath}/clinicStartDoctor.doccl" method="post">
				<button id="memberList-exitClinic">진료 끝내기</button>
			</form>
		</div>
		<ul class="memberList-chat">
			<c:forEach var="member" items="${memberList}">
				<li class="memberList-chatList">
					<a href="${pageContext.request.contextPath}/app/clinic/chatRoomDoctor.doccl?memberNumber=${member.memberNumber}">
						<div class="memberList-memberInfoContainer">
							<div class="memberList-name">${member.memberName}</div>
							<div class="memberList-birth">${member.memberBirth}</div>
						</div>
					</a>
					<img src="${pageContext.request.contextPath}/static/image/hospital.png">
				</li>
			</c:forEach>
		</ul>

		<!-- 페이지네이션 -->
		<div class="pagination-container">
			<ul class="memberList-pagenation">
				<!-- 이전 페이지 그룹으로 이동 -->
				<c:if test="${startPage > 1}">
					<li><a href="?page=${startPage - 1}">&lt;</a></li>
				</c:if>

				<!-- 페이지 번호 출력 -->
				<c:forEach var="i" begin="${startPage}" end="${endPage}">
					<li><a href="?page=${i}" style="${i == currentPage ? 'font-weight:bold;' : ''}">${i}</a></li>
				</c:forEach>

				<!-- 다음 페이지 그룹으로 이동 -->
				<c:if test="${endPage < maxPages}">
					<li><a href="?page=${endPage + 1}">&gt;</a></li>
				</c:if>
			</ul>
		</div>
	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>
