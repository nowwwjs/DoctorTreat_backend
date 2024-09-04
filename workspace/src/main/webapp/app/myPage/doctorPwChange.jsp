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
	href="${pageContext.request.contextPath}/static/css/myPage/doctorPwChange.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
<title>DoctorTreat - 비밀번호 변경</title>
</head>
<body>


	<div class="DoctorpwChange-main-container">
		<div class="DoctorpwChange-titlebox">
			<p class="DoctorpwChange-title">비밀번호 변경</p>
			<hr class="DoctorpwChange-hr">
		</div>

		<div class="DoctorpwChange-inputbox">
			<form action="">
				<p class="DoctorpwChange-text">새로운 비밀번호</p>
				<input type="text" class="DoctorpwChange-input-field">
				<p class="DoctorpwChange-textbox">암호는 8자 이상(영어 소문자, 특수문자, 숫자 각
					1개 이상 필수)을 충족해야합니다.</p>

				<p class="DoctorpwChange-text">새로운 비밀번호 입력</p>
				<input type="text" class="DoctorpwChange-input-field">
			</form>
		</div>


		<button class="DoctorpwChange-btn">
			<a href="DoctorInfo.html">변경완료</a>
		</button>


	</div>
	

	<script
		src="${pageContext.request.contextPath}/static/js/myPage/doctorPwChange.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>