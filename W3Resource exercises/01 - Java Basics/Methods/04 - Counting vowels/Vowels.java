// Write a Java method to count all vowels in a string.

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        String vowelSet = "aeiouAEIOU";
        int vowelCount = 0;

        for (int index = 0; index < inputString.length(); index++) {
            char currentChar = inputString.charAt(index);
            if (vowelSet.indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
