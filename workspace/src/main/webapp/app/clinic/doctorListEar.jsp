<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/doctorList.css?v=1.0">
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
	<main>
		<div class="doctorList-ears">이비인후과 의사 목록</div>
		<div id="doctorList">
			<c:forEach var="doctor" items="${doctorList}">
				<div class="doctorList-container">
					<a
						href="${pageContext.request.contextPath}/app/clinic/doctorDetail.memcl?hospitalCall=${doctor.hospitalCall}">
						<div class="doctorList-name">
							의사명 : ${doctor.doctorName} / 진료과 : <span>${doctor.doctorMajor}</span>
						</div>
						<div class="doctorList-HospitalName">병원이름 :
							${doctor.hospitalName}</div>
						<div class="doctorList-MainNumber">전화번호 :
							${doctor.hospitalCall}</div>
					</a>
				</div>
			</c:forEach>
		</div>

		<!-- 페이지네이션 -->
		<div class="pagination-container">
			<ul class="doctorList-ear-pagenation">
				<!-- 이전 페이지 그룹으로 이동 -->
				<c:if test="${startPage > 1}">
					<li><a href="?page=${startPage - 1}">&lt;</a></li>
				</c:if>

				<!-- 페이지 번호 출력 -->
				<c:forEach var="i" begin="${startPage}" end="${endPage}">
					<li><a href="?page=${i}"
						style="${i == currentPage ? 'font-weight:bold;' : ''}">${i}</a></li>
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
