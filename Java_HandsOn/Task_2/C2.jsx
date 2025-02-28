import React, { lazy, Suspense } from "react";
import C5 from "../external/C5"; // Fixed import for C5

const C3 = lazy(() => import("./C3")); // Lazy load C3
const C4 = lazy(() => import("../external/C4")); // Lazy load C4

function C2() {
  return (
    <div>
      <h2>Component C2</h2>
      <Suspense fallback={<p>Loading C3 and C4...</p>}>
        <C3 />
        <C4 />
      </Suspense>
      <C5 />
    </div>
  );
}

export default C2;
