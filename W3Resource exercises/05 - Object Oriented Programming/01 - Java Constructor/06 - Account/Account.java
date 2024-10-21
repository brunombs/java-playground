public class Account {
    private final String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number can't be null or empty.");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be non-negative.");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account number: " + accountNumber + ", Balance: " + balance;
    }
}