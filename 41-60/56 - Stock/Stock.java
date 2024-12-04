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

    public void reduceQuantity() {
        if (quantity > 0) {
            quantity --;
        }
    }

    public void getDetails() {
        System.out.println("Product name: " + name);
        System.out.println("Product quantity: " + quantity);
        System.out.println("Product price: " + price);
    }

}
