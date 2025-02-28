import React from "react";
import ReactDOM from "react-dom/client";
import Main from "./Main"; // Ensure Main.jsx exists
import "./index.css"; // Ensure index.css exists

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <Main />
  </React.StrictMode>
);
