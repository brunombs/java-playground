// Write a Java program to convert an octal number to a hexadecimal number.

import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = input.nextLine();
        try{
            int decimal = Integer.parseInt(octal, 8);
            String hexadecimal = Integer.toHexString(decimal);
            System.out.println("Hexadecimal: " + hexadecimal);
        } catch(NumberFormatException e){
            System.out.println("Invalid octal number");
        }
    }
}
