public class Main {
    public static void main(String[] args) {
        CryptoAccount account = new CryptoAccount(51, 3.213, 1.49);
        account.printDetails();
        account.addBTC(1.93);
        account.addETH(2.1);
        account.printDetails();
    }
}
