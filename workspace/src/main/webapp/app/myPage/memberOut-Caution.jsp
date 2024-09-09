<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반회원탈퇴동의페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/myPage/memberout-caution.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath}/static/css/main.css" />
<link rel="stylesheet"
   href="https://unpkg.com/swiper/swiper-bundle.min.css" />

<jsp:include page="${pageContext.request.contextPath}/headerMember.jsp" />
</head>
<body>
	<main>
        <div class="memberOut-caution-title">회원탈퇴 시 주의사항</div>
        <form action="" method="">
            <div class="memberOut-caution-wrap">
                <div class="memberOut-caution-check">
                    회원 탈퇴를 신청하기 전, 다음 내용을 꼭 확인해주세요.
                </div>
                <div class="memberOut-caution-check-text">
                    <ul>
                        <li>• 고객 정보 및 개인형 서비스 이용 기록은 개인 정보보호 처리 방침 기준에 따라 삭제됩니다.</li>
                        <li>• 회원 탈퇴 시 더 이상 닥터트리 서비스 사용이 불가능하며, 닥터트리 공식 사이트에서도 탈퇴 처리됩니다. </li>
                    </ul>
                </div>
                <div class="memberout-caution-check-input">
                    <input type="checkbox" id="membercheck-input" name="check-input">&nbsp;안내 사항을 모두 확인하였으며, 이에 동의합니다.
                </div>
            </div>
            <div class="memberOut-caution-button">
                <button type="button" id="memberOutButton" class="memberOut-caution-ok">회원 탈퇴</button>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="./../../../html/myPage/member/memberupdateMember.html"><button class="memberOut-caution-cancell">취소</a></button>
            </div>
        </form>
    </main>
</body>
<jsp:include page="${pageContext.request.contextPath}/footer.jsp" />
</html>