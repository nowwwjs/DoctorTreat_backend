<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/board/boardDetail.css">
</head>
<body>
  <main>
        <!-- 의료지식인 게시글 상세페이지 -->
        <div class="boardDetail-title">의료지식인</div>
        <div class="boardDetail-boardTextContainer">
            <div class="boardDetail-boardTitle">방구 참으면 어떻게 되나요</div>
            <div class="boardDetail-writer">
                <div class="boardDetail-name">김OO</div>
                <div class="boardDetail-date">2024-08-27</div>
            </div>
            <div class="boardDetail-boardText">
                방구참기 챌린지 중인데 혹시 오래참으면 어떻게 되는지 궁금합니다
            </div>
        </div>
        <form action="" class="boardDetail-comentContainer">
            <textarea placeholder="댓글을 달아주세요" class="boardDetail-coment"></textarea>
            <button>등록</button>
        </form>
    </main>
</body>
</html>