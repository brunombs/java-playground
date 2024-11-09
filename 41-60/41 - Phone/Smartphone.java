public class Smartphone extends Cellphone {
    private final String os;
    private final int storage;

    public Smartphone(String brand, String model, double batteryDuration, String os, int storage) {
        super(brand, model, batteryDuration);
        this.os = os;
        this.storage = storage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Operating System: " + os);
        System.out.println("Storage: " + storage);
    }
}
