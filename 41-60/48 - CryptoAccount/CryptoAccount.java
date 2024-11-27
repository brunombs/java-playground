public class CryptoAccount {
    private int accountID;
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

    public int getAccountID() {
        return accountID;
    }

    public double getBTCbalance() {
        return BTCbalance;
    }

    public double getETHbalance() {
        return ETHbalance;
    }
}
