function sumOfDigitsEvenOrOdd(num) {
    let sum = num.toString().split('').reduce((acc, digit) => acc + parseInt(digit), 0);
    console.log(sum % 2 === 0 ? 'Even' : 'Odd');
}

const chooseOperation = () => {
    let operation = 'add';
    let a = 10, b = 5;
    switch (operation) {
        case 'add':
            console.log(a + b);
            break;
        case 'subtract':
            console.log(a - b);
            break;
        case 'multiply':
            console.log(a * b);
            break;
        case 'divide':
            console.log(`Quotient: ${Math.floor(a / b)}, Remainder: ${a % b}`);
            break;
    }
};
