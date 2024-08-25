// Write a Java program to convert a binary number to an octal number.

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        System.out.println("The binary number is: " + binary + " and the octal number is: " + octal);
    }
}
