// Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class Circle_Measurements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("The area of the circle is " + area);
        System.out.println("The perimeter of the circle is " + perimeter);
    }
}
