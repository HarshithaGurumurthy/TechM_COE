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
