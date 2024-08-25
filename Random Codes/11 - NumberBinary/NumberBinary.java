import java.util.Scanner;

public class NumberBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;

        while (true) {
            System.out.print("Enter a positive integer: ");
            String inputString = input.nextLine();

            try {
                number = Long.parseLong(inputString);
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        String binary = Long.toBinaryString(number);
        System.out.println(number + " in binary is " + binary);

    }
}
