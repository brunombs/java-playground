// Write a Java program to divide two numbers and print them on the screen.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input the first number: ");
            double n1 = getDoubleInput(input);

            System.out.println("Input the second number: ");
            double n2 = getDoubleInput(input);

            if (n2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                double result = n1 / n2;
                System.out.println("The division of " + n1 + " and " + n2 + " is: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }
    }

    private static double getDoubleInput(Scanner input) {
        while (true) {
            try {
                return input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                input.next();
            }
        }
    }
}
