<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원마이페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberinfo.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unpkg.com/swiper/swiper-bundle.min.css" />

<jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
</head>
<body>
	<div class="memberInfo-main-container">
  <div class="memberInfo-titlebox">
      <p class="memberInfo-title">내 정보 확인</p>
      <hr class="memberInfo-hr">
  </div>

  <div class="memberInfo-inputbox">
    <form action="${pageContext.request.contextPath}/myPage/memberPwOk.mm" method="post">

      <label class="memberInfo-input" for="">
        <span>아이디</span>
        <input type="text" value="${memberShowInfo.memberId}" name="memberId" readonly >
      </label>
      <br>
      <label class="memberInfo-input" for="">
        <span>이름</span>
        <input type="text" value="${memberShowInfo.memberName}" name="memberName" readonly >
      </label>
      <br>
      <label class="memberInfo-input" for="">
        <span>생년월일</span>
        <input type="text" value="${memberShowInfo.memberBirth}" name="memberBirth" readonly >
      </label>
      <br>
      <label class="memberInfo-input" for="">
        <span>휴대폰번호</span>
        <input type="text" value="${memberShowInfo.memberPhone}" name="memberPhone" readonly >
      </label>
      <br>
      <label class="memberInfo-input" for="">
        <span>주소</span>
        <input type="text" value="${memberShowInfo.addressPostal} ${memberShowInfo.addressAddress} ${memberShowInfo.addressDetail}" name="memberAddress" readonly >
      </label>
      <br>
    </form>
  </div>

  <button class="memberInfo-btn"><a href="">내 정보 수정</a></button>
</div>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>