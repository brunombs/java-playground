// Write a Java program to convert temperature from Fahrenheit to Celsius degrees.

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Fahrenheit: %.2f and Celsius: %.2f%n", fahrenheit, celsius);
    }
}
