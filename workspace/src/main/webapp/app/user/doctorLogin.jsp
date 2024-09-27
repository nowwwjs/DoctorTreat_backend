<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet" type="text/css"
   href="${pageContext.request.contextPath}/static/css/user/doctorLogin.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
<title>로그인</title>
</head>

<body>
   <main>
      <div class="Doctor-container">
         <h1>로그인</h1>
         <form
            action="${pageContext.request.contextPath}/doctor/doctorLoginOk.do"
            method="POST">
            <div class="Doctor-input-group">
               <label for="doctorId">아이디</label> <input type="text" id="doctorId"
                  name="doctorId" required>
               <div class="doctorjoin-Null"></div>
               <!-- 메시지 표시 공간 -->
            </div>
            <div class="Doctor-input-group">
               <label for="doctorPw">비밀번호</label> <input type="password"
                  id="doctorPw" name="doctorPw" required>
               <div class="doctorjoin-Null"></div>
               <!-- 메시지 표시 공간 -->
            </div>
            <div class="login-findmessage">
               <a href="${pageContext.request.contextPath}/doctor/doctorFindId.do"><span>아이디
                     찾기</span></a> <a href="${pageContext.request.contextPath}/doctor/doctorFindPw.do"><span>비밀번호
                     찾기</span></a>
            </div>

            <br>
            <button type="submit" class="Doctor-button">로그인</button>
         </form>
         <br> <br> <span class="Doctor-login-messagetwo">DOCTOR
            TREAT 계정이 없으신가요? 지금 바로 만들어보세요!</span> <br> <br>
         <button type="submit" class="Doctor-button">
<<<<<<< HEAD
            <a href="${pageContext.request.contextPath}/app/user/memberJoin.jsp">개인회원 가입</a>
         </button>
         <br> <br>
         <button type="submit" class="Doctor-button">
            <a href="${pageContext.request.contextPath}/app/user/doctorJoin.jsp">의료회원 가입 
=======
            <a href="${pageContext.request.contextPath}/member/memberJoin.me">개인회원 가입하기</a>
         </button>
         <br> <br>
         <button type="submit" class="Doctor-button">
            <a href="${pageContext.request.contextPath}/doctor/doctorJoin.do">의사회원 가입 
>>>>>>> 1860fd72a39938e4ea4a037216dfefd0d7028d45
         </button>
         </a>
      </div>
   </main>

   <script
      src="${pageContext.request.contextPath}/static/js/user/doctorLogin.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>