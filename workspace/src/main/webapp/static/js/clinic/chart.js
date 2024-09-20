$('.writeChart-pushInner').on('focus', function() {
	$(this).css('border', '1px solid blue');
});

$('.writeChart-pushInner').on('blur', function() {
	// 현재 input 요소
	const $input = $(this);

	// 이미 존재하는 메시지 요소 삭제
	$input.next('.error-message').remove();

	if ($input.val() === '') {
		$input.css('border', '1px solid red');

		// 필수 입력 메시지 생성
		const errorMessage = $('<span class="error-message" style="color: red; font-size: 14px;"> 필수 입력창 입니다.</span>');

		// input 요소 바로 뒤에 메시지 추가
		$input.after(errorMessage);
	} else {
		$input.css('border', ''); // 기본 스타일로 되돌림
	}
});


// 현재 날짜를 진료 날짜에 자동으로 입력하는 함수
const today = new Date();
const year = today.getFullYear();
const month = String(today.getMonth() + 1).padStart(2, '0'); // 월은 0부터 시작하므로 +1
const day = String(today.getDate()).padStart(2, '0');
const formattedDate = `${year}.${month}.${day}`;

// 진료 날짜에 현재 날짜를 자동으로 삽입
$('.writeChart-clinicDate .writeChart-pullInner').text(formattedDate);

const $submitBtn = $('#writeChart-submit');

$submitBtn.on('click', function(event) {
    let allFilled = true;

    // 각 input 요소를 순회하면서 값이 입력되지 않은 경우 체크
    $('.writeChart-pushInner').each(function() {
        if ($(this).val() === '') {
            allFilled = false;
        }
    });

    // 값이 모두 입력되었는지 확인
    if (allFilled) {
        alert('처방전이 등록되었습니다');
        // 폼을 정상적으로 제출
        return true; // 폼 제출을 허용
    } else {
        // 값이 입력되지 않았을 경우 경고를 띄우고 폼 제출을 방지
        alert('오류가 발생했습니다. 값을 입력해주세요.');
        event.preventDefault(); // 폼 제출을 막음
    }
});


