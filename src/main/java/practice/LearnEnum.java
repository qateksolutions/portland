package practice;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class LearnEnum {
    Day day;

    LearnEnum(Day day) {
        this.day = day;
    }

    public void dayIsLike() {
        switch (day) {
            case MONDAY:
                System.out.println("Monday is bad");
                break;
            case FRIDAY:
                System.out.println("Friday is better");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best");
                break;
            default:
                System.out.println("Midweek days are so so");
                break;
        }
    }

}
