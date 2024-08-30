// Write a Java program to create an enum called "DaysOfWeek" representing the days of the week.

import java.util.Arrays;

public class DaysOfWeek {
    public static void main(String[] args) {
        Days_Of_Week today = Days_Of_Week.FRIDAY;
        Days_Of_Week tomorrow = Days_Of_Week.SATURDAY;
        Days_Of_Week yesterday = Days_Of_Week.valueOf("THURSDAY");
        System.out.println("Today is: " + today);
        System.out.println("Tomorrow will be: " + tomorrow);
        System.out.println("Yesterday was: " + yesterday);
        System.out.println("The days of the week are: " + Arrays.toString(Days_Of_Week.values()));
    }

    public enum Days_Of_Week {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
}
