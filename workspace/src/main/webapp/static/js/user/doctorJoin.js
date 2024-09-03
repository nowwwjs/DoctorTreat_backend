const focusBtn = document.querySelectorAll(".Doctor-input-group");

// 메시지를 배열로 정의
const messages = [
  "아이디가 필요합니다",
  "비밀번호가 필요합니다",
  "비밀번호확인이 필요합니다",
  "이름이 필요합니다",
  "우편번호가 필요합니다",
  "주소가 필요합니다",
  "상세주소가 필요합니다",
  "전화번호가 필요합니다",
  "병원이름이 필요합니다",
  "면호번호가 필요합니다",
  "진료과목이 필요합니다"
];

focusBtn.forEach((inputGroup, index) => {
  const input = inputGroup.querySelector("input");
  const message = inputGroup.querySelector(".Doctorjoin-Null");

  if (input && message) {
    // 1) 입력창 포커스 했을시에 border 3px blue
    input.addEventListener("focus", () => {
      input.style.outline = "none";
      input.style.border = "3px solid blue";
      message.textContent = "";
      message.style.color = "";
    });

    //    2) 입력창 블러시 값 없으면 빨간색 3px  값 있으면 원래 기본 값
    //    3) 입력창 하단에 값 없을 때 빨간색 글자로 필수 문구
    input.addEventListener("blur", () => {
      if (!input.value) {
        input.style.border = "2px solid red";
        message.textContent = messages[index];
        message.style.color = "red";
      } else {
        input.style.border = "";
        message.textContent = "";
        message.style.color = "";

        // 4) 아이디 : 5~20자의 영문 소문자, 숫자와 특수기호만 사용 가능합니다
        if (index === 0) {
          const usernamePattern =
            /^[a-z0-9!@#$%^&*()_+={}\[\]:;"'<>,.?/~`-]{5,20}$/;
          if (!usernamePattern.test(input.value)) {
            input.style.border = "2px solid red";
            message.textContent =
              "아이디는 5~20자의 영문 소문자, 숫자, 특수기호만 사용 가능합니다.";
            message.style.color = "red";
          }
        }

        // 5) 비밀번호 : 8 ~16자의 영문 대/소문자,숫자, 특수문자를 사용해 주세요
        if (index === 1) {
          const passwordPattern = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[\W_]).{8,16}$/;
          if (!passwordPattern.test(input.value)) {
            input.style.border = "2px solid red";
            message.textContent =
              "비밀번호는 8~16자의 영문 대/소문자, 숫자, 특수문자를 사용해 주세요.";
            message.style.color = "red";
          }
        }
        // 6) 비밀번호 확인 검사 
        if (index === 2) {
          const passwordInput = focusBtn[1].querySelector("input"); 
          if (input.value !== passwordInput.value) {
            input.style.border = "2px solid red";
            message.textContent = "비밀번호가 일치하지 않습니다.";
            message.style.color = "red";
          }
        }
      }
    });
  }
});



//    8) 비밀번호칸 토글 버튼
const viewicon1 = document.querySelector(".Doctor-view-first");
const viewicon2 = document.querySelector(".Doctor-view-second");
const noviewicon1 = document.querySelector(".Doctor-noview-first");
const noviewicon2 = document.querySelector(".Doctor-noview-second");
const passwordInput = document.getElementById('password');
const confirmPasswordInput = document.getElementById('confirm-password');

// 첫 번째 비밀번호 토글
viewicon1.addEventListener("click", () => {
  passwordInput.type = "text"; // 입력 타입을 text로 변경
  viewicon1.style.display = "none";
  noviewicon1.style.display = "block";
});

// 두 번째 비밀번호 확인 토글
viewicon2.addEventListener("click", () => {
  confirmPasswordInput.type = "text"; // 입력 타입을 text로 변경
  viewicon2.style.display = "none";
  noviewicon2.style.display = "block";
});

// 첫 번째 비밀번호 숨김 클릭
noviewicon1.addEventListener("click", () => {
  passwordInput.type = "password"; // 입력 타입을 password로 변경
  noviewicon1.style.display = "none";
  viewicon1.style.display = "block";
});

// 두 번째 비밀번호 확인 숨김 클릭
noviewicon2.addEventListener("click", () => {
  confirmPasswordInput.type = "password"; // 입력 타입을 password로 변경
  noviewicon2.style.display = "none";
  viewicon2.style.display = "block";
});

//    9) 약관동의 전체 체크 기능
// 전체 동의 체크박스
const agreeAllCheckbox = document.getElementById('agree-all-checkbox');
const agreeCheckboxes = document.querySelectorAll('.agree-checkbox');

// 전체 동의 체크박스 클릭 이벤트
agreeAllCheckbox.addEventListener('change', () => {
  agreeCheckboxes.forEach(checkbox => {
    checkbox.checked = agreeAllCheckbox.checked; // 전체 동의 체크박스 상태에 따라 개별 체크박스 상태 변경
  });
});

// 개별 체크박스 클릭 이벤트
agreeCheckboxes.forEach(checkbox => {
  checkbox.addEventListener('change', () => {
    // 전체 동의 체크박스 상태를 업데이트
    const allChecked = Array.from(agreeCheckboxes).every(checkbox => checkbox.checked);
    agreeAllCheckbox.checked = allChecked;
  });
});

// 가입 버튼 클릭 이벤트
document.querySelector(".signup-btn").addEventListener("click", function (event) {
  event.preventDefault();
  const inputs = document.querySelectorAll("input[required]");
  const checkboxes = document.querySelectorAll(".agree-checkbox");
  let allFilled = true;

  // 입력란 확인
  inputs.forEach((input) => {
    if (!input.value) {
      allFilled = false;
    }
  });

  // 체크박스 확인
  const allCheckboxesChecked = Array.from(checkboxes).every(checkbox => checkbox.checked);

  if (!allFilled || !allCheckboxesChecked) {
    alert("입력란과 체크박스를 확인하세요."); // alert 창 표시
  } else {
    window.location.href = "memberJoinfinish.html"; // 이동
  }
});


// 우편번호 api
function execDaumPostcode() {
  new daum.Postcode({
      oncomplete: function(data) {
          var extraAddr = '';

          if (data.userSelectedType === 'R') {
              addr = data.roadAddress;
          } else {
              addr = data.jibunAddress;
          }

          if (data.userSelectedType === 'R') {

              if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
                  extraAddr += data.bname;
              }
              if (data.buildingName !== '' && data.apartment === 'Y') {
                  extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
              }
              if (extraAddr !== '') {
                  extraAddr = ' (' + extraAddr + ')';
              }

              addr += extraAddr;
          }
          document.getElementById('postcode').value = data.zonecode;
          document.getElementById("address").value = addr;
          document.getElementById("detailAddress").focus();
      }
  }).open();
}
