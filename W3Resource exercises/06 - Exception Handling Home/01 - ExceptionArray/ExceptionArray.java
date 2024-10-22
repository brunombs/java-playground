// Write a Java program that throws an exception and catch it using a try-catch block.

import java.util.Scanner;

public class ExceptionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        System.out.println("Choose a random number: ");
        int number = input.nextInt();

        try {
            System.out.println(array[number]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
