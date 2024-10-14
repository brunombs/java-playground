// Write a Java program that reads a number in inches and converts it to meters.

import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the inches: ");
        double inches = input.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches + " inches is " + meters + " meters");
    }
}
