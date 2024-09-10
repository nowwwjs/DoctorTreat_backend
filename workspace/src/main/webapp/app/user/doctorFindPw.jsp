<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/user/doctorFindPw.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
<title>비밀번호찾기</title>
</head>
<body>

	<main>
		<!-- <h2 class="findId-page-title">아이디 찾기</h2> -->
		<div class="Doctor-findPw-container">
			<h2 class="Doctor-findPw-page-title">비밀번호 찾기</h2>
			<br>
			<div class="Doctor-findPw-choicebox">
				<div class="Doctor-findPw-choice">
					<a href="./../../../html/user/doctor/DoctorfindId.html">아이디찾기</a>
				</div>
				<div class="Doctor-findPw-choice">
					<a href="./../../../html/user/doctor/DoctorfindPw.html">비밀번호찾기</a>
				</div>
			</div>
			<br>
			<br>
			<form action="<%=request.getContextPath()%>/doctor/doctorFindPw.do" method="post">
			<section class="Doctor-findPw-form-one">
				<form>
					이름 &nbsp;&nbsp; <input type="text" class="Doctor-findPw-input"
						placeholder="이름을 입력하세요">
				</form>
			</section>
			<br>
			<section class="Doctor-findPw-form-two">
				<form>
					아이디 <input type="text" class="Doctor-findPw-input"
						placeholder="아이디를 입력하세요">
				</form>
			</form>
			</section>
			<br>
			<br>
			<br> <a href="./../../../html/myPage/doctor/DoctorphoneOk.html"><button
					type="submit" class="Doctor-findPw-button">휴대폰 인증</button></a>
		</div>
	</main>
	
	<img src="./../../../html/user/member/findId.html">
	<script src="./../../../js/user/member/find.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>