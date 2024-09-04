<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원비밀번호변경페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberpwchange.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unpkg.com/swiper/swiper-bundle.min.css" />

<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
</head>
<body>
<div class="memberpwChange-main-container">
        <div class="memberpwChange-titlebox">
            <p class="memberpwChange-title">비밀번호 변경 </p>
            <hr class="memberpwChange-hr">
        </div>
    
        <div class="memberpwChange-inputbox">
            <form action="">
                <p class="memberpwChange-text">새로운 비밀번호</p>
                <input type="text" class="memberpwChange-input-field">
                <p class="memberpwChange-textbox">암호는 8자 이상(영어 소문자, 특수문자, 숫자 각 1개 이상 필수)을 충족해야합니다.</p>
    
                <p class="memberpwChange-text">새로운 비밀번호 입력</p>
                <input type="text" class="memberpwChange-input-field">
            </form>
        </div>
    
        <button class="memberpwChange-btn"><a href="${pageContext.request.contextPath}/app/myPage/memberinfo.jsp">변경완료</a></button>
    </div>
    
     <script src="${pageContext.request.contextPath}/static/js/myPage/memberpwchange.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>