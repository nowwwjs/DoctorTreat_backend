<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DoctorTreat</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/clinic/doctorDetail.css">
<script defer
	src="${pageContext.request.contextPath}/static/js/clinic/doctorDetail.js"></script>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=2f5631b219152660381440f62ca9ef14"></script>
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
	<main>
		<div class="doctorDetail-skinny">의사 상세정보</div>
		<div class="doctorDetail-container">
			<div class="doctorDetail-Info">
				<div id="doctorDetail-uiwon">
					${doctorDetail[0].hospitalName} <span id="doctorDetail-uiwon-span">전문의 : ${doctorDetail[0].doctorName}</span>
				</div>
				<div class="doctorDetail-medicine">${doctorDetail[0].doctorMajor}</div>
			</div>
			<div id="doctorDetail-clinic-time">진료시간</div>
			<div class="doctorDetail-hours">
				<div class="doctorDetail-clinics-main">
					<div class="doctorDetail-hours-day-top">
						<div>평일</div>
						<div>08:30 ~ 18:00</div>
					</div>
					<div class="doctorDetail-hours-day-bottom">
						<div>휴진</div>
						<div>주말, 공휴일</div>
					</div>
				</div>
				<div class="doctorDetail-clinics">
					<div class="doctorDetail-closed-top">
						<div>점심시간</div>
						<div>13:00 ~ 14:00</div>
					</div>
					<div class="doctorDetail-closed-bottom">
						<div>야간진료</div>
						<div>없음</div>
					</div>
				</div>
			</div>
			<div class="hospital-phoneNumber">
				<div id="doctorDetail-number">병원 번호</div>
				<div id="doctorDetail-hospital-num">${doctorDetail[0].hospitalCall}</div>
			</div>
			<div class="hospital-address">병원위치</div>
			<div class="hospital-location">
				<!--  -->
				<div class="map_wrap">
					<div id="map"
						style="width: 100%; height: 100%; position: relative; overflow: hidden;"></div>

					<div id="menu_wrap" class="bg_white">
						<div class="option">
							<div>
								<form onsubmit="searchPlaces(); return false;">
									키워드 : <input type="text" value="이태원 맛집" id="keyword" size="15">
									<button type="submit">검색하기</button>
								</form>
							</div>
						</div>
						<hr>
						<ul id="placesList"></ul>
						<div id="pagination"></div>
					</div>
				</div>
				<!--  -->
			</div>
			<form action="${pageContext.request.contextPath}/chatListMember.memcl" method="post" class="hospital-goWrite">
				<button>비대면 진료 신청</button>
			</form>
		</div>
	</main>
	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>