//1. 버튼 (진료하러가기 , top)
const upBtn = document.getElementById("main-up");
const appearBtn = document.getElementById("main-scroll-book");

window.addEventListener('scroll', () => {
  const scrollTop = document.documentElement.scrollTop || document.body.scrollTop;

  if (scrollTop > 100) {
    appearBtn.style.opacity = "1";
    appearBtn.style.visibility = "visible";
  } else {
    appearBtn.style.opacity = "0";
    appearBtn.style.visibility = "hidden";
  }
});

// top 누르면 맨 위로
upBtn.addEventListener("click", () => {
  window.scrollTo(0, 0);
});

// 2. 슬라이드
var swiper = new Swiper('.swiper-container', {
  loop: true,
  autoplay: {
    delay: 3000, // 3초마다 자동으로 넘어감
    disableOnInteraction: false,
  },
});