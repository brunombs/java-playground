// Write a Java program to print 'Hello' on screen and your name on a separate line.

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input your name:");
            String name = input.nextLine();
            System.out.println("Hello, " + name + "!");
        } catch (Exception e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}
