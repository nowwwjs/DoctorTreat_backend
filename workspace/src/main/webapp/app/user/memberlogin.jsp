<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 로그인 페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/user/memberlogin.css">
</head>
<body>
	<main>
    <div class="member-container">
      <h1>로그인</h1>
      <form action="/login" method="POST">
        <div class="member-input-group">
          <label for="username">아이디</label>
          <input type="text" id="username" name="username" required>
          <div class="memberjoin-Null"></div> <!-- 메시지 표시 공간 -->
        </div>
        <div class="member-input-group">
          <label for="password">비밀번호</label>
          <input type="password" id="password" name="password" required>
          <div class="memberjoin-Null"></div> <!-- 메시지 표시 공간 -->
        </div>
        <div class="member-input-group">
          <button type="submit"></button>
        </div>
      </form>
    <br>
    <div class="memberlogin-findmessage">
      <a href="./../../../html/user/member/memberfindId.html"><span>아이디 찾기</span></a>
      <a href="./../../../html/user/member/memberfindPw.html"><span>비밀번호 찾기</span></a>
    </div>


    <br><br>
    <button type="submit" class="member-button"><a href="./../../../html/main/main.html">로그인</a></button>
    </form>
    <br><br>
    <span class="member-login-messagetwo">DOCTOR TREAT 계정이 없으신가요? 지금 바로 만들어보세요!</span>
    <br><br>
    <button type="submit" class="member-button"><a href="./../../../html/user/member/memberjoin.html">개인회원
        가입하기</a></button>
    <br><br>
    <button type="submit" class="member-button"><a href="./../../../html/user/doctor/Doctorjoin.html">의사회원
        가입하기</button></a>
    </div>
  </main>
  <script src="${pageContext.request.contextPath}/static/js/user/memberlogin.js"></script>
</body>
</html>