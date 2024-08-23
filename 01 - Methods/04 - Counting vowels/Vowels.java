// Write a Java method to count all vowels in a string.

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        int vowelCount = countVowels(inputString);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    public static int countVowels(String str) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }
}
