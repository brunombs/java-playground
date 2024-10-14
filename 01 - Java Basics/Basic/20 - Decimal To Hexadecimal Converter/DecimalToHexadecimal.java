// Write a Java program to convert a decimal number to a hexadecimal number.

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimal = input.nextInt();
        String hexadecimal = Integer.toHexString(decimal);

        System.out.println(hexadecimal);

    }
}
