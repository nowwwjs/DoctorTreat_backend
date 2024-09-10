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
	href="${pageContext.request.contextPath}/static/css/myPage/doctorPhoneChange.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
<title>DoctorTreat - 병원 번호 변경</title>
</head>
<body>



	<div class="DoctorphoneChange-main-container">
		<div class="DoctorphoneChange-titlebox">
			<p class="DoctorphoneChange-title">병원 번호 변경</p>
			<hr class="DoctorphoneChange-hr">
		</div>

		<div class="DoctorphoneChange-inputbox">
			<form action="">
				<p class="DoctorphoneChange-text">의사 휴대폰번호</p>

				<div class="DoctorphoneChange-Okbtn">
					<input type="text" class="DoctorphoneChange-input-field">


					<p class="DoctorphoneChange-textbox">010-0000-0000 양식으로 작성해주세요</p>
					<button class="DoctorphoneChange-requestbtn">
						<p>인증요청</p>
					</button>

				</div>



				<p class="DoctorphoneChange-text">새로운 병원 번호</p>
				<input type="text" class="DoctorphoneChange-input-field">
				<p class="DoctorphoneChange-textbox">010-0000-0000 양식으로 작성해주세요</p>
			</form>
		</div>

		<button class="DoctorphoneChange-btn">
			<a href="DoctorInfo.html">변경완료</a>
		</button>
	</div>




	<script
		src="${pageContext.request.contextPath}/static/js/myPage/doctorPhoneChange.js"></script>

</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>