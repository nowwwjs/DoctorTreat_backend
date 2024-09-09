<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/myPage/doctorPwOk.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
<title>DoctorTreat - 비밀번호인증</title>
</head>

<body>

	<div class="DoctorpwOk-main-container">
		<div class="DoctorpwOk-titlebox">
			<p class="DoctorpwOk-title">비밀번호 확인</p>
			<hr class="DoctorpwOk-hr">
		</div>
		<div class="DoctorpwOk-inputbox">
			<form action="">
				<p class="DoctorpwOk-text">비밀번호 입력</p>
				<input type="text" class="DoctorpwOk-input-field">
			</form>
		</div>
		<div class="DoctorpwOk-textbox">
			<p>현재 비밀번호와 일치하지 않습니다.</p>
		</div>

		<button class="DoctorpwOk-btn">
			<a href="DoctorupdateMember.html">인증완료</a>
		</button>
	</div>


	<script
		src="${pageContext.request.contextPath}/static/js/myPage/doctorPwOk.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>
