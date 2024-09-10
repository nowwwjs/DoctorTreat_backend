<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/choice.css">
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
	<main>
		<div class="clinicMember-choice">과 선택</div>
		<div class="clinicMember-department">
			<form action="${pageContext.request.contextPath}/doctorListEar.memcl"
				method="post" class="clinicMember-form">
				<button class="clinicMember-otolaryngology">이비인후과</button>
			</form>
			<form action="${pageContext.request.contextPath}/doctorListInner.memcl"
				method="post" class="clinicMember-form">
				<button class="clinicMember-medicine">내과</button>
			</form>
		</div>
		<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>