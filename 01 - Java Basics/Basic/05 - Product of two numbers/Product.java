// Write a Java program that takes two numbers as input and displays the product of two numbers.

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            double result = num1 * num2;

            System.out.printf("The product of %.2f and %.2f is %.2f%n", num1, num2, result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numerical values.");
        }
    }
}
