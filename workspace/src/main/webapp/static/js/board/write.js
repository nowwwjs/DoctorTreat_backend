// 게시글 등록 버튼 클릭 시 상세 페이지로 이동
document.querySelector('.member-write-register').addEventListener('click', function(event) {
    event.preventDefault();
    var confirmation = confirm("게시글 등록하시겠습니까?");
    if (confirmation) {
        window.location.href = "./../../board/member/boardDetailAuth.html";
    } else {}
});