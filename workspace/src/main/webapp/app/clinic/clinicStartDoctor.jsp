<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/choice.css">
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
	<main>
		<%-- 의사회원일 경우 --%>
		<div class="startClinic-title">비대면진료</div>
		<form action="${pageContext.request.contextPath}/chatListDoctor.doccl" method="post">
			<button id="startClinic-startBtn">진료 시작하기</button>
		</form>
	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>