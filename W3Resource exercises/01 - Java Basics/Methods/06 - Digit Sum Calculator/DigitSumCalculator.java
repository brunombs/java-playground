// Write a Java method to compute the sum of digits in an integer.

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int result = sumOfDigits(number);
        System.out.println("The sum of digits in " + number + " is: " + result);

        scanner.close();
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
