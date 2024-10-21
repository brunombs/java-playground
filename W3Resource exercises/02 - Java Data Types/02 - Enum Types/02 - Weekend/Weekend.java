// Write a Java program to create an enum called "Weekend" with constants representing the days of the weekend.

public class Weekend {
    public static void main(String[] args) {
        Weekendd day1 = Weekendd.SATURDAY;
        Weekendd day2 = Weekendd.SUNDAY;
        System.out.println("First day of the weekend: " + day1);
        System.out.println("Second day of the weekend: " + day2);
    }

    public enum Weekendd {
        SATURDAY,
        SUNDAY
    }
}
