// Write a Java program to solve quadratic equations (use if, else if and else).

import java.util.Scanner;

public class SolveQuadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        double a = input.nextDouble();
        System.out.print("Enter the second number (b): ");
        double b = input.nextDouble();
        System.out.print("Enter the third number (c): ");
        double c = input.nextDouble();

        double discriminant = b * b - 4.0 * a * c;

        if (discriminant > 0.0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are: " + root1 + " and " + root2);
        } else if (discriminant == 0.0) {
            double root = -b / (2.0 * a);
            System.out.println("The root is: " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}