// 2. Write a Java program to print the sum of two numbers.

import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input the first number: ");
            int n1 = input.nextInt();

            System.out.println("Input the second number: ");
            int n2 = input.nextInt();

            int sum = n1 + n2;
            System.out.println("The sum of " + n1 + "+" + n2 + "=" + sum);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
