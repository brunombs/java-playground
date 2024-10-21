// Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

import java.util.Scanner;

public class CheckFloatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first floating point number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second floating point number: ");
        float num2 = scanner.nextFloat();

        int num1Rounded = Math.round(num1 * 1000);
        int num2Rounded = Math.round(num2 * 1000);

        if (num1Rounded == num2Rounded) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }

        scanner.close();
    }
}
