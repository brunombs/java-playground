// Write a Java program that throws an exception and catch it using a try-catch block.

import java.util.Scanner;

public class ExceptionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a random number: ");
        int number = input.nextInt();

        try {
            int[] array = {1, 2, 3};
            System.out.println(array[number]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
