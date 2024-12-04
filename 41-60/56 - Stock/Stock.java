public class Stock {
    private final String name;
    private int quantity;
    private final double price;

    public Stock(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void reduceQuantity(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Out of stock");
        }
    }

    public void getDetails() {
        System.out.println("----------PRODUCT DETAILS----------");
        System.out.println("Product name: " + name);
        System.out.println("Product quantity: " + quantity);
        System.out.println("Product price: " + price);
        System.out.println("-----------------------------------");
    }

}
