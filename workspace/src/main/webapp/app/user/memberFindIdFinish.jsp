<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원아이디찾기완료페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/user/memberFindIdFinish.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unpkg.com/swiper/swiper-bundle.min.css" />

<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
</head>
<body>
<<<<<<< HEAD
   <main>
      <div id="member-findFinish-title">아이디 찾기</div>
      <div class="member-findFinish-container">
         <div class="member-findFinish-userName">${membershowId.memberName}님의 아이디 입니다</div>
         <div class="member-findFinish-user">
            <span>계정 : </span>
            <sapn class="member-findFinish-userId">${membershowId.memberId}</sapn>
         </div>
         
            <button id="member-findFinish-goLogin">
               <a href="${pageContext.request.contextPath}/app/user/memberLogin.jsp" style="color: white;">로그인</a>
            </button>
         
      </div>
   </main>
=======
	<main>
		<div id="member-findFinish-title">아이디 찾기</div>
		<div class="member-findFinish-container">
			<div class="member-findFinish-userName">${membershowId.memberName}님의 아이디 입니다</div>
			<div class="member-findFinish-user">
				<span>계정 : </span>
				<sapn class="member-findFinish-userId">${membershowId.memberId}</sapn>
			</div>
			
				<button id="member-findFinish-goLogin">
					<a href="${pageContext.request.contextPath}/app/user/doctorLogin.jsp">로그인</a>
				</button>
			
		</div>
	</main>
>>>>>>> main
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>