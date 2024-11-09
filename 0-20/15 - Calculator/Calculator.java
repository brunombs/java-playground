import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                What do you want to do?:
                [1] Addition
                [2] Subtraction
                [3] Multiplication
                [4] Division
                """);

        int operation = input.nextInt();

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int result;

        switch (operation) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation, please choose a number between 1 and 4.");
                return;
        }

        System.out.println("The result is: " + result);
    }
}