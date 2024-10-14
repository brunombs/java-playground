// Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckNegativeOrPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            try {
                System.out.print("Enter an integer: ");
                int firstNumber = input.nextInt();
                if (firstNumber < 0){
                    System.out.println("Negative number");
                } else if (firstNumber > 0){
                    System.out.println("Positive number");
                } else {
                    System.out.println("Zero");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, enter a valid integer: ");
                input.next();
            }
        }
    }
}
