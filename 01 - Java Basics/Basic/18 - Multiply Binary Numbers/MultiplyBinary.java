// Write a Java program to multiply two binary numbers.

import java.util.Scanner;

public class MultiplyBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String binary1 = input.nextLine();
        while(!isValidBinary(binary1)) {
            System.out.print("Invalid input. Please enter a valid binary number: ");
            binary1 = input.nextLine();
        }
        System.out.print("Enter a number: ");
        String binary2 = input.nextLine();
        while(!isValidBinary(binary2)) {
            System.out.print("Invalid input. Please enter a valid binary number: ");
            binary2 = input.nextLine();
        }

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);
        int multiply = decimal1 * decimal2;

        String multiplyBinary = Integer.toBinaryString(multiply);

        System.out.println("The multiplication of " + binary1 + " and " + binary2 + " is " + multiplyBinary);

    }

    public static boolean isValidBinary(String str) {
        return str.matches("[01]+");
    }
}
