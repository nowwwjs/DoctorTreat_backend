<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/chatRoom.css">
</head>
<body>
	<%-- <jsp:include page="${pageContext.request.contextPath}/header.jsp" /> --%>
	<!-- 채팅창 -->
	<main>
		<!-- 의사 -->
		<div class="chatRoom-topContainer">
			<div class="chatRoom-title">비대면진료</div>
			<form action="./../../html/clinicMember/chatList.html" method="">
				<button id="chatRoom-exitChatBtn">채팅 나가기</button>
			</form>
		</div>
		<div class="chatRoom-chatBox">
			<div class="chatRoom-doctorChat">
				<div class="chatRoom-doctorName">양혁수 의사</div>
				<div class="chatRoom-doctorMsgContainer">
					<div class="chatRoom-doctorMsg">안녕하세요 어디가 아프신가요?</div>
					<div class="chatRoom-doctorMsgDate">2024.08.28 17:46</div>
				</div>
			</div>
			<!-- 환자 -->
			<div class="chatRoom-memberChat">
				<div class="chatRoom-memberName">송아성</div>
				<div class="chatRoom-memberMsgContainer">
					<div class="chatRoom-memberMsgDate">2024.08.28 17:46</div>
					<div class="chatRoom-memberMsg">목이 아파여</div>
				</div>
			</div>
		</div>

		<div class="chatRoom-areaContainer">
			<textarea id="chatRoom-chatArea" placeholder="의사 입장시 채팅이 가능합니다"></textarea>
		</div>

		<form action="" method="">
			<button id="chatRoom-submit">보내기</button>
		</form>

	</main>
	<%-- <jsp:include page="${pageContext.request.contextPath}/footer.jsp" /> --%>
</body>
</html>