function checkMoviePlan() {
    let response = confirm("Are you planning to watch a film today?");
    return response ? "Enjoy your movie! 🎬" : "Maybe next time! 🍿";
}

console.log(checkMoviePlan());
