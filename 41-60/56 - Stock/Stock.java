public class Stock {
    private final String name;
    private final int quantity;
    private final double price;

    public Stock(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("Product name: " + name);
        System.out.println("Product quantity: " + quantity);
        System.out.println("Product price: " + price);
    }
}
