public class Main {
    public static void main(String[] args) {
        Appliance refrigerator = new Refrigerator("Lux");
        Appliance washingMachine = new WashingMachine("Eletro");
        refrigerator.turnOn();
        washingMachine.turnOn();
    }
}
