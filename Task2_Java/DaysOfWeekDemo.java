enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class DaysOfWeekDemo {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.SUNDAY;
        System.out.println((day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) ? "Holiday" : "Not Holiday");
    }
}

