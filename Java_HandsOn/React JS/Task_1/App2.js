import React, { useState } from 'react';

function App() {
  const [arrayInput, setArrayInput] = useState('');
  const [result, setResult] = useState('');

  const checkArrayLength = () => {
    if (arrayInput.trim() === '') {
      setResult('Please enter array elements.');
      return;
    }

    // Convert input string to array
    const elements = arrayInput.split(',').map(item => item.trim()).filter(item => item !== '');

    const length = elements.length;

    if (length % 3 === 0) {
      setResult(`The array has ${length} elements, which IS a multiple of 3 ✅`);
    } else {
      setResult(`The array has ${length} elements, which is NOT a multiple of 3 ❌`);
    }
  };

  return (
    <div className="p-6 max-w-md mx-auto bg-white rounded-2xl shadow-md text-center space-y-4">
      <h1 className="text-2xl font-bold">Array Length Multiple of 3 Checker</h1>
      <input
        type="text"
        value={arrayInput}
        onChange={(e) => setArrayInput(e.target.value)}
        placeholder="Enter array elements (e.g., 9,4,24)"
        className="border p-2 rounded w-full"
      />
      <button
        onClick={checkArrayLength}
        className="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600"
      >
        Check
      </button>
      {result && <p className="text-lg font-semibold">{result}</p>}
    </div>
  );
}

export default App;

