// Write a Java program to add two binary numbers.

import java.util.Scanner;

public class BinaryNumbers {
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

        int sumDecimal = decimal1 + decimal2;

        String sumBinary = Integer.toBinaryString(sumDecimal);


        System.out.println(sumBinary);
    }

    public static boolean isValidBinary(String str) {
        return str.matches("[01]+");
    }
}
