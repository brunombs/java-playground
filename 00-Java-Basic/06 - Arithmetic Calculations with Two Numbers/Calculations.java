// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();
        double sum = firstNumber + secondNumber;
        double sub = firstNumber - secondNumber;
        double mul = firstNumber * secondNumber;
        double div = firstNumber / secondNumber;
        double mod = firstNumber % secondNumber;
        System.out.println("The sum is: " + sum);
        System.out.println("The sub is: " + sub);
        System.out.println("The mul is: " + mul);
        System.out.println("The div is: " + div);
        System.out.println("The mod is: " + mod);
    }
}
