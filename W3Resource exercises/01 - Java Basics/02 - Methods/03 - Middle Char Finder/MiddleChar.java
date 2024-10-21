// Write a Java method to display the middle character of a string.

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String value = input.nextLine();
        if (value.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The middle character in the string: " + middle(value));
        }
    }

    public static String middle(String value) {
        int position;
        int length;
        if (value.length() % 2 == 0) {
            position = value.length() / 2 - 1;
            length = 2;
        }
        else {
            position = value.length() / 2;
            length = 1;
        }
        return value.substring(position, position + length);
    }
}
