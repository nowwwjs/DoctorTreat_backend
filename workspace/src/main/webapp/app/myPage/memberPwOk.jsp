<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원마이페이지비밀번호인증</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberpwok.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unpkg.com/swiper/swiper-bundle.min.css" />

<jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
</head>
<body>
<form action="${pageContext.request.contextPath}/memberMypage/memberPwOk.mm">
<div class="memberpwOk-main-container">
        <div class="memberpwOk-titlebox">
            <p class="memberpwOk-title">비밀번호 확인</p>
            <hr class="memberpwOk-hr">
        </div>
        
        <div class="memberpwOk-inputbox">
             <p class="memberpwOk-text">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;이름 입력</p>
             <input type="text" name="memberName" class="memberpwOk-input-field">
        </div>
        <div class="memberpwOk-inputbox">
                <p class="memberpwOk-text">비밀번호 입력</p>
                <input type="text" name="memberPw" class="memberpwOk-input-field">
        </div>
        <div class="memberpwOk-textbox">
            <p>현재 비밀번호와 일치하지 않습니다.</p>
        </div>
    
        <button class="memberpwOk-btn" type="submit">인증완료</button>
    </div>
</form>
    
     <script src="${pageContext.request.contextPath}/static/js/myPage/memberpwok.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>