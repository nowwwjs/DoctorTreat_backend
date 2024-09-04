<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/user/doctorJoinFinish.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
</head>

<body>

	<main>
		<div class="Doctor-joinFinishcontainer">
			<h1>회원가입 완료!</h1>
			<br>
			<p>회원가입이 성공적으로 완료되었습니다.</p>
			<p>이제 로그인하여 서비스를 이용할 수 있습니다.</p>
		</div>
		<a href="./../../../html/user/doctor/Doctorlogin.html"><div
				class="Doctor-joinFinish-button">로그인 바로하기</div></a>
	</main>

</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>
