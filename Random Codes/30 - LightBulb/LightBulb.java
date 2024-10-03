public class LightBulb {
    String cor;
    boolean acesa = false;

    public LightBulb(String cor, boolean on) {
        this.cor = cor;
        this.acesa = acesa;
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
        LightBulb lightBulb = new LightBulb("Branco", false);
        System.out.println(lightBulb.isAcesa());
        lightBulb.turnOn();
        System.out.println(lightBulb.getCor());
        System.out.println(lightBulb.isAcesa());
    }
}
