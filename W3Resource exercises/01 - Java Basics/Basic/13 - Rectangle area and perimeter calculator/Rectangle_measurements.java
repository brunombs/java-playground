// Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;

public class Rectangle_measurements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.printf("The area is %.2f%n", area);
        System.out.printf("The perimeter is %.2f", perimeter);
    }
}
