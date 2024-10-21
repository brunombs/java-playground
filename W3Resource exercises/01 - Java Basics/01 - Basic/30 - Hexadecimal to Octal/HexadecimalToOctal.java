// Write a Java program to convert a hexadecimal value into an octal number.

import java.util.Scanner;

public class HexadecimalToOctal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String number = input.nextLine();
        try {
            int decimal = Integer.parseInt(number, 16);
            String octal = Integer.toOctalString(decimal);
            System.out.println("The hexadecimal is: " + number + " and the octal is: " + octal);
        } catch (NumberFormatException e) {
            System.out.println("The entered number is not a hexadecimal number");
        }
    }
}
