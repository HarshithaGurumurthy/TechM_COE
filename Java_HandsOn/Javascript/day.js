let day=prompt("Enter the day of the week: ").toLowerCase();
switch(day){
    case "monday":
        console.log("Start of the Week!");
        break;
    case "tuesday":
    case "wednesday":
    case "thursday":
        console.log("Mid of the Week!");
        break;
    case "friday":
        console.log("Last working day of the week!");
        break;
    case "saturday":
        console.log("WeekEnd - Saturday!");
        break;
    case "sunday":
        console.log("WeekEnd - Sunday!");
        break;
    default:
        console.log("Invalid Input");
        
}
