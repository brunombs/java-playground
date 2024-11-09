public abstract class Appliance {
    private final String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void turnOn();
}
