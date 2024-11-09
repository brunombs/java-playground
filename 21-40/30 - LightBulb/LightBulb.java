public class LightBulb {
    String cor;
    boolean lit = false;

    public LightBulb(String cor) {
        this.cor = cor;
    }

    public void turnOn(){
        lit = true;
    }

    public void turnOff(){
        lit = false;
    }

    public String getCor() {
        return cor;
    }

    public boolean isOn() {
        return lit;
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
