// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double firstNumber = input.nextDouble();

            System.out.print("Enter the second number: ");
            double secondNumber = input.nextDouble();

            double sum = firstNumber + secondNumber;
            double sub = firstNumber - secondNumber;
            double mul = firstNumber * secondNumber;
            double div = 0;
            double mod = 0;

            if (secondNumber != 0) {
                div = firstNumber / secondNumber;
                mod = firstNumber % secondNumber;
            } else {
                System.out.println("Division by zero is not allowed.");
            }

            System.out.printf("The sum is: %.2f%n", sum);
            System.out.printf("The difference is: %.2f%n", sub);
            System.out.printf("The product is: %.2f%n", mul);
            if (secondNumber != 0) {
                System.out.printf("The division is: %.2f%n", div);
                System.out.printf("The remainder is: %.2f%n", mod);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numerical values.");
        }
    }
}
