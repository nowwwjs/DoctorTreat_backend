function toggleEditComment(commentId) {
    var editArea = document.getElementById('editArea_' + commentId);
    if (editArea.style.display === 'none' || editArea.style.display === '') {
        editArea.style.display = 'block';  // 
    } else {
        editArea.style.display = 'none';  // 
    }
}

 alert('안녕하세요');