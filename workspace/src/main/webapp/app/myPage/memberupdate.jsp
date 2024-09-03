<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원마이페이지수정</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberupdate.css">
</head>
<body>
	<div class="memberupdateMember-main-container">
  <div class="memberupdateMember-titlebox">
      <p class="memberupdateMember-title">내 정보 수정</p>
      <hr class="memberupdateMember-hr">
  </div>
  <div class="memberupdateMember-inputbox">
      <form action="">
          <label class="memberupdateMember-input" for="">
              <span>아이디</span>
              <input type="text" value="">
          </label>
          <br>
          <label class="memberupdateMember-input" for="">
              <span>이름</span>
              <input type="text" value="">
          </label>
          <br>
          <label class="memberupdateMember-input" for="">
              <span>비밀번호</span>
              <button><a href="./../../../html/myPage/member/memberphoneOk.html">비밀번호 변경</a></button>
          </label>
          <br>
          <label class="memberupdateMember-input" for="">
              <span>생년월일</span>
              <input type="text" value="">
          </label>
          <br>
          <label class="memberupdateMember-input" for="">
              <span>휴대폰 번호</span>
              <button><a href="./../../../html/myPage/member/memberphoneChange.html">휴대폰 번호 변경</a></button>
            </label>
            <br>
            <label class="memberupdateMember-input" for="">
              <span>주소</span>
              <input type="text" value="">
          </label>
          <br>
      </form>
  </div>
  <div class="memberupdateMember-botton">          
      <button class="memberupdateMember-btn"><a href="./../../../html/myPage/member/memberInfo.html">수정완료</a></button>
      <button class="memberupdateMember-btn"><a href="./../../../html/myPage/member/memberOut.html">회원탈퇴</a></button>
  </div>  
</div>
</body>
</html>