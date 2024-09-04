<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원가입완료페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/user/memberjoinfinish.css">
</head>
<body>
<main>
    <div class="member-joinFinishcontainer">
      <h1>회원가입 완료!</h1>
      <br>
      <p>회원가입이 성공적으로 완료되었습니다.</p>
      <p>이제 로그인하여 서비스를 이용할 수 있습니다.</p>
    </div>
    <a href="./../../../html/user/member/memberlogin.html"><div class="member-joinFinish-button">로그인 바로하기</div></a>
  </main>
</body>
</html>