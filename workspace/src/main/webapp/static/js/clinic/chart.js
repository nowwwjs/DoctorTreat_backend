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
