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

    public boolean isAcesa() {
        return acesa;
    }

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb("Branco");
        System.out.println("Is the light on? : " + lightBulb.isAcesa());
        lightBulb.turnOn();
        System.out.println(lightBulb.getCor());
        System.out.println("Is the light on? : " + lightBulb.isAcesa());
        lightBulb.turnOff();
    }
}
