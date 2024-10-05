// Write a Java method to find the smallest number among three numbers.

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first_number = input.nextInt();
        System.out.print("Enter the second number: ");
        int second_number = input.nextInt();
        System.out.print("Enter the third number: ");
        int third_number = input.nextInt();

        if (first_number < second_number && first_number < third_number) {
            System.out.println("The smallest number is " + first_number);
        }
        else if (second_number < first_number && second_number < third_number) {
            System.out.println("The smallest number is " + second_number);
        }
        else {
            System.out.println("The smallest number is " + third_number);
        }
    }
}
