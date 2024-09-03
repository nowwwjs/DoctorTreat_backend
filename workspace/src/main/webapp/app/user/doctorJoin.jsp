<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/user/doctorJoin.css">
<link rel="stylesheet" href="./../../../css/main/basic.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<title>의사 회원가입</title>
</head>

<body>
	<header>
		<div id="header-fixed">
			<div class="header-holder">
				<div class="header-container">
					<a href="./../../../html/main/main.html">
						<div class="header-logo">
							<img src="./../../../image/logo.png">
							<div>DOCTOR TREAT</div>
						</div>
					</a>
					<div class="header-btnContainer">
						<a href="./../../../html/clinicMember/choice.html">
							<div class="header-quickBtn">
								<img src="./../../../image/chatBtn.png">
								<div>닥터트리톡</div>
							</div>
						</a> <a href="./../../../html/user/member/memberlogin.html">
							<div class="header-quickBtn">
								<img src="./../../../image/login.png">
								<div>로그인</div>
							</div>
						</a> <a href="./../../../html/user/member/memberjoin.html">
							<div class="header-quickBtn">
								<img src="./../../../image/memberJoin.png">
								<div>회원가입</div>
							</div>
						</a> <a href="./../../../html/myPage/doctor/DoctorInfo.html">
							<div class="header-quickBtn">
								<img src="./../../../image/myPage.png">
								<div>마이페이지</div>
							</div>
						</a>
					</div>
				</div>
			</div>
			<div class="header-hr"></div>

			<!-- 네비바 -->
			<div class="header-navContainer">
				<a href="./../../../html/clinicMember/choice.html">
					<div class="header-menu">
						비대면진료 <img src="./../../../image/Clinic.png">
					</div>
				</a> <a href="./../../../html/book/disease.html">
					<div class="header-menu">
						질병백과 <img src="./../../../image/encyclopedia.png">
					</div>
				</a> <a href="./../../../html/board/member/medicalKnowledgeList.html">
					<div class="header-menu">
						의료지식인 <img src="./../../../image/Knowledge.png">
					</div>
				</a> <a href="./../../../html/hospital/hospitalInfo.html">
					<div class="header-menu">
						지역별 병원정보 <img src="./../../../image/hospitalInfo.png">
					</div>
				</a>
			</div>
		</div>
	</header>

	<main class="member-background">
		<div class="Doctor-signup-container">
			<a href="./../../../html/user/member/memberjoin.html">
				<h2>회원가입</h2>
			</a>
			<form action="#" method="post">

				<label for="userId">아이디</label>
				<div class="Doctor-input-group">
					<input class="member-input-focus" type="text" id="userId"
						name="userId" required>
					<button class="Doctor-join-checkIdBtn">중복 확인</button>
					<p class="Doctorjoin-Null"></p>
				</div>

				<label for="password">비밀번호</label>
				<div class="Doctor-input-group">
					<input type="password" id="password" name="password" required>
					<img class="Doctor-view-first" src="./../../../image/view.png">
					<img class="Doctor-noview-first" src="./../../../image/noview.png">
					<p class="Doctorjoin-Null"></p>
				</div>

				<label for="confirm-password">비밀번호 확인</label>
				<div class="Doctor-input-group">
					<input type="password" id="confirm-password"
						name="confirm-password" required> <img
						class="Doctor-view-second" src="./../../../image/view.png">
					<img class="Doctor-noview-second" src="./../../../image/noview.png">
					<p class="Doctorjoin-Null"></p>
				</div>

				<label for="userName">이름</label>
				<div class="Doctor-input-group">
					<input type="text" id="userName" name="userName" required>
					<p class="Doctorjoin-Null"></p>
				</div>

				<label for="importAdress">주소</label>
				<div class="Doctor-input-group">
					<input type="text" id="postcode" placeholder="우편번호">
					<p class="Doctorjoin-Null"></p>
					<button class="postcode-search" onclick="execDaumPostcode()">주소
						찾기</button>
				</div>

				<div class="Doctor-input-group">
					<input type="text" id="address" placeholder="주소">
					<p class="Doctorjoin-Null"></p>
				</div>

				<div class="Doctor-input-group">
					<input type="text" id="detailAddress" placeholder="상세 주소">
					<p class="Doctorjoin-Null"></p>
				</div>

				<label for="phoneNumber">핸드폰 번호</label>
				<div class="Doctor-input-group">
					<input type="text" id="phoneNumber" name="phoneNumber" required>
					<button class="Doctor-join-request">인증 요청</button>
					<p class="Doctorjoin-Null"></p>
				</div>
				<br> <label for="DoctorName">병원이름</label>
				<div class="Doctor-input-group">
					<input type="text" id="DoctorName" name="DoctorName" required>
					<p class="Doctorjoin-Null"></p>
				</div>
				<br> <label for="DoctorLicense">면허번호</label>
				<div class="Doctor-input-group">
					<input type="text" id="DoctorLicense" name="DoctorLicense" required>
					<p class="Doctorjoin-Null"></p>
				</div>
				<br> <label for="DoctormedicalSubject">진료과목</label>
				<div class="Doctor-input-group">
					<input type="text" id="Doctormedicalsubject"
						name="DoctormedicalSubject" required>
					<p class="Doctorjoin-Null"></p>
				</div>
				<br>


				<div class="container">
					<form id="terms-form" action="submit_form.php" method="post">
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
					</form>
				</div>

				<br> <br>

				<button type="submit" class="Doctor-signup-btn">가입하기</button>
			</form>
		</div>
	</main>

	<footer>
		<br>
		<div id="footer-footer">
			<p class="footer-bold-first">(주)닥터트리</p>
			<p class="footer-medium">대표 닥터트리 | 사업자 등록 번호 : 279-88-01452 |
				통신판매업 신고번호 : 2024-서울강남-00439</p>
			<p class="footer-medium">
				강남지점 1관 : 서울특별시 강남구 테헤란로 146 현익빌딩 3,4층 <span
					class="footer-bold-second">사업자 정보 확인</span>
			</p>
			<br>
			<p class="footer-medium">Copyright 2024. 닥터트리 Inc. All rights
				reserved.</p>
			<br>
			<div id="footer-icon">
				<i class="fab fa-instagram"></i> <i
					class="fa-regular fa-comment-dots"></i> <i
					class="fa-regular fa-hospital"></i> <i class="fa-brands fa-youtube"></i>
			</div>
			<br> <br>
		</div>
	</footer>
	<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/user/doctorJoin.js"></script>
</body>

</html>



