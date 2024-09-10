<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/patientList.css">
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
	<main>
		<!-- 환자목록 -->
		<div class="memberList-topContainer">
			<div class="memberList-title">비대면진료</div>
			<form action="${pageContext.request.contextPath}/clinicStartDoctor.doccl" method="get">
				<button id="memberList-exitClinic">진료 끝내기</button>
			</form>
		</div>
		<ul class="memberList-chat">
			<li class="memberList-chatList"><a
				href="./../../html/clinicDoctor/chatRoomDoctor.html">
					<div class="memberList-memberInfoContainer">
						<div class="memberList-name">송아성</div>
						<div class="memberList-birth">1990.02.20</div>
					</div>
			</a> <img
				src="${pageContext.request.contextPath}/static/image/hospital.png">
			</li>
			<li class="memberList-chatList"><a
				href="./../../html/clinicDoctor/chatRoomDoctor.html">
					<div class="memberList-memberInfoContainer">
						<div class="memberList-name">정승환</div>
						<div class="memberList-birth">1994.10.21</div>
					</div>
			</a> <img
				src="${pageContext.request.contextPath}/static/image/hospital.png">
			</li>
			<li class="memberList-chatList"><a
				href="./../../html/clinicDoctor/chatRoomDoctor.html">
					<div class="memberList-memberInfoContainer">
						<div class="memberList-name">김승진</div>
						<div class="memberList-birth">1999.05.31</div>
					</div>
			</a> <img
				src="${pageContext.request.contextPath}/static/image/hospital.png">
			</li>
			<li class="memberList-chatList"><a
				href="./../../html/clinicDoctor/chatRoomDoctor.html">
					<div class="memberList-memberInfoContainer">
						<div class="memberList-name">양혁수</div>
						<div class="memberList-birth">2000.01.30</div>
					</div>
			</a> <img
				src="${pageContext.request.contextPath}/static/image/hospital.png">
			</li>
			<li class="memberList-chatList" id="memberList-chatListBottom">
				<a href="./../../html/clinicDoctor/chatRoomDoctor.html">
					<div class="memberList-memberInfoContainer">
						<div class="memberList-name">이재서</div>
						<div class="memberList-birth">2001.12.27</div>
					</div>
			</a> <img
				src="${pageContext.request.contextPath}/static/image/hospital.png">
			</li>
		</ul>

		<!-- 페이지 -->
		<div class="memberList-page">
			<ul class="memberList-pagenation">
				<li><a href="">1</a></li>
				<li><a href="">2</a></li>
				<li><a href="">3</a></li>
				<li><a href="">4</a></li>
				<li><a href="">5</a></li>
				<li><a href="">&gt</a></li>
			</ul>
		</div>
	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>