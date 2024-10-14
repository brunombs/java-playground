// Write a Java program to convert a hexadecimal number into a binary number.

import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String number = input.nextLine();
        try {
            int decimal = Integer.parseInt(number, 16);
            System.out.println(Integer.toBinaryString(decimal));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
}
