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
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/user/doctorJoin.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
<title>의사 회원가입</title>
</head>

<body>


	<main class="member-background">
		<div class="Doctor-signup-container">
			<!--   <a href="./../../../html/user/member/memberjoin.html">
			</a> -->
			<form action="${pageContext.request.contextPath}/doctor/doctorJoin.do" method="get">
				<h2>회원가입</h2>

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
						class="Doctor-view-second" src="${pageContext.request.contextPath}/static/image/view.png">
					<img class="Doctor-noview-second" src="${pageContext.request.contextPath}/static/image/noview.png">
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


	<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/js/user/doctorJoin.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>



