<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberphonechange.css">
</head>
<body>
	<div class="memberphoneChange-main-container">
        <div class="memberphoneChange-titlebox">
            <p class="memberphoneChange-title">휴대폰번호 변경</p>
            <hr class="memberphoneChange-hr">
        </div>
    
        <div class="memberphoneChange-inputbox">
            <form action="">
                <p class="memberphoneChange-text">기존 휴대폰번호</p>
    
                <div class="memberphoneChange-Okbtn">
                    <input type="text" class="memberphoneChange-input-field">
    
                    <p class="memberphoneChange-textbox">010-0000-0000 양식으로 작성해주세요</p>
                    
                </div>
    
                <p class="memberphoneChange-text">새로운 휴대폰번호</p>
                <input type="text" class="memberphoneChange-input-field">
                <p class="memberphoneChange-textbox">010-0000-0000 양식으로 작성해주세요</p>
                <button class="memberphoneChange-requestbtn">
                    <p>인증요청</p>
                </button>
            </form>
        </div>
    
        <button class="memberphoneChange-btn"><a href="${pageContext.request.contextPath}/app/myPage/memberinfo.jsp">변경완료</a></button>
    </div>
</body>
</html>