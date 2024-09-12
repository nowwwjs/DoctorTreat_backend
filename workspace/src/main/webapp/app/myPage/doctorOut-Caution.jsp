<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>DoctorTreat - 회원탈퇴 주의사항</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/myPage/doctorOut-Caution.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
</head>

<body>

	<main>
		<div class="DoctorOut-caution-title">회원탈퇴 시 주의사항</div>
		<form action="" method="">
			<div class="DoctorOut-caution-wrap">
				<div class="DoctorOut-caution-check">회원 탈퇴를 신청하기 전, 다음 내용을 꼭
					확인해주세요.</div>
				<div class="DoctorOut-caution-check-text">
					<ul>
						<li>• 고객 정보 및 개인형 서비스 이용 기록은 개인 정보보호 처리 방침 기준에 따라 삭제됩니다.</li>
						<li>• 회원 탈퇴 시 더 이상 닥터트리 서비스 사용이 불가능하며, 닥터트리 공식 사이트에서도 탈퇴
							처리됩니다.</li>
					</ul>
				</div>
				<div class="Doctorout-caution-check-input">
					<input type="checkbox" id="Doctorcheck-input" name="check-input">&nbsp;안내
					사항을 모두 확인하였으며, 이에 동의합니다.
				</div>
			</div>
			<div class="DoctorOut-caution-button">
				<button type="button" id="DoctorOutButton"
					class="DoctorOut-caution-ok">회원 탈퇴</button>
				&nbsp;&nbsp;&nbsp;&nbsp; <a
					href="${pageContext.request.contextPath}/app/myPage/doctorOut-Complete.jsp"><button
						class="DoctorOut-caution-cancell">취소</a>
				</button>
			</div>
		</form>
	</main>


	<script
		src="${pageContext.request.contextPath}/static/js/myPage/doctorOut-Caution.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>