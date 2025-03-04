document.addEventListener("DOMContentLoaded", function () {
    const scheduleData = [
        { time: "09:00 AM", event: "Opening Ceremony", speaker: "Dr. John Smith" },
        { time: "10:00 AM", event: "Keynote Speech", speaker: "Jane Doe" },
        { time: "11:00 AM", event: "Panel Discussion: Future of AI", speaker: "Various Experts" },
        { time: "12:30 PM", event: "Lunch Break", speaker: "" },
        { time: "02:00 PM", event: "Workshop: Web Development", speaker: "Emily Johnson" },
        { time: "04:00 PM", event: "Closing Remarks", speaker: "Conference Committee" },
    ];

    const scheduleList = document.getElementById("schedule-list");

    scheduleData.forEach((item) => {
        const eventCard = document.createElement("div");
        eventCard.classList.add("col-md-6", "mb-3");

        eventCard.innerHTML = `
            <div class="card p-3 shadow-sm">
                <h5 class="card-title">${item.time} - ${item.event}</h5>
                <p class="card-text"><strong>Speaker:</strong> ${item.speaker || "N/A"}</p>
            </div>
        `;

        scheduleList.appendChild(eventCard);
    });
});
