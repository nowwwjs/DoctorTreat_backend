<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>의료지식인 게시글 상세페이지</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/board/boardDetail.css?v=1.0" />
    <jsp:include page="/headerDoctor.jsp" />
</head>
<body>
    <main>
        <!-- 의료지식인 게시글 상세페이지 -->
        <div class="boardDetail-title">의료지식인</div>
        
        <!-- 게시글 정보 출력 -->
        
        <div class="boardDetail-boardTextContainer">
            <div class="boardDetail-boardTitle">
                ${doctorBoardshowDetail.medicalInfoTitle} <!-- 게시글 제목 -->
            </div>
            <div class="boardDetail-writer">
                <div class="boardDetail-name">
                    ${doctorBoardshowDetail.memberName} <!-- 작성자 이름 -->
                </div>
                <div class="boardDetail-date">
                    ${doctorBoardshowDetail.medicalInfoDate} <!-- 작성 날짜 -->
                </div>
            </div>
            <div class="boardDetail-boardText">
                ${doctorBoardshowDetail.medicalInfoText} <!-- 게시글 내용 -->
            </div>
        </div>
        
    <!-- 댓글 폼 -->
	<form class="boardDetail-commentContainer" action="${pageContext.request.contextPath}/BoardComment.docbo?infoNumber=${infoNumber}" method="post">
    <input type="hidden" name="medicalInfoNumber" value="${doctorBoardshowDetail.medicalInfoNumber}" />
    <input type="hidden" name="doctorNumber" value="${doctorNumber}" /> <!-- 동적으로 doctorNumber 설정 -->
    <textarea name="doctorCommentText" placeholder="댓글을 달아주세요" class="boardDetail-comment"></textarea>
    <button type="submit">등록</button>
	</form>
    </main>
    <jsp:include page="/footer.jsp" />
</body>
</html>