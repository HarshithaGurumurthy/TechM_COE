function displayMultiples(firstNumber, secondNumber) {
    let thirdNumber = secondNumber + 40;
    let current = secondNumber;
    while (current <= thirdNumber) {
        if (current % firstNumber === 0) {
            console.log(current);
        }
        current++;
    }
}
displayMultiples(7, 20);
