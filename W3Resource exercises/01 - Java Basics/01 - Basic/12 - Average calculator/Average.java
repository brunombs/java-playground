import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNumber = input.nextDouble();
        System.out.println("Enter the second number: ");
        double secondNumber = input.nextDouble();
        System.out.println("Enter the third number: ");
        double thirdNumber = input.nextDouble();
        double average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.printf("The average of %.2f, %.2f, and %.2f is %.2f%n",
                firstNumber, secondNumber, thirdNumber, average);
    }
}
