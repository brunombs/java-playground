public class LightBulb {
    String cor;
    boolean acesa = false;

    public LightBulb(String cor) {
        this.cor = cor;
    }

    public void turnOn(){
        acesa = true;
    }

    public void turnOff(){
        acesa = false;
    }

    public String getCor() {
        return cor;
    }

    public boolean isOn() {
        return acesa;
    }

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb("white");
        System.out.println("Is the light on? : " + lightBulb.isOn());
        lightBulb.turnOn();
        System.out.println("Color light: " + lightBulb.getCor());
        System.out.println("Is the light on? : " + lightBulb.isOn());
        lightBulb.turnOff();
    }
}
