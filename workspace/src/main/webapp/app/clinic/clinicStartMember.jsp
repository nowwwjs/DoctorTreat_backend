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
		<%-- 일반회원일 경우 --%>
		<div class="clinicMember-choice">과 선택</div>
		<form action="${pageContext.request.contextPath}/doctorList.memcl" method="post" class="clinicMember-department">
			<button class="clinicMember-otolaryngology">이비인후과</button>
			<button class="clinicMember-medicine">내과</button>
		</form>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>