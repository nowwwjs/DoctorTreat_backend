<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원마이페이지비밀번호인증</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberpwok.css">
</head>
<body>
<div class="memberpwOk-main-container">
        <div class="memberpwOk-titlebox">
            <p class="memberpwOk-title">비밀번호 확인</p>
            <hr class="memberpwOk-hr">
        </div>
        <div class="memberpwOk-inputbox">
            <form action="">
                <p class="memberpwOk-text">비밀번호 입력</p>
                <input type="text" class="memberpwOk-input-field">
            </form>
        </div>
        <div class="memberpwOk-textbox">
            <p>현재 비밀번호와 일치하지 않습니다.</p>
        </div>
    
        <button class="memberpwOk-btn"><a href="memberupdateMember.html">인증완료</a></button>
    </div>
    
     <script src="${pageContext.request.contextPath}/static/js/myPage/memberpwok.js"></script>
</body>
</html>