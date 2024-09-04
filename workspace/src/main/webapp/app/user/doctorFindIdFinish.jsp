<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/user/doctorFindIdFinish.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
</head>

<body>
	<!-- 헤더 -->


	<main>
		<div id="Doctor-findFinish-title">아이디 찾기</div>
		<div class="Doctor-findFinish-container">
			<div class="Doctor-findFinish-userName">차은우 회원님의 아이디 입니다</div>
			<div class="Doctor-findFinish-user">
				<span>계정 : </span>
				<sapn class="Doctor-findFinish-userId">shjeong1994</sapn>
			</div>
			<form action="./../../../html/user/member/memberlogin.html" method="">
				<button id="Doctor-findFinish-goLogin">로그인</button>
			</form>
		</div>
	</main>

	<!-- 푸터 -->

</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>