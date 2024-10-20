// Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159. Create a method to calculate the area of a circle given its radius, using the 'PI' constant. Demonstrate the method in the main method.

import java.util.Scanner;

public class ConstantsPI {
    public static final double PI = 3.14159;

    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = calculateArea(radius);

        System.out.println("The area of " + radius + " is " + area);
    }
}
