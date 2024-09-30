public class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("Washing (" + getBrand() + ")" + " machine is now on");
    }
}
