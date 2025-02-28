import React from "react";
import C1 from "./C1";  // Ensure this file exists
import C2 from "./f1/C2"; // Ensure this file exists inside src/f1

function Main() {
  return (
    <div>
      <h1>Main Component</h1>
      <C1 />
      <C2 />
    </div>
  );
}

export default Main;
