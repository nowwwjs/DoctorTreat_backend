const inputs = document.querySelectorAll('.memberpwOk-input-field');

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