<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/doctorList.css">
<script defer
	src="${pageContext.request.contextPath}/static/js/clinic/doctorList.js"></script>
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
	<main>
		<div class="doctorList-ears">이비인후과 의사 목록</div>
		<div id="doctorList"></div>

		<div class="pagenation-container">
			<ul class="doctorList-ear-pagenation"></ul>
		</div>
	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>