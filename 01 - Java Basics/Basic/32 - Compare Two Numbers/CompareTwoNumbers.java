// Write a Java program to compare two numbers.

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = getValidNumber(input, "Enter the first number: ");
        int secondNumber = getValidNumber(input, "Enter the second number: ");

        if(firstNumber == secondNumber){
            System.out.println(firstNumber + " = " + secondNumber);
        } else if (firstNumber < secondNumber){
            System.out.println(firstNumber + " < " + secondNumber);
        } else {
            System.out.println(firstNumber + " > " + secondNumber);
        }
    }

    private static int getValidNumber(Scanner input, String prompt) {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try{
                System.out.print(prompt);
                number = input.nextInt();
                validInput = true;
            } catch(InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer!");
                input.next();
            }
        }
        return number;
    }
}