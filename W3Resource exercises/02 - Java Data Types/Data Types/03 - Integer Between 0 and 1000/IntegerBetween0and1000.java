// Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerBetween0and1000 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer between 0 and 1000: ");
        int integer;

        while(true) {
            try {
                integer = input.nextInt();
                if (integer < 0 || integer > 1000) {
                    System.out.println("The value has to be between 0 and 1000, try again: ");
                } else {
                    System.out.println("Good job, the number you choose is: " + integer);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Infelizmente você não colocou um número inteiro");
                input.next();
            }
        }


        int sum = 0;
        int number = integer;

        while (number > 0){
            sum += number % 10;
            number = number / 10;
        }
        System.out.println("Sum: " + sum);
    }
}
