// Write a Java program to convert a binary number to a decimal number.

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("The binary number is: " + binary + " and the decimal number is: " + decimal);
    }
}
