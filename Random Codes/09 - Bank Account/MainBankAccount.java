public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount conta = new BankAccount("Bruno", 450.30);
        BankAccount conta1 = new BankAccount("João", 250.33);
        System.out.println("A conta de " + conta.getAccountHolder() + " tem R$" + conta.getBalance());
        conta.deposit(100);
        System.out.println("A conta de " + conta.getAccountHolder() + " tem R$" + conta.getBalance());
        System.out.println("A conta de " + conta1.getAccountHolder() + " tem R$" + conta1.getBalance());
        conta1.withdraw(245.02);
        System.out.println("A conta de " + conta1.getAccountHolder() + " tem R$" + conta1.getBalance());
        conta1.deposit(300.69);
        System.out.println("A conta de " + conta1.getAccountHolder() + " tem R$" + conta1.getBalance());
        conta1.setAccountHolder("Tonico");
        System.out.println("A conta de " + conta1.getAccountHolder() + " tem R$" + conta1.getBalance());
    }
}
