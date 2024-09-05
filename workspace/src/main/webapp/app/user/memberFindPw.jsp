<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 비밀번호 찾기 페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/user/memberFindPw.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unpkg.com/swiper/swiper-bundle.min.css" />
   <jsp:include page="${pageContext.request.contextPath}/header.jsp" />
</head>
<body>
<main>
    <!-- <h2 class="findId-page-title">아이디 찾기</h2> -->
    <div class="findPw-container">
      <h2 class="findPw-page-title">비밀번호 찾기</h2>
      <br>
      <div class="findPw-choicebox">
        <div class="findPw-choice"><a href="${pageContext.request.contextPath}/app/user/memberFindId.jsp">아이디찾기</a></div>
        <div class="findPw-choice"><a href="${pageContext.request.contextPath}/app/user/memberFindPw.jsp">비밀번호찾기</a></div>
      </div>
      <br><br>
      <section class="findPw-form-one">
        <form>
          이름 &nbsp;&nbsp;  <input type="text" class="findPw-input" placeholder="이름을 입력하세요">      
        </form>
      </section> 
        <br>
      <section class="findPw-form-two">
        <form>
          아이디 <input type="text" class="findPw-input" placeholder="아이디를 입력하세요">      
        </form>
      </section>
      <br><br><br>
      <a href="${pageContext.request.contextPath}/app/myPage/memberphoneok.jsp"><button type="submit" class="findPw-button">휴대폰 인증</button></a>
    </div>
  </main>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>