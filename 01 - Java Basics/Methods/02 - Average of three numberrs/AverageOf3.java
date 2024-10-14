// Write a Java method to compute the average of three numbers.

import java.util.Scanner;

public class AverageOf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number");
        double num2 = input.nextDouble();
        System.out.println("Enter the third number");
        double num3 = input.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.printf("The average of %.2f, %.2f, %.2f numbers is %.2f%n",
                num1, num2, num3, average);
    }
}
