public abstract class Appliance {
    private final String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public abstract void turnOn();
}
