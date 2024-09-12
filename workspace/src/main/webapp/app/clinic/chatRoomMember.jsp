<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/chatRoom.css?v=1.0">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script defer
	src="${pageContext.request.contextPath}/static/js/clinic/memberChating.js"></script>
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
	<!-- 채팅창 -->
	<main>
		<!-- 의사 -->
		<div class="chatRoom-topContainer">
			<div class="chatRoom-title">비대면진료</div>
			<span id="chatRoom-hidden">채팅방 : </span><span id="chatRoom-info">${chatRoom[0].sessionNumber}</span>
			<form
				action="${pageContext.request.contextPath}/chatListMember.memcl"
				method="post">
				<button id="chatRoom-exitChatBtn">채팅 목록으로</button>
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

		<form class="chatRoom-areaContainer">
			<input type="text" id="chatRoom-chatArea"
				placeholder="진료는 순차적으로 진행됩니다. 종료시 채팅이 사라질 수 있습니다.">

			<button type="button" id="chatRoom-submit">보내기</button>
		</form>

	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>