// Write a Java program to convert an octal number to a decimal number.

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Octal Number: ");
        try{
            String octal = input.nextLine();
            int decimal = Integer.parseInt(octal, 8);
            System.out.println("Octal number is: " + octal + " and the decimal is: "+ decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }

    }

}
