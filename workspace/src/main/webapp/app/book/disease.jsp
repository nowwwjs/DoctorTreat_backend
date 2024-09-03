<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
	href="https://unpkg.com/swiper/swiper-bundle.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/book/disease.css">
<jsp:include page="${pageContext.request.contextPath}/header.jsp" />

</head>
<body>
	<main>
		<h2>질병 백과</h2>
		<br> <br> <br>
		<div id="disease-title-first">
			<span>내과</span>
			<div class="disease-section-first">
				<div class="disease-detail-first">
					<a href="./../../html/book/bookDetail.html">2도 동상</a>
				</div>
				<div class="disease-detail-first">2도 동상</div>
				<div class="disease-detail-first">2도 동상</div>
				<div class="disease-detail-first">2도 동상</div>
				<div class="disease-detail-first">2도 동상</div>
			</div>
		</div>

		<div id="disease-title-second">
			<span>이비인후과</span>
			<div class="disease-section-second">
				<div class="disease-detail-second">2도 동상</div>
				<div class="disease-detail-second">2도 동상</div>
				<div class="disease-detail-second">2도 동상</div>
				<div class="disease-detail-second">2도 동상</div>
				<div class="disease-detail-second">2도 동상</div>
			</div>
		</div>
	</main>
	<script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/main.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>