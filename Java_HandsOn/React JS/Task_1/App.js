import React, { useState } from 'react';

function App() {
  const [number, setNumber] = useState('');
  const [result, setResult] = useState('');

  const checkDivisibility = () => {
    if (number === '') {
      setResult('Please enter a number.');
      return;
    }

    const num = Number(number);

    if (isNaN(num)) {
      setResult('Invalid input. Please enter a valid number.');
    } else if (num % 13 === 0) {
      setResult(`${num} is divisible by 13 ✅`);
    } else {
      setResult(`${num} is NOT divisible by 13 ❌`);
    }
  };

