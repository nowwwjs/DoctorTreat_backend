const inputs = document.querySelectorAll('.DoctorOut-input-field');

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



//회원탈퇴 js
function submitDeleteRequest() {
            var doctorId = document.getElementById("doctorId").value;
            var doctorPw = document.getElementById("doctorPw").value;

            // DELETE 요청 전송
            fetch('${pageContext.request.contextPath}/doctor/doctorOutOk.dm', {
                method: 'DELETE',
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded'
                },
                body: new URLSearchParams({
                    'doctorId': doctorId,
                    'doctorPw': doctorPw
                })
            })
            .then(response => {
                if (response.redirected) {
                    window.location.href = response.url;
                } else if (response.status === 401) {
                    document.getElementById("errorMessage").innerText = "비밀번호가 일치하지 않습니다. 다시 입력해주세요.";
                }
            })
            .catch(error => {
                console.error('Error:', error);
            });
        }

