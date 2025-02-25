import React, { useState } from 'react';

function App() {
  const [inputText, setInputText] = useState('');
  const [result, setResult] = useState('');

  const flowers = ['Rose', 'Jasmine', 'Lotus'];

  const checkIfFlower = () => {
    if (inputText.trim() === '') {
      setResult('Please enter a flower name.');
      return;
    }

    // Case-insensitive comparison
    const isFlower = flowers.some(
      (flower) => flower.toLowerCase() === inputText.trim().toLowerCase()
    );

    if (isFlower) {
      setResult(`✅ "${inputText}" is a flower! 🌸`);
    } else {
      setResult(`❌ "${inputText}" is NOT a flower.`);
    }
  };

  return (
    <div className="p-6 max-w-md mx-auto bg-white rounded-2xl shadow-md text-center space-y-4">
      <h1 className="text-2xl font-bold">Flower Checker 🌺</h1>
      <input
        type="text"
        value={inputText}
        onChange={(e) => setInputText(e.target.value)}
        placeholder="Enter a flower name"
        className="border p-2 rounded w-full"
      />
      <button
        onClick={checkIfFlower}
        className="bg-green-500 text-white px-4 py-2 rounded hover:bg-green-600"
      >
        Check
      </button>
      {result && <p className="text-lg font-semibold">{result}</p>}
    </div>
  );
}

export default App;

