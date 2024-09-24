<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/chatRoom.css">
<script defer src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script defer
	src="${pageContext.request.contextPath}/static/js/clinic/doctorChating.js"></script>
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
	<!-- 세션에서 사용자 역할 확인 -->
	<c:set var="memberNumber" value="${chatRoom[0].memberNumber}"
		scope="session" />
	<c:set var="doctorNumber" value="${sessionScope.doctorNumber}"
		scope="session" />
	<c:set var="chatSessionNumber" value="${chatRoom[0].sessionNumber}"
		scope="session" />

	회원번호 ${sessionScope.memberNumber} 의사번호 ${sessionScope.doctorNumber}
	채팅방번호 ${sessionScope.chatSessionNumber}

	<!-- 사용자 정보를 JavaScript로 전달하기 위해 hidden input 사용 -->
	<input type="hidden" id="memberNumber"
		value="${sessionScope.memberNumber}">
	<input type="hidden" id="doctorNumber"
		value="${sessionScope.doctorNumber}">
	<input type="hidden" id="chatSessionNumber"
		value="${sessionScope.chatSessionNumber}">
	<!-- 채팅창 -->
	<main>
		<!-- 의사 -->
		<div class="chatRoom-topContainer">
			<div class="chatRoom-title">비대면진료</div>
			<span id="chatRoom-hidden">채팅방 : <span id="chatRoom-info">${chatRoom[0].sessionNumber}</span>
				/ 의사 : ${chatRoom[0].doctorNumber} / 환자 :
				${chatRoom[0].memberNumber}
			</span>
			<form
				action="${pageContext.request.contextPath}/chatListDoctor.doccl"
				method="post">
				<button id="chatRoom-exitChatBtn">채팅 목록으로</button>
			</form>
		</div>
		<div class="chatRoom-chatBox">
			<div id="chatMessages" class="chat-messages">
				<!-- 채팅 메시지 목록이 여기에 추가됩니다. -->
			</div>
		</div>

		<form class="chatRoom-areaContainer">
			<input type="text" id="chatRoom-chatArea"
				placeholder="진료는 순차적으로 진행됩니다. 종료시 채팅이 사라질 수 있습니다.">

			<button type="button" id="chatRoom-submit">보내기</button>
		</form>

		<!-- 처방전 작성 이동 -->
		<form
			action="${pageContext.request.contextPath}/writeChart.doccl?memberNumber=${memberNumber}"
			method="post">
			<button id="chatRoom-goWriteChart">처방전 작성</button>
		</form>
	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>