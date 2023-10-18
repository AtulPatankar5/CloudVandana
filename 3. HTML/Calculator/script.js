let string = "";
let buttons = document.querySelectorAll('.button');

Array.from(buttons).forEach((button) => {
    button.addEventListener('click', (e) => {
        if (e.target.innerHTML === '=') {
            string = String(eval(string)); // Convert the result to a string
        } else if (e.target.innerHTML === 'AC') {
            string = ''; // Clear the string
        } else {
            string = string + e.target.innerHTML;
        }
        document.querySelector('input').value = string;
    });
});