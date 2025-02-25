import React, { useState } from 'react';

function App() {
  const [inputText, setInputText] = useState('');
  const [result, setResult] = useState('');

  const checkForVowels = () => {
    if (inputText.trim() === '') {
      setResult('Please enter a string.');
      return;
    }

    // Regular expression to check for vowels (case-insensitive)
    const vowelRegex = /[aeiou]/i;

    if (vowelRegex.test(inputText)) {
      setResult(`The string "${inputText}" contains at least one vowel ✅`);
    } else {
      setResult(`The string "${inputText}" does NOT contain any vowels ❌`);
    }
  };

  return (
    <div className="p-6 max-w-md mx-auto bg-white rounded-2xl shadow-md text-center space-y-4">
      <h1 className="text-2xl font-bold">Vowel Checker 🔤</h1>
      <input
        type="text"
        value={inputText}
        onChange={(e) => setInputText(e.target.value)}
        placeholder="Enter a string"
        className="border p-2 rounded w-full"
      />
      <button
        onClick={checkForVowels}
        className="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600"
      >
        Check
      </button>
      {result && <p className="text-lg font-semibold">{result}</p>}
    </div>
  );
}

export default App;

