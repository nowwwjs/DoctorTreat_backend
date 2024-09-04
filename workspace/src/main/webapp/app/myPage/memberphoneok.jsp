<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원휴대폰번호인증</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberphoneok.css">
</head>
<body>
	<div class="memberPhoneOk-main-container">
        <div class="memberPhoneOk-titlebox">
            <p class="memberPhoneOk-title">본인인증</p>
            <hr class="memberPhoneOk-hr">
        </div>

        <div class="memberPhoneOk-inputbox">
            <form action="">
                <p class="memberPhoneOk-text">휴대폰 번호 인증</p>

                <div class="memberPhoneOk-Okbtn">
                    <input type="text" class="memberPhoneOk-input-field" id="member-phoneInput">
                    <div class="memberPhoneOk-textbox" id="errorMessage">
                      <p>010-0000-0000 양식으로 작성해주세요</p>
                    </div>
                    <button class="memberPhoneOk-requestbtn">
                        <p>인증요청</p>
                    </button>
                </div>
            </form>
        </div>

        <div class="memberPhoneOk-textbox" id="member-errorMessage">
            <p>010-0000-0000 양식으로 작성해주세요</p>
        </div>

        <button class="memberPhoneOk-btn">
            <p><a href="${pageContext.request.contextPath}/app/myPage/memberpwchange.jsp">인증완료</a></p>
        </button>
      </div>
      
      <script src="${pageContext.request.contextPath}/static/js/myPage/memberphoneok.js"></script>
</body>
</html>