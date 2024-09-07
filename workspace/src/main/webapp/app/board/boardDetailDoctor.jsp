<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>의료지식인 게시글 상세페이지</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/board/boardDetail.css">
<jsp:include page="/header.jsp" />
</head>
<body>
  <main>
        <!-- 의료지식인 게시글 상세페이지 -->
        <div class="boardDetail-title">의료지식인</div>
        
        <!-- 게시글 정보 출력 -->
        <div class="boardDetail-boardTextContainer">
            <div class="boardDetail-boardTitle">
                ${boardDetail.medicalInfoTitle} <!-- 게시글 제목 -->
            </div>
            <div class="boardDetail-writer">
                <div class="boardDetail-name">
                    ${boardDetail.memberName} <!-- 작성자 이름 -->
                </div>
                <div class="boardDetail-date">
                    ${boardDetail.medicalInfoDate} <!-- 작성 날짜 -->
                </div>
            </div>
            <div class="boardDetail-boardText">
                ${boardDetail.medicalInfoText} <!-- 게시글 내용 -->
            </div>
        </div>
        
        <!-- 댓글 폼 -->
        <form action="${pageContext.request.contextPath}/postComment.docbo" method="post" class="boardDetail-comentContainer">
            <textarea name="comment" placeholder="댓글을 달아주세요" class="boardDetail-coment"></textarea>
            <button type="submit">등록</button>
        </form>
    </main>
    <jsp:include page="/footer.jsp" />
</body>
</html>