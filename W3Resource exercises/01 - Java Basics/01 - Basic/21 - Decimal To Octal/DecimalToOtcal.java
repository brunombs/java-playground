// Write a Java program to convert a decimal number to an octal number.

import java.util.Scanner;

public class DecimalToOtcal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = input.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
    }
}
