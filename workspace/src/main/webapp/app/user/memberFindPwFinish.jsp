<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원비밀번호찾기페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/user/memberFindPwFinish.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unpkg.com/swiper/swiper-bundle.min.css" />
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
</head>
<body>
	<main>
      <div id="member-findFinish-title">비밀번호 찾기</div>
      <div class="member-findFinish-container">
         <div class="member-findFinish-userName">${membershowPw.memberName}님의 비밀번호 입니다</div>
         <div class="member-findFinish-user">
            <span>비밀번호 : </span>
            <span class="member-findFinish-userPw">${membershowPw.memberPw}</span>
         </div>
         
            <button id="member-findFinish-goLogin">
               <a href="${pageContext.request.contextPath}/app/user/memberLogin.jsp" style="color: white;">로그인</a>
            </button>
         
      </div>
   </main>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>