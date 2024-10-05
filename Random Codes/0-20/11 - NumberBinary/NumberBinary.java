import java.util.Scanner;

public class NumberBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;
        boolean userChoice;

        do {
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

            System.out.print("Do you want to convert another number? (yes/no): ");
            String response = input.nextLine().trim().toLowerCase();
            userChoice = response.equals("yes");

        } while (userChoice);

        System.out.println("Bye :)");
    }
}
