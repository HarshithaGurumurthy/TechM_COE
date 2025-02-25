import React, { useState } from 'react';

function App() {
  const [inputText, setInputText] = useState('');
  const [result, setResult] = useState('');

  const checkStringLength = () => {
    if (inputText === '') {
      setResult('Please enter a string.');
      return;
    }

    const length = inputText.length;

    if (length % 2 === 0) {
      setResult(`The length of "${inputText}" is Even 📏`);
    } else {
      setResult(`The length of "${inputText}" is Odd 📏`);
    }
  };

  return (
    <div className="p-6 max-w-md mx-auto bg-white rounded-2xl shadow-md text-center space-y-4">
      <h1 className="text-2xl font-bold">Even or Odd String Length Checker</h1>
      <input
        type="text"
        value={inputText}
        onChange={(e) => setInputText(e.target.value)}
        placeholder="Enter a string"
        className="border p-2 rounded w-full"
      />
      <button
        onClick={checkStringLength}
        className="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600"
      >
        Check
      </button>
      {result && <p className="text-lg font-semibold">{result}</p>}
    </div>
  );
}

export default App;

