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
	href="${pageContext.request.contextPath}/static/css/myPage/doctorPhoneOk.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
<title>DoctorTreat - 휴대폰번호인증</title>
</head>
<body>

	<div class="DoctorPhoneOk-main-container">
		<div class="DoctorPhoneOk-titlebox">
			<p class="DoctorPhoneOk-title">본인인증</p>
			<hr class="DoctorPhoneOk-hr">
		</div>

		<div class="DoctorPhoneOk-inputbox">
			<form action="">
				<p class="DoctorPhoneOk-text">휴대폰 번호 인증</p>

				<div class="DoctorPhoneOk-Okbtn">
					<input type="text" class="DoctorPhoneOk-input-field"
						id="phoneInput">
					<div class="DoctorPhoneOk-textbox" id="errorMessage">
						<p>010-0000-0000 양식으로 작성해주세요</p>
					</div>
					<button class="DoctorPhoneOk-requestbtn">
						<p>인증요청</p>
					</button>
				</div>
			</form>
		</div>


		<button class="DoctorPhoneOk-btn">
			<p>
				<a href="${pageContext.request.contextPath}/app/myPage/doctorPwChange.jsp">인증완료</a>
			</p>
		</button>
	</div>

	

	<script
		src="${pageContext.request.contextPath}/static/js/myPage/doctorPhoneOk.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>