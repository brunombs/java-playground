// Write a Java program that takes two numbers as input and displays the product of two numbers.

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        double result = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
    }
}
