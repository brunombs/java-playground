// Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

import java.util.Scanner;

public class IntException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        try {
            isOdd(number);
            System.out.println(number + " is even");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void isOdd(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is odd");
        }
    }
}

