<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
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

	<!-- 세션에서 사용자 역할 확인 -->
	<c:set var="memberNumber" value="${sessionScope.memberNumber}"
		scope="session" />
	<c:set var="doctorNumber" value="${chatRoom[0].doctorNumber}"
		scope="session" />
	<c:set var="chatSessionNumber" value="${chatRoom[0].sessionNumber}"
		scope="session" />
	<c:set var="memberName" value="${chatRoom[0].memberName}"
		scope="session" />
	<c:set var="doctorName" value="${chatRoom[0].doctorName}"
		scope="session" />

	<!-- 사용자 정보를 JavaScript로 전달하기 위해 hidden input 사용 -->
	<input type="hidden" id="memberNumber"
		value="${sessionScope.memberNumber}">
	<input type="hidden" id="doctorNumber"
		value="${sessionScope.doctorNumber}">
	<input type="hidden" id="chatSessionNumber"
		value="${sessionScope.chatSessionNumber}">
	<input type="hidden" id="memberName" value="${sessionScope.memberName}">
	<input type="hidden" id="doctorName" value="${sessionScope.doctorName}">

	<main>
		<!-- 채팅방 -->
		<div class="chatRoom-topContainer">
			<div class="chatRoom-title">비대면진료</div>
			<span id="chatRoom-hidden">채팅방 : <span id="chatRoom-info">${chatRoom[0].sessionNumber}</span>
			</span>
			<form
				action="${pageContext.request.contextPath}/chatListMember.memcl"
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
				placeholder="의사회원이 접속하여 진료를 시작할 때 까지 기다려 주세요. 종료시 채팅이 사라질 수 있습니다.">

			<button type="button" id="chatRoom-submit">보내기</button>
		</form>

	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>