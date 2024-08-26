// Write a Java program to convert a hexadecimal value into a decimal number.

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String number = input.nextLine();
        try {
            int decimal = Integer.parseInt(number, 16);
            System.out.println("The decimal number is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("The number is not a hexadecimal number");
        }
    }
}
