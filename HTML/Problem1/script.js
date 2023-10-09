let inputField = document.getElementById('input');

function appendNumber(num) {
    inputField.value += num;
}

function appendOperator(operator) {
    inputField.value += operator;
}

function appendDecimal() {
    inputField.value += '.';
}

function calculateResult() {
    try {
        let result = eval(inputField.value);
        inputField.value = result;
    } catch (error) {
        inputField.value = 'Error';
    }
}

function clearInput() {
    inputField.value = '';
}
