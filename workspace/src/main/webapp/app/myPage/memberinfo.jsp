<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원마이페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberinfo.css">
</head>
<body>
	<div class="memberInfo-main-container">
  <div class="memberInfo-titlebox">
      <p class="memberInfo-title">내 정보 확인</p>
      <hr class="memberInfo-hr">
  </div>

  <div class="memberInfo-inputbox">
    <form action="">

      <label class="memberInfo-input" for="">
        <span>아이디</span>
        <input type="text" value="">
      </label>
      <br>
      <label class="memberInfo-input" for="">
        <span>이름</span>
        <input type="text" value="">
      </label>
      <br>
      <label class="memberInfo-input" for="">
        <span>생년월일</span>
        <input type="text" value="">
      </label>
      <br>
      <label class="memberInfo-input" for="">
        <span>휴대폰번호</span>
        <input type="text" value="">
      </label>
      <br>
      <label class="memberInfo-input" for="">
        <span>주소</span>
        <input type="text" value="">
      </label>
      <br>
      <div class="memberinput-group1">
        <input type="text" id="postcode" placeholder="우편번호">
        <button class="memberpostcode-search" onclick="execDaumPostcode()">주소 찾기</button>
      </div>
      <div class="memberinput-group1">
        <input type="text" id="address" placeholder="주소">
      </div>
      <div class="memberinput-group1">
        <input type="text" id="detailAddress" placeholder="상세 주소">
      </div>
    </form>
  </div>

  <button class="memberInfo-btn"><a href="./../../../html/myPage/member/memberpwOk.html">내 정보 수정</a></button>
</div>
</body>
</html>