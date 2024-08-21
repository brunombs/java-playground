// Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i<= 10; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
    }
}
