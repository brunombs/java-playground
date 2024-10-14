//  Write a Java program to convert a octal number to a binary number.

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a octal number: ");
        String octalNumber = input.nextLine();
        int decimal = Integer.parseInt(octalNumber, 8);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number: " + binary);
    }
}
