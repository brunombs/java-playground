import java.util.Scanner;

public class BasicAndRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 100: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter a number between 1 and 100: ");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is higher than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is lower than " + secondNumber);
        } else {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }
    }
}
