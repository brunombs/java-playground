// Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = getValidFloater(input, "Enter a number: ");
        if (number == 0){
            System.out.println("The number is zero.");
        } else if (number > 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        if (Math.abs(number) > 1000000){
            System.out.println("Large number.");
        } else if (Math.abs(number) < 1){
            System.out.println("Small number.");
        }
    }

    public static double getValidFloater(Scanner input, String prompt){
        double number;
        while (true){
            System.out.println(prompt);
            try{
                number = input.nextDouble();
                break;
            } catch (InputMismatchException e){
                System.out.println("Please, enter a float number: ");
                input.next();
            }
        }
        return number;
    }
}
