// Write a Java program to round up integer division results.

import java.util.Scanner;

public class RoundUpIntegerDivisionResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to divide: ");
        double number = input.nextDouble();
        System.out.println("Enter the number to divide by");
        double divisor = input.nextDouble();
        double result = number / divisor;
        double roundedResult = Math.ceil(result);

        System.out.println("The rounded up result is: " + roundedResult);

    }
}
