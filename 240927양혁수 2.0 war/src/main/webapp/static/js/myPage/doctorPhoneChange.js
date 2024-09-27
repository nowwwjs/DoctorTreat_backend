// 모든 input 필드를 선택
document.querySelectorAll('.DoctorphoneChange-input-field').forEach(inputField => {
    // input 필드에 포커스가 되었을 때
    inputField.addEventListener('focus', function() {
        this.style.borderColor = 'black';  // 테두리 색을 검정색으로 변경
        const textbox = this.nextElementSibling;
        if (textbox && textbox.classList.contains('DoctorphoneChange-textbox')) {
            textbox.style.color = 'black';  // 텍스트 색을 검정색으로 변경
        }
    });

    // input 필드에서 포커스가 벗어났을 때 (블러)
    inputField.addEventListener('blur', function() {
        if (!this.value) {
            this.style.borderColor = 'red';  // 테두리 색을 빨간색으로 변경
            const textbox = this.nextElementSibling;
            if (textbox && textbox.classList.contains('DoctorphoneChange-textbox')) {
                textbox.style.color = 'red';  // 텍스트 색을 빨간색으로 변경
            }
        } else {
            this.style.borderColor = '#ccc';// 값이 있을 경우 기본 테두리 색으로 복원
        }
    });
});







