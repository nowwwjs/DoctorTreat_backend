<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원마이페이지수정</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberupdate.css">
 <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
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
      <form action="${pageContext.request.contextPath}/memberMypage/memberUpdateProcess.mm" method="post">
      <input type="hidden" name="memberNumber" value="${showMember.memberNumber}">
      
          <label class="memberupdateMember-input" for="">
              <span>아이디</span>
              <input type="text" name="memberId" value="${showMember.memberId}" readonly>
          </label>
          <br>
          <label class="memberupdateMember-input" for="">
              <span>이름</span>
              <input type="text" name="memberName" value="${showMember.memberName}">
          </label>
          <br>
          <label class="memberupdateMember-input" for="">
              <span>비밀번호</span>
              <button><a href="${pageContext.request.contextPath}/app/myPage/memberphoneok.jsp">비밀번호 변경</a></button>
          </label>
          <br>
          <label class="memberupdateMember-input" for="">
              <span>생년월일</span>
              <input type="text" name="memberBirth" value="${showMember.memberBirth}">
          </label>
          <br>
          <label class="memberupdateMember-input" for="">
              <span>휴대폰 번호</span>
              <input type="text" name="memberPhone" value="${showMember.memberPhone}">
          </label>
            <br>
          <label class="memberupdateMember-input" for=""> 
               <span>주소</span> 
               <input type="text" id="postcode" name="postalCode" placeholder="우편번호" value="${showMember.addressPostal}" readonly>
          </label> 
             <br> 
          <label class="memberupdateMember-input" for="">
                <button type="button" class="postcode-search" onclick="execDaumPostcode()" style="color: white;">주소 찾기</button>
          </label> 
             <br> 
          <label class="memberupdateMember-input" for="">
               <span></span> 
               <input type="text" id="address" name="address" placeholder="주소" value="${showMember.addressAddress}" readonly>
          </label> 
            <br> 
          <label class="memberupdateMember-input" for="">
                <span></span> 
                <input type="text" id="detailAddress" name="detailAddress" placeholder="상세 주소" value="${showMember.addressDetail}">
          </label>
      
  </div>
  <div class="memberupdateMember-botton">          
      <button class="memberupdateMember-btn" style="color: white;">수정완료</button>
      			<button class="memberupdateMember-btn" id="memberupdateMember-btn">
				<a href="${pageContext.request.contextPath}/app/myPage/memberOut.jsp">회원탈퇴</a>
			</button>
	</form>		
  </div>  
</div>
<script src="${pageContext.request.contextPath}/static/js/myPage/memberUpdate.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>