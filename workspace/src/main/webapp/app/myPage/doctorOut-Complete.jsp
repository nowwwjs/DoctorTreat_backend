<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>DoctorTreat - 회원탈퇴완료</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/myPage/doctorOut-Complete.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
</head>

<body>

	<main>
		<div class="DoctorOut-complete-title">회원 탈퇴 완료</div>
		<div class="DoctorOut-complete-wrap">
			<div class="DoctorOut-complete-image">
				<img src="./../../static/image/circlecheck.png">
			</div>
			<div class="DoctorOut-complete-text">회원 탈퇴 완료</div>
			<div class="Doctorout-complete-text-bottom">닥터트리 사이트 회원 탈퇴 신청이
				완료되었습니다.</div>
			<div class="DoctorOut-complete-btn">
				<a href="./../../../html/main/main.html"><button
						class="DoctorOut-complete-mainbtn">홈으로</button></a>
			</div>
		</div>
	</main>
	

</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />

</html>