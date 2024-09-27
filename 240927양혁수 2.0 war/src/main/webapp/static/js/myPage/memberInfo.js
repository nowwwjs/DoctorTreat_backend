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
			document.getElementById('memberPostcode').value = data.zonecode;
			document.getElementById("memberAddress").value = addr;
			document.getElementById("memberDetailAddress").focus();
		}
	}).open();
}