<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
	href="https://unpkg.com/swiper/swiper-bundle.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/myPage/doctorInfo.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />
<title>DoctorTreat - 병원 정보</title>
</head>
<body>

	<div class="DoctorInfo-main-container">
		<div class="DoctorInfo-titlebox">
			<p class="DoctorInfo-title">내 병원 정보</p>
			<hr class="DoctorInfo-hr">
		</div>

		<div class="DoctorInfo-inputbox">
			<form
				action="${pageContext.request.contextPath}/app/myPage/doctorInfo.do">
				<!-- JSP에서 세션 정보를 사용해 로그인된 의사 정보 출력 -->
				<%
				DoctorDTO doctorInfo = (DoctorDTO) request.getAttribute("doctorInfo");
				%>

				<label class="DoctorInfo-input" for=""> <span>아이디</span> <input
					type="text" value="<%=doctorInfo.getDoctorId()%>" readonly>
				</label> <br> <label class="DoctorInfo-input" for=""> <span>이름</span>
					<input type="text" value="<%=doctorInfo.getDoctorName()%>" readonly>
				</label> <br> <label class="DoctorInfo-input" for=""> <span>병원
						이름</span> <input type="text" value="<%=doctorInfo.getHospitalName()%>"
					readonly>
				</label> <br> <label class="DoctorInfo-input" for=""> <span>휴대폰
						번호</span> <input type="text" value="<%=doctorInfo.getDoctorPhone()%>"
					readonly>
				</label> <br> <label class="DoctorInfo-input" for=""> <span>병원
						번호</span> <input type="text" value="<%=doctorInfo.getHospitalNumber()%>"
					readonly>
				</label> <br> <label class="DoctorInfo-input" for=""> <span>병원
						주소</span> <input type="text" value="<%=doctorInfo.getAddressAddress()%>"
					readonly>
				</label> <br>
			</form>
		</div>

		<button class="DoctorInfo-btn">
			<a href="DoctorpwOk.html">병원정보수정</a>
		</button>
	</div>

	<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</body>
</html>