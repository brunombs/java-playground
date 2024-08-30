// Write a Java program that defines an enum called "Months" with constants representing the months of the year.

public class Monthss {
    public static void main(String[] args) {
        int index = 0;

        for (Months month : Months.values()) {
            String suffix = Suffix.values()[index].toString().toLowerCase();
            System.out.println(suffix + " month: " + month.name().toLowerCase());
            index++;
        }
    }

    public enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public enum Suffix {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        FIFTH,
        SIXTH,
        SEVENTH,
        EIGHTH,
        NINTH,
        TENTH,
        ELEVENTH,
        TWELFTH
    }
}
