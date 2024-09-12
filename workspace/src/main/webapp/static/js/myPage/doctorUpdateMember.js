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
  
  
  
  
  $(document).ready(function() {
   $(".DoctorupdateMember-input").on('click', function() {
      console.log("클릭");
      let memberId = $('#memberId').val();

      $.ajax({
         url: "/doctor/doctorUpdateMember.dm",
         type: "get",
         data: { "memberId": memberId },
         success: function(result) {
            $('#checkIdResult').text(result);
         },
         error : function(){
            $('#checkIdResult').text('오류가 발생했습니다. 다시 시도해주세요');
         }
      });
   });
});