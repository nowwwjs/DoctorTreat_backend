<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
	href="https://unpkg.com/swiper/swiper-bundle.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/myPage/doctorInfo.css">
<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
<title>DoctorTreat - 병원 정보</title>
</head>
<body>


	<div class="DoctorInfo-main-container">
		<div class="DoctorInfo-titlebox">
			<p class="DoctorInfo-title">내 병원 정보</p>
			<hr class="DoctorInfo-hr">
		</div>

		<div class="DoctorInfo-inputbox">
			<form action="${pageContext.request.contextPath}/myPage/doctorPw.dm" method ="post">

				<label class="DoctorInfo-input">이름 :  <input type="text"
					value="${doctorShowInfo.doctorName}" readonly >
				</label> <br> <label class="DoctorInfo-input">병원이름 :  <input
					type="text" value="${doctorShowInfo.hospitalName}" readonly>
				</label> <br> <label class="DoctorInfo-input">의사번호 : <input
					type="text" value="${doctorShowInfo.doctorPhone}" readonly>
				</label> <br> <label class="DoctorInfo-input">병원번호 :<input
					type="text" value="${doctorShowInfo.hospitalCall}" readonly>
				</label> <br> <label class="DoctorInfo-input">주소 :  <input
					type="text" value="${doctorShowInfo. addressPostal} ${doctorShowInfo. addressAddress} ${doctorShowInfo. addressDetail}" readonly>
				</label>

				<button class="DoctorInfo-btn">
					<a href="">병원정보수정</a>
				</button>

			</form>
		</div>
	</div>




	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />




</body>
</html>