public class Cellphone {
    private String brand;
    private String model;
    private double batteryDuration;

    public Cellphone(String brand, String model, double batteryDuration) {
        this.brand = brand;
        this.model = model;
        this.batteryDuration = batteryDuration;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery duration: " + batteryDuration);
    }
}
