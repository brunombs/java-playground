public class Store {
    private double balance;

    public Store(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void sell (Stock item){
        if(item.getQuantity() > 0){
            balance += item.getPrice();
            item.reduceQuantity();
            System.out.println("Sold one " + item.getName());
        } else {
            System.out.println("Out of stock: " + item.getName());
        }
    }
}
