<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원마이페이지수정</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberupdate.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unpkg.com/swiper/swiper-bundle.min.css" />

<jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
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
              <button><a href="${pageContext.request.contextPath}/app/myPage/memberphoneok.jsp">비밀번호 변경</a></button>
          </label>
          <br>
          <label class="memberupdateMember-input" for="">
              <span>생년월일</span>
              <input type="text" value="">
          </label>
          <br>
          <label class="memberupdateMember-input" for="">
              <span>휴대폰 번호</span>
              <button><a href="${pageContext.request.contextPath}/app/myPage/memberphonechange.jsp">휴대폰 번호 변경</a></button>
          </label>
            <br>
            
          <label class="memberupdateMember-input" for=""> <span>주소</span> 
          <input type="text" id="postcode" placeholder="우편번호">
		  </label> 
		  <br> 
		  <label class="memberupdateMember-input" for="">
		  		<button class="postcode-search" onclick="execDaumPostcode()">주소찾기</button>
		  </label> 
		  <br> 
		  <label class="memberupdateMember-input" for=""> <span></span>
				<input type="text" id="address" placeholder="주소">
		  </label> 
		  <br> 
		  <label class="memberupdateMember-input" for=""> <span></span>
			<input type="text" id="detailAddress" placeholder="상세 주소">
		  </label>
		<br>
      </form>
  </div>
  <div class="memberupdateMember-botton">          
      <button class="memberupdateMember-btn"><a href="${pageContext.request.contextPath}/app/myPage/memberinfo.jsp">수정완료</a></button>
      <button class="memberupdateMember-btn"><a href="${pageContext.request.contextPath}/app/myPage/memberout.jsp">회원탈퇴</a></button>
  </div>  
</div>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>