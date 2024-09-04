<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./../../../css/main/basic.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/myPage/doctorOut.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
<title>DoctorTreat - 회원탈퇴</title>
</head>

<body>
	


	<div class="DoctorOut-main-container">
		<div class="DoctorOut-titlebox">
			<p class="DoctorOut-title">회원탈퇴</p>
			<hr class="DoctorOut-hr">
		</div>


		<div class="DoctorOut-inputbox">
			<form action="">
				<p class="DoctorOut-idtext">아이디</p>
				<input type="text" class="DoctorOut-input-field">

				<p class="DoctorOut-pwtext">비밀번호 입력</p>
				<input type="password" class="DoctorOut-input-field">
			</form>
		</div>

		<button class="DoctorOut-btn">
			<a href="./../../../html/myPage/member/memberOut-caution.html">
				<p>회원탈퇴</p>
			</a>
		</button>
	</div>

	<!-- 회원탈퇴 모달창 -->
	<div id="DoctorOut-modal" class="DoctorOut-modal">
		<div class="DoctorOut-modal-content">
			<h2>회원탈퇴 완료</h2>
			<p>회원탈퇴가 완료되었습니다.</p>
			<button onclick="closeModal()">닫기</button>
		</div>
	</div>



	<script
		src="${pageContext.request.contextPath}/static/js/myPage/doctorOut.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />

</html>