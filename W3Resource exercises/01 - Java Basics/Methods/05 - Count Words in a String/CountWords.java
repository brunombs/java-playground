// Write a Java method to count all the words in a string.

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = sentence.split("\\s+");
            System.out.println("Word count: " + words.length);
        }
    }
}