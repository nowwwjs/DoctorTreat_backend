<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/chatRoom.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script defer
	src="${pageContext.request.contextPath}/static/js/clinic/doctorChating.js"></script>
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
	<!-- 채팅창 -->
	<main>
		<!-- 의사 -->
		<div class="chatRoom-topContainer">
			<div class="chatRoom-title">비대면진료</div>
			<span id="chatRoom-hidden">채팅방 : </span><span id="chatRoom-info">${chatRoom[0].sessionNumber}</span>
			<form
				action="${pageContext.request.contextPath}/chatListDoctor.doccl"
				method="post">
				<button id="chatRoom-exitChatBtn">채팅 목록으로</button>
			</form>
		</div>
		<div class="chatRoom-chatBox">	</div>

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