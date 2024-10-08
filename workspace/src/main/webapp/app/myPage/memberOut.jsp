<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원탈퇴페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberout.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unpkg.com/swiper/swiper-bundle.min.css" />

<jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
</head>
<body>	
	<form action="${pageContext.request.contextPath}/memberMypage/memberOutOk.mm" method="post">
		<div class="memberOut-main-container">
	        <div class="memberOut-titlebox">
	            <p class="memberOut-title">회원탈퇴</p>
	            <hr class="memberOut-hr">
	        </div>
	        <div class="memberOut-inputbox">
	                <p class="memberOut-idtext">아이디</p>
	                <input type="text" name="memberId" class="memberOut-input-field">
	
	                <p class="memberOut-pwtext">비밀번호입력</p>
	                <input type="password" name="memberPw" class="memberOut-input-field">
	        </div>
	        <button class="memberOut-btn">
	          <p>회원탈퇴</p>
	        </button>
	    </div>
	</form>    
    <script src="${pageContext.request.contextPath}/static/js/myPage/memberout.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>