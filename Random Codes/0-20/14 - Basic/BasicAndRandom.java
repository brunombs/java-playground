import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicAndRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        while (true) {
            System.out.print("Enter a number between 1 and 100: ");
            try {
                firstNumber = input.nextInt();
                if (isValidRange(firstNumber)) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 100.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
            }
        }

        while (true) {
            System.out.print("Enter another number between 1 and 100: ");
            try {
                secondNumber = input.nextInt();
                if (isValidRange(secondNumber)) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 100.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
            }
        }

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is higher than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is lower than " + secondNumber);
        } else {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }

    }

    public static boolean isValidRange(int number) {
        return number >= 1 && number <= 100;
    }
}
