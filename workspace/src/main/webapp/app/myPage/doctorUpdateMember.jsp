<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/myPage/doctorUpdateMember.css">
<script
	src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<jsp:include page="${pageContext.request.contextPath}/headerDoctor.jsp" />
<title>DoctorTreat - 내 병원 정보 수정</title>
</head>
<body>


	<div class="DoctorupdateMember-main-container">
		<div class="DoctorupdateMember-titlebox">
			<p class="DoctorupdateMember-title">내 병원 수정</p>
			<hr class="DoctorupdateMember-hr">
		</div>
		<div class="DoctorupdateMember-inputbox">
			<form action="">

				<label class="DoctorupdateMember-input" for=""> <span>아이디</span>
					<input type="text" value="">
				</label> <br> <label class="DoctorupdateMember-input" for=""> <span>이름</span>
					<input type="text" value="">
				</label> <br> <label class="DoctorupdateMember-input" for=""> <span>비밀번호</span>
					<button>
						<a href="DoctorphoneOk.html">비밀번호 변경</a>
					</button>
				</label> <br> <label class="DoctorupdateMember-input" for=""> <span>병원
						이름</span> <input type="text" value="">
				</label> <br> <label class="DoctorupdateMember-input" for=""> <span>병원
						번호</span> <input type="text" value="">
				</label> <br> <label class="DoctorupdateMember-input" for=""> <span>병원
						주소</span> <input type="text" id="postcode" placeholder="우편번호">
				</label> <br> <label class="DoctorupdateMember-input" for="">
					<button class="postcode-search" onclick="execDaumPostcode()">주소
						찾기</button>
				</label> <br> <label class="DoctorupdateMember-input" for=""> <span></span>
					<input type="text" id="address" placeholder="주소">
				</label> <br> <label class="DoctorupdateMember-input" for=""> <span></span>
					<input type="text" id="detailAddress" placeholder="상세 주소">
				</label>
			</form>
		</div>
		<div class="DoctorupdateMember-botton">
			<button class="DoctorupdateMember-btn">
				<a href="DoctorInfo.html">수정완료</a>
			</button>
			<button class="DoctorupdateMember-btn">
				<a href="DoctorOut.html">회원탈퇴</a>
			</button>
		</div>
	</div>



	<script
		src="${pageContext.request.contextPath}/static/js/myPage/doctorUpdateMember.js"></script>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>