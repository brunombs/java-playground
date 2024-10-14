// Write a Java program to convert a binary number to a hexadecimal number.

import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal number: " + hexadecimal.toUpperCase());
    }
}
