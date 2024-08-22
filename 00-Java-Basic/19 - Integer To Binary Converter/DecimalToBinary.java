// Write a Java program to convert an integer number to a binary number.

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a decimal number: ");
            int decimal = input.nextInt();

            String binary = Integer.toBinaryString(decimal);

            System.out.println("Binary: " + binary);
    }
}
