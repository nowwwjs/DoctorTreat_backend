<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>DoctorTreat - 회원탈퇴 주의사항</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/myPage/doctorOut-Caution.css">
<link rel="stylesheet" href="./../../../css/main/basic.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

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
						</a> <a href="./../../../html/myPage/member/memberInfo.html">
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
	<main>
		<div class="DoctorOut-caution-title">회원탈퇴 시 주의사항</div>
		<form action="" method="">
			<div class="DoctorOut-caution-wrap">
				<div class="DoctorOut-caution-check">회원 탈퇴를 신청하기 전, 다음 내용을 꼭
					확인해주세요.</div>
				<div class="DoctorOut-caution-check-text">
					<ul>
						<li>• 고객 정보 및 개인형 서비스 이용 기록은 개인 정보보호 처리 방침 기준에 따라 삭제됩니다.</li>
						<li>• 회원 탈퇴 시 더 이상 닥터트리 서비스 사용이 불가능하며, 닥터트리 공식 사이트에서도 탈퇴
							처리됩니다.</li>
					</ul>
				</div>
				<div class="Doctorout-caution-check-input">
					<input type="checkbox" id="Doctorcheck-input" name="check-input">&nbsp;안내
					사항을 모두 확인하였으며, 이에 동의합니다.
				</div>
			</div>
			<div class="DoctorOut-caution-button">
				<button type="button" id="DoctorOutButton"
					class="DoctorOut-caution-ok">회원 탈퇴</button>
				&nbsp;&nbsp;&nbsp;&nbsp; <a
					href="./../../../html/myPage/doctor/DoctorupdateMember.html"><button
						class="DoctorOut-caution-cancell">취소</a>
				</button>
			</div>
		</form>
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
	<script
		src="${pageContext.request.contextPath}/static/js/myPage/doctorOut-Caution.js"></script>
</body>

</html>