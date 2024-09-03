<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 아이디 찾기 페이지</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/user/memberfindid.css">
</head>
<body>
	<main>
        <!-- <h2 class="findId-page-title">아이디 찾기</h2> -->
        <div class="findId-container">
            <h2 class="findId-page-title">아이디 찾기</h2>
            <br>
            <div class="findId-choicebox">
                <div class="findId-choice"><a href="./../../../html/user/member/memberfindId.html">아이디찾기</a></div>
                <div class="findId-choice"><a href="./../../../html/user/member/memberfindPw.html">비밀번호찾기</a></div>
            </div>
            <section class="findId-form">
                <form>
                    <button type="submit"><a href="./../../../html/myPage/member/memberphoneOk.html" class="findId-phone-a">본인명의 휴대폰으로 인증</button></a>
                    <br><br>
                    <p>회원님의 명의로 등록된</p>
                    <p>휴대폰으로 본인확인을 진행합니다</p>
                </form>
            </section>
        </div>
    </main>
</body>
</html>