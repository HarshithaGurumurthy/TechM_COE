fetch("data/schedule.json")
    .then(response => response.json())
    .then(data => {
        let scheduleContainer = document.getElementById("schedule-list");
        data.forEach(session => {
            let div = document.createElement("div");
            div.classList.add("mb-3", "p-3", "border", "rounded");
            div.innerHTML = `
                <h4>${session.title}</h4>
                <p><strong>Time:</strong> ${session.time}</p>
                <p><strong>Speaker:</strong> ${session.speaker}</p>
            `;
            scheduleContainer.appendChild(div);
        });
    })
    .catch(error => console.error("Error loading schedule:", error));
