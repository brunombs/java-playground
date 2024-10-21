// Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.InputMismatchException;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = getValidInteger(input, "Enter the first number: ");
        int num2 = getValidInteger(input, "Enter the second number: ");
        int num3 = getValidInteger(input, "Enter the third number: ");

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greater than " + num2 + " and " + num3);
        } else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is greater than " + num1 + " and " + num3);
        } else{
            System.out.println(num1 + " is greater than " + num2 + " and " + num3);
        }
    }

    public static int getValidInteger(Scanner input, String prompt){
        int number;
        while (true){
            System.out.print(prompt);
            try{
                number = input.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Please enter an integer");
                input.next();
            }
        }
        return number;
    }
}
