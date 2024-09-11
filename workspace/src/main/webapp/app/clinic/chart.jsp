<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/chart.css">
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
	<main>
		<!-- 처방전 작성 -->
		<div id="writeChart-title">처방전 확인</div>
		<div class="chart-notice">
			<span>※ 처방전은 가장 <span class="chart-important">최근 1건만</span>
				노출됩니다 ※
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
				<div class="writeChart-memberBirth">
					<span class="writeChart-pullPushInfo">환자 생년월일</span><span
						class="writeChart-pullInner">${chart[0].memberBirth}</span>
				</div>
				<div class="writeChart-clinicDate">
					<span class="writeChart-pullPushInfo">진료 날짜</span><span
						class="writeChart-pullInner">${chart[0].chartWriteDate}</span>
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
			<div class="writeChart-pushInfo">
				<div class="writeChart-chartName">
					<span class="writeChart-pullPushInfo">진단명</span><span
						class="writeChart-pushInner">${chart[0].chartName}</span>
				</div>
				<div class="writeChart-chartMedicine">
					<span class="writeChart-pullPushInfo">처방약</span><span
						class="writeChart-pushInner">${chart[0].chartMedicine}</span>
				</div>
				<div class="writeChart-way">
					<span class="writeChart-pullPushInfo">용량</span><span
						class="writeChart-pushInner">${chart[0].chartPeriod}</span>
				</div>
				<div class="writeChart-way">
					<span class="writeChart-pullPushInfo">복용횟수</span><span
						class="writeChart-pushInner">${chart[0].chartDay}</span>
				</div>
				<div class="writeChart-way">
					<span class="writeChart-pullPushInfo">용법</span><span
						class="writeChart-pushInner">${chart[0].chartTime}</span>
				</div>
			</div>
		</div>
	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>