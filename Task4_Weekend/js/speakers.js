fetch("data/speakers.json")
    .then(response => response.json())
    .then(data => {
        let speakerContainer = document.getElementById("speakers-list");
        data.forEach(speaker => {
            let div = document.createElement("div");
            div.innerHTML = `
                <img src="${speaker.image}" alt="${speaker.name}">
                <h3>${speaker.name}</h3>
                <p>${speaker.topic}</p>
            `;
            speakerContainer.appendChild(div);
        });
    })
    .catch(error => console.error("Error loading speakers:", error));
