const inputs = document.querySelectorAll('.DoctorPhoneOk-input-field');

inputs.forEach(input => {
    input.addEventListener('focus', () => {
        input.classList.add('focus');
    });

    input.addEventListener('blur', () => {
        if (input.value.trim() === '') {
            input.classList.remove('focus');
            input.classList.add('blur');
        } else {
            input.classList.remove('blur');
            input.classList.remove('focus');
        }
    });
});

const phoneInput = document.getElementById('phoneInput');
const errorMessage = document.getElementById('errorMessage');
const errorText = document.getElementById('errorText');

phoneInput.addEventListener('focus', function() {
    errorMessage.style.display = 'none'; // 포커스 시 에러 메시지 숨김
    errorText.classList.remove('error'); // 에러 클래스 제거
});

phoneInput.addEventListener('blur', function() {
    if (phoneInput.value.trim() === '') {
        errorMessage.style.display = 'block'; // 값이 없을 때 에러 메시지 보임
        errorText.classList.add('error'); // 빨간색으로 변경
    } else {
        errorMessage.style.display = 'none'; // 값이 있을 때 에러 메시지 숨김
        errorText.classList.remove('error'); // 에러 클래스 제거
    }
});




