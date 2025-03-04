document.addEventListener("DOMContentLoaded", function () {
    const speakersList = document.getElementById("speakers-list");

    if (!speakersList) {
        console.error("speakers-list div not found!");
        return;
    }

    speakersList.innerHTML = `
        <div class="col-md-4 mb-3">
            <div class="card p-3 shadow-sm">
                <h5 class="card-title">Dr. John Smith</h5>
                <p class="card-text">Expert in Artificial Intelligence and Machine Learning.</p>
            </div>
        </div>
        <div class="col-md-4 mb-3">
            <div class="card p-3 shadow-sm">
                <h5 class="card-title">Jane Doe</h5>
                <p class="card-text">Renowned Tech Innovator and Keynote Speaker.</p>
            </div>
        </div>
        <div class="col-md-4 mb-3">
            <div class="card p-3 shadow-sm">
                <h5 class="card-title">Emily Johnson</h5>
                <p class="card-text">Senior Web Developer and UI/UX Expert.</p>
            </div>
        </div>
    `;

    console.log("Speakers list added successfully!");
});
