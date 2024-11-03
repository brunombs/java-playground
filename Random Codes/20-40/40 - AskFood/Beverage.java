public class Beverage {
    private final String name;
    private final int ml;
    private final double price;

    public Beverage(String name, int ml, double price) {
        this.name = name;
        this.ml = ml;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getMl() {
        return ml;
    }

    public double getPrice() {
        return price;
    }
}
