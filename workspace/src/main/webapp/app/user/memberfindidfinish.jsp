<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원아이디찾기완료페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/user/memberfindidfinish.css">
</head>
<body>
	<main>
		<div id="member-findFinish-title">아이디 찾기</div>
		<div class="member-findFinish-container">
			<div class="member-findFinish-userName">차은우 회원님의 아이디 입니다</div>
			<div class="member-findFinish-user">
				<span>계정 : </span>
				<sapn class="member-findFinish-userId">shjeong1994</sapn>
			</div>
			<form action="./../../../html/user/member/memberlogin.html" method="">
				<button id="member-findFinish-goLogin">로그인</button>
			</form>
		</div>
	</main>
</body>
</html>