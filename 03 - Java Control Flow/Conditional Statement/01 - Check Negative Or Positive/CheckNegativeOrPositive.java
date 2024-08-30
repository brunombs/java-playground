import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckNegativeOrPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        while (true){
            try {
                int firstNumber = input.nextInt();
                if (firstNumber < 0){
                    System.out.println("Negative number");
                } else if (firstNumber > 0){
                    System.out.println("Positive number");
                } else {
                    System.out.println("Zero");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, enter a valid integer: ");
                input.next();
            }
        }
    }
}
