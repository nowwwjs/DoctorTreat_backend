<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/chatListMember.css">
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
	<main>
		<!-- 채팅목록 타이틀-->
		<div class="chatList-choice">채팅목록</div>
		<!-- 채팅목록 과별 -->
		<div class="chatList-department">
			<div class="chatList-otolaryngology">이비인후과</div>
			<div class="chatList-medicine">내과</div>
		</div>
		<!-- 채팅목록 의사 상세-->
		<div class="chatList-container">
			<div class="chatList-container-detail">
				<div class="chatList-wrap-ear">

					<div class="chatList-ear">
						<a href="http://localhost:8888/app/clinic/chatRoomMember.memcl">
							<div class="chatList-name">정승환</div>
							<div class="chatList-License-number">12345678</div>
						</a>
					</div>
					<div class="chatList-img">
						<img
							src="${pageContext.request.contextPath}/static/image/hospital.png">
					</div>
				</div>
				<div class="chatList-wrap-ear">
					<div class="chatList-ear">
						<a href="./../../html/clinicMember/chatRoom.html">
							<div class="chatList-name">이재서</div>
							<div class="chatList-License-number">12345678</div>
						</a>
					</div>
					<div class="chatList-img">
						<img
							src="${pageContext.request.contextPath}/static/image/hospital.png">
					</div>
				</div>
				<div class="chatList-wrap-medicine-top">
					<div class="chatList-ear">
						<a href="./../../html/clinicMember/chatRoom.html">
							<div class="chatList-name">김승진</div>
							<div class="chatList-License-number">12345678</div>
						</a>
					</div>
					<div class="chatList-img">
						<img
							src="${pageContext.request.contextPath}/static/image/hospital.png">
					</div>
				</div>
				<div class="chatList-wrap-medicine-bottom">
					<div class="chatList-ear">
						<a href="./../../html/clinicMember/chatRoom.html">
							<div class="chatList-name">양혁수</div>
							<div class="chatList-License-number">12345678</div>
						</a>
					</div>
					<div class="chatList-img">
						<img
							src="${pageContext.request.contextPath}/static/image/hospital.png">
					</div>
				</div>
			</div>
		</div>
	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>