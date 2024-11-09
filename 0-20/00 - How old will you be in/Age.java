// This program prompts the user to enter their current age and then calculates and displays their age for each year from 2024 to 2030. It iterates through these years, incrementing the user's age by one each year, and prints the resulting age for each year in the specified range.

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        for(int year= 2024; year<=2030; year++){
            System.out.println("Your age in " + year + " will be " + age + " years old.");
            age++;
        }

    }
}
