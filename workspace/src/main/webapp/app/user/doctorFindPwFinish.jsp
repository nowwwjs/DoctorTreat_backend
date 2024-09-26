<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
   href="${pageContext.request.contextPath}/static/css/user/doctorFindPwFinish.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
</head>

<body>
   <!-- 헤더 -->
   <main>
      <div id="Doctor-findFinish-title">비밀번호 찾기</div>
      <div class="Doctor-findFinish-container">
         <div class="Doctor-findFinish-userName">${doctorshowPw.doctorName}님의 비밀번호 입니다</div>
         
         <div class="Doctor-findFinish-user">
            <span>비밀번호 : </span>
            <span class="Doctor-findFinish-userId">${doctorshowPw.doctorPw}</span>
         </div>

         <button id="Doctor-findFinish-goLogin" >
            <a
               href="${pageContext.request.contextPath}/app/user/doctorLogin.jsp" style="color: white;">로그인
            </a>
         </button>

      </div>
   </main>

   <!-- 푸터 -->   

</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>