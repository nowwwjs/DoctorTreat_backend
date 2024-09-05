const focusBtn = document.querySelectorAll(".member-input-group");

// 메시지를 배열로 정의
const messages = [
  "아이디가 필요합니다",
  "비밀번호가 필요합니다",
  "비밀번호확인이 필요합니다",
  "이름이 필요합니다",
  "생년월일이 필요합니다",
  "전화번호가 필요합니다",
];

focusBtn.forEach((inputGroup, index) => {
  const input = inputGroup.querySelector("input");
  const message = inputGroup.querySelector(".memberjoin-Null");

  if (input && message) {
    // 1) 입력창 포커스 했을시에 border 3px blue
    input.addEventListener("focus", () => {
      input.style.outline = "none";
      input.style.border = "3px solid blue";
      message.textContent = "";
      message.style.color = "";
    });

    // 2) 입력창 블러시 값 없으면 빨간색 3px 값 있으면 원래 기본 값
    // 3) 입력창 하단에 값 없을 때 빨간색 글자로 필수 문구
    input.addEventListener("blur", () => {
      if (!input.value) {
        input.style.border = "2px solid red";
        message.textContent = messages[index];
        message.style.color = "red";
      } else {
        input.style.border = "";
        message.textContent = "";
        message.style.color = "";
      }
    });
  }
});