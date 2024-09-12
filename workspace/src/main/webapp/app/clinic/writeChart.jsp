<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/chart.css?v=1.0">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script defer
	src="${pageContext.request.contextPath}/static/js/clinic/chart.js"></script>
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
	<main>
		<!-- 처방전 작성 -->
		<div id="writeChart-title">처방전 작성</div>
		<div class="chart-notice">
			<span>※ 처방전은 등록 후 <span class="chart-important">수정이 불가</span>합니다
				※
			</span>
		</div>
		<div class="writeChart-container">
			<div class="writeChart-top">처방전</div>
			<!-- 자동입력 정보 -->
			<div class="writeChart-pullInfo">
				<div class="writeChart-memberName">
					<span class="writeChart-pullPushInfo">환자명</span><span
						class="writeChart-pullInner">${chart[0].memberName}</span>
				</div>
				<div class="writeChart-memberNumber">
					<span class="writeChart-pullPushInfo">환자번호</span><span
						class="writeChart-pullInner">${chart[0].memberNumber}</span>
				</div>
				<div class="writeChart-memberBirth">
					<span class="writeChart-pullPushInfo">환자 생년월일</span><span
						class="writeChart-pullInner">${chart[0].memberBirth}</span>
				</div>
				<div class="writeChart-clinicDate">
					<span class="writeChart-pullPushInfo">진료 날짜</span><span
						class="writeChart-pullInner"></span>
				</div>
				<div class="writeChart-hospital">
					<span class="writeChart-pullPushInfo">병원명</span><span
						class="writeChart-pullInner">${chart[0].hospitalName}</span>
				</div>
				<div class="writeChart-doctor">
					<span class="writeChart-pullPushInfo">처방 의사</span><span
						class="writeChart-pullInner">${chart[0].doctorName}</span>
				</div>
			</div>

			<!-- 의사입력 정보 -->
			<form
				action="${pageContext.request.contextPath}/writeChartOk.doccl?memberNumber=${chart[0].memberNumber}"
				method="post">
				<div class="writeChart-pushInfo">
					<div class="writeChart-chartName">
						<span class="writeChart-pullPushInfo">진단명</span><input
							class="writeChart-pushInner" name="chartName"
							placeholder=" ex) 감기"></input>
					</div>
					<div class="writeChart-chartMedicine">
						<span class="writeChart-pullPushInfo">처방약</span><input
							class="writeChart-pushInner" name="chartMedicine"
							placeholder=" ex) 타이레놀"></input>
					</div>
					<div class="writeChart-way">
						<span class="writeChart-pullPushInfo">용량</span><input
							class="writeChart-pushInner" name="chartPeriod"
							placeholder=" ex) 5일분"></input>
					</div>
					<div class="writeChart-way">
						<span class="writeChart-pullPushInfo">복용횟수</span><input
							class="writeChart-pushInner" name="chartDay"
							placeholder=" ex) 1일 3회"></input>
					</div>
					<div class="writeChart-way">
						<span class="writeChart-pullPushInfo">용법 </span>식전 <label
							for="before-meal"><input type="radio" id="after-meal"
							name="chartTime" value="식전"></label> </span> <span>식후 <label
							for="after-meal"><input type="radio" id="after-meal"
								name="chartTime" value="식후" checked></label>
						</span>
						<button id="writeChart-submit">처방전 등록</button>
					</div>
			</form>
		</div>
	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>