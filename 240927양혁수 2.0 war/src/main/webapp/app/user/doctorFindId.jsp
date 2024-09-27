
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
   href="${pageContext.request.contextPath}/static/css/user/doctorFindId.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
<title>아이디찾기</title>
</head>

<body>

   <main>
      <!-- <h2 class="findId-page-title">아이디 찾기</h2> -->
      <div class="Doctor-findId-container">
         <h2 class="Doctor-findId-page-title">아이디 찾기</h2>
         <br>
         <div class="Doctor-findId-choicebox">
            <div class="Doctor-findId-choice">
               <a href="${pageContext.request.contextPath}/app/user/doctorFindId.jsp">아이디찾기</a>
            </div>
            <div class="Doctor-findId-choice">
               <a href="${pageContext.request.contextPath}/app/user/doctorFindPw.jsp">비밀번호찾기</a>
            </div>
         </div>
         <section class="Doctor-findId-form">
            <form>
               <button type="submit">
                  <a href="${pageContext.request.contextPath}/app/myPage/doctorPhoneOk.jsp"
                     class="Doctor-findId-phone-a">본인명의 휴대폰으로 인증 
               </button>
               </a> <br> <br>
               <p>회원님의 명의로 등록된</p>
               <p>휴대폰으로 본인확인을 진행합니다</p>
            </form>
         </section>
      </div>
   </main>
   
   <script src="./../../../js/user/member/find.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />

</html>




