<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 회원가입</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/user/memberJoin.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />

</head>
<body>
	<main class="member-background">
		<div class="member-signup-container">
			<h2>회원가입</h2>
			<form
				action="${pageContext.request.contextPath}/member/memberJoinOk.me"
				method="post">
				<label for="userId">아이디</label>
				<div class="member-input-group">
					<input class="member-input-focus" type="text" id="userId"
						name="memberId" required>
					<button class="join-checkIdBtn">중복 확인</button>
					<p class="memberjoin-Null"></p>
				</div>

				<label for="password">비밀번호</label>
				<div class="member-input-group">
					<input type="password" id="password" name="memberPassword" required>
					<img class="memberjoin-view-first"
						src="${pageContext.request.contextPath}/static/image/view.png">
					<img class="memberjoin-noview-first"
						src="${pageContext.request.contextPath}/static/image/noview.png">
					<p class="memberjoin-Null"></p>
				</div>

				<label for="confirm-password">비밀번호 확인</label>
				<div class="member-input-group">
					<input type="password" id="confirm-password" name="memberPassword"
						required> <img class="memberjoin-view-second"
						src="${pageContext.request.contextPath}/static/image/view.png">
					<img class="memberjoin-noview-second"
						src="${pageContext.request.contextPath}/static/image/noview.png">
					<p class="memberjoin-Null"></p>
				</div>

				<label for="userName">이름</label>
				<div class="member-input-group">
					<input type="text" id="userName" name="memberName" required>
					<p class="memberjoin-Null"></p>
				</div>

				<div class="input-group1">
					<input type="text" id="postcode" name="adressPostal"
						placeholder="우편번호">
					<button class="postcode-search" onclick="execDaumPostcode()">주소
						찾기</button>
				</div>
				<div class="input-group1">
					<input type="text" id="address" name="adressAddress"
						placeholder="주소">
				</div>
				<div class="input-group1">
					<input type="text" id="detailAddress" name="adressDetail"
						placeholder="상세 주소">
				</div>

				<label for="birth">생년월일</label>
				<div class="member-input-group">
					<input type="text" id="birth" name="birth" name="memberBirth"
						required>
					<p class="memberjoin-Null"></p>
				</div>

				<label for="phoneNumber">핸드폰 번호</label>
				<div class="member-input-group">
					<input type="text" id="phoneNumber" name="memberPhone" required>
					<button class="join-request">인증 요청</button>
					<p class="memberjoin-Null"></p>
				</div>
				<br>

				<div class="container">
					<!-- 전체 동의 체크박스 -->
					<div class="checkbox-container">
						<input type="checkbox" id="agree-all-checkbox"> <label
							for="agree-all-checkbox"><strong>전체 약관에 동의합니다.</strong></label>
					</div>
					<hr>
					<br>
					<!-- 개별 약관 체크박스들 -->
					<div class="checkbox-container">
						<input type="checkbox" id="terms1" class="agree-checkbox">
						<label for="terms1">전화처방 등 원격진료 서비스는 정부 정책의 변경에 따라 예고 없이
							중단될 수 있으며, 회사는 이에 대해 아무런 책임을 지지 않습니다.</label>
					</div>
					<br>
					<div class="checkbox-container">
						<input type="checkbox" id="terms2" class="agree-checkbox">
						<label for="terms2">닥터트리 및 닥터트리 관련 제반 서비스의 이용과 관련하여 필요한
							사항을 규정합니다.</label>
					</div>
					<br>
					<div class="checkbox-container">
						<input type="checkbox" id="terms3" class="agree-checkbox">
						<label for="terms3">개인 정보 수집 및 이용에 동의합니다.</label>
					</div>
				</div>
				<br> <br>
				<button type="submit" class="signup-btn">가입하기</button>
			</form>
		</div>
	</main>

	<!-- <script src="${pageContext.request.contextPath}/static/js/user/memberJoin.js"></script> -->

	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>