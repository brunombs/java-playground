import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();

        System.out.print("Enter the initial balance: ");
        double initialBalance;
        try {
            initialBalance = Double.parseDouble(input.nextLine());
            if (initialBalance < 0) {
                System.out.println("Initial balance cannot be negative.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid initial balance.");
            return;
        }

        try {
            Account account = new Account(accountNumber, initialBalance);
            System.out.println(account);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
