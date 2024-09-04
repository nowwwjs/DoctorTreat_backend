<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/board/medicalKnowledgeList.css">
	<jsp:include page="/header.jsp" /> 
</head>
<body>
<main>
        <div class="medicalKnowledgeList-title">의료지식인</div>
        <div class="medicalKnowledgeList-selectContainer">
            <div id="medicalKnowledgeList-all">전체</div>
        </div>
        <ul class="medicalKnowledgeList-board">
            <li>
                <a href="./../../../html/board/member/boardDetail.html">
                    <div class="medicalKnowledgeList-boardList">운동 부족으로 몸에 점이 생기나요??</div>
                    <div class="medicalKnowledgeList-text">
                        1. 운동부족이 심하면 몸에 점도 생길 수 있나요? 2. 면역력이 떨어졌을때 피부에 점이 생길 수 있는건 자연스러운 건가요?<br> 제가 운동을 잘 안하는데 요즘 자꾸 몸에 점이 올라오네요 ㅠㅠ ...
                    </div>
                    <div class="medicalKnowledgeList-writer">
                       <img src="<%=request.getContextPath()%>/static/image/QnA.png"> 김OO
                    </div>
                </a>
            </li>
            <li>
                <hr>
                <a href="./../../../html/board/member/boardDetail.html">
                    <div class="medicalKnowledgeList-boardList">운동 부족으로 몸에 점이 생기나요??</div>
                    <div class="medicalKnowledgeList-text">
                        1. 운동부족이 심하면 몸에 점도 생길 수 있나요? 2. 면역력이 떨어졌을때 피부에 점이 생길 수 있는건 자연스러운 건가요?<br> 제가 운동을 잘 안하는데 요즘 자꾸 몸에 점이 올라오네요 ㅠㅠ ...
                    </div>
                    <div class="medicalKnowledgeList-writer">
                        <img src="<%=request.getContextPath()%>/static/image/QnA.png"> 김OO
                    </div>
                </a>
            </li>
            <li>
                <hr>
                <a href="./../../../html/board/member/boardDetail.html">
                    <div class="medicalKnowledgeList-boardList">운동 부족으로 몸에 점이 생기나요??</div>
                    <div class="medicalKnowledgeList-text">
                        1. 운동부족이 심하면 몸에 점도 생길 수 있나요? 2. 면역력이 떨어졌을때 피부에 점이 생길 수 있는건 자연스러운 건가요?<br> 제가 운동을 잘 안하는데 요즘 자꾸 몸에 점이 올라오네요 ㅠㅠ ...
                    </div>
                    <div class="medicalKnowledgeList-writer">
                      <img src="<%=request.getContextPath()%>/static/image/QnA.png"> 김OO
                    </div>
                </a>
            </li>
            <li>
                <hr>
                <a href="./../../../html/board/member/boardDetail.html">
                    <div class="medicalKnowledgeList-boardList">운동 부족으로 몸에 점이 생기나요??</div>
                    <div class="medicalKnowledgeList-text">
                        1. 운동부족이 심하면 몸에 점도 생길 수 있나요? 2. 면역력이 떨어졌을때 피부에 점이 생길 수 있는건 자연스러운 건가요?<br> 제가 운동을 잘 안하는데 요즘 자꾸 몸에 점이 올라오네요 ㅠㅠ ...
                    </div>
                    <div class="medicalKnowledgeList-writer">
                        <img src="<%=request.getContextPath()%>/static/image/QnA.png"> 김OO
                    </div>
                </a>
            </li>
            <li>
                <hr>
                <a href="./../../../html/board/member/boardDetail.html">
                    <div class="medicalKnowledgeList-boardList">운동 부족으로 몸에 점이 생기나요??</div>
                    <div class="medicalKnowledgeList-text">
                        1. 운동부족이 심하면 몸에 점도 생길 수 있나요? 2. 면역력이 떨어졌을때 피부에 점이 생길 수 있는건 자연스러운 건가요?<br> 제가 운동을 잘 안하는데 요즘 자꾸 몸에 점이 올라오네요 ㅠㅠ ...
                    </div>
                    <div class="medicalKnowledgeList-writer">
                        <img src="<%=request.getContextPath()%>/static/image/QnA.png"> 김OO
                    </div>
                </a>
            </li>
        </ul>

        <!-- 글쓰기 버튼 -->
        <form action="./../../../html/board/member/write.html">
            <button class="medicalKnowledgeList-goWrite">
                의료지식인 질문하러 가기
            </button>
        </form>

        <!-- 페이지 -->
        <div class="medicalKnowledgeList-page">
            <ul class="medicalKnowledgeList-pagenation">
                <li>
                    <a href="">1</a>
                </li>
                <li>
                    <a href="">2</a>
                </li>
                <li>
                    <a href="">3</a>
                </li>
                <li>
                    <a href="">4</a>
                </li>
                <li>
                    <a href="">5</a>
                </li>
                <li>
                    <a href="">&gt</a>
                </li>
            </ul>
        </div>
    </main>
</body>
<jsp:include page="/footer.jsp" /> 
</html>