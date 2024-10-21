// Write a Java program to find the number of days in a month.

import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
            return;
        }

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        if (isLeapYear(year) && month == 2) {
            System.out.println(monthNames[month - 1] + " has 29 days.");
        } else {
            System.out.println(monthNames[month - 1] + " has " + daysInMonth[month - 1] + " days.");
        }

        input.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}