// 안내사항 클릭하지 않았을 시 경고창
document.addEventListener('DOMContentLoaded', function() {
    const memberOutButton = document.getElementById('DoctorOutButton');
    const checkbox = document.getElementById('Doctorcheck-input');

    memberOutButton.addEventListener('click', function() {
        if (!checkbox.checked) {
            alert('안내 사항을 다시 확인해주세요.');
        } else {
            window.location.href = './../../../html/myPage/member/memberOut-complete.html';
        }
    });
});