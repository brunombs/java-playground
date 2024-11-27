public class CryptoAccount {
    private final int accountID;
    private double BTCbalance;
    private double ETHbalance;

    public CryptoAccount(int accountID, double BTCbalance, double ETHbalance) {
        this.accountID = accountID;
        this.BTCbalance = BTCbalance;
        this.ETHbalance = ETHbalance;
    }

    public void addBTC(double amount){
        BTCbalance += amount;
    }

    public void addETH(double amount){
        ETHbalance += amount;
    }

    public void printDetails(){
        System.out.println("-----ACCOUNT DETAILS-----");
        System.out.println("Account ID: " + accountID);
        System.out.println("Bitcoin balance: " + BTCbalance);
        System.out.println("ETH balance: " + ETHbalance);
    }
}
