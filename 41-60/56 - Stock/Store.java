public class Store {
    private double balance;

    public Store(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void sell (Stock item, int quantity){
        if(item.getQuantity() > quantity){
            balance += item.getPrice() * quantity;
            item.reduceQuantity(quantity);
            if (quantity > 1){
                System.out.println("Item sold: " + item.getName());
                System.out.println("Quantitiy of items sold: " + quantity);
                item.getDetails();
            } else {
                System.out.println("One " + item.getName() + " sold");
                item.getDetails();
            }
        } else {
            System.out.println("Out of stock: " + item.getName());
        }
    }
}
