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
			<form action="">

				<label class="DoctorInfo-input" for=""> <span>아이디</span> <input
					type="text" value="">
				</label> <br> <label class="DoctorInfo-input" for=""> <span>이름</span>
					<input type="text" value="">
				</label> <br> <label class="DoctorInfo-input" for=""> <span>병원
						이름</span> <input type="text" value="">
				</label> <br> <label class="DoctorInfo-input" for=""> <span>휴대폰
						번호</span> <input type="text" value="">
				</label> <br> <label class="DoctorInfo-input" for=""> <span>병원번호</span>
					<input type="text" value="">
				</label> <br> <label class="DoctorInfo-input" for=""> <span>병원
						주소</span> <input type="text" value="">
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