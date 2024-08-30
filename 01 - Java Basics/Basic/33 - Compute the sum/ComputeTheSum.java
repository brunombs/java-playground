// Write a Java program and compute the sum of an integer's digits.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputeTheSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = getValidNumber(input);
        int sumOfDigits = computeSumOfDigits(number);
        System.out.println("The sum of the digits is: " + sumOfDigits);
        input.close();
    }

    private static int getValidNumber(Scanner input) {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                number = input.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next();
            }
        }
        return number;
    }

    private static int computeSumOfDigits(int number) {
        int sum = 0;
        int absNumber = Math.abs(number);

        while (absNumber > 0) {
            sum += absNumber % 10;
            absNumber /= 10;
        }

        return sum;
    }
}