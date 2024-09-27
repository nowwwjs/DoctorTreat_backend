<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원휴대폰번호인증</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberphoneok.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unpkg.com/swiper/swiper-bundle.min.css" />

<jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
</head>
<body>
	<div class="memberPhoneOk-main-container">
        <div class="memberPhoneOk-titlebox">
            <p class="memberPhoneOk-title">본인인증</p>
            <hr class="memberPhoneOk-hr">
        </div>

	<form action="${pageContext.request.contextPath}/member/memberFindId.me" method="post">
        <div class="memberPhoneOk-inputbox">
                <p class="memberPhoneOk-text">휴대폰 번호</p>

                <div class="memberPhoneOk-Okbtn">
                    <input type="text" class="memberPhoneOk-input-field" id="member-phoneInput" name="phoneNum2">
                    <div class="memberPhoneOk-textbox" id="errorMessage">
                      <p>010-0000-0000 양식으로 작성해주세요</p>
                    </div>
                </div>
        </div>

        <button class="memberPhoneOk-btn">
            <p>인증완료</p>
        </button>
      </div>
	</form>
      
      <script src="${pageContext.request.contextPath}/static/js/myPage/memberphoneok.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>