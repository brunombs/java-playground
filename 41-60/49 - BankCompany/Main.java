public class Main {
    public static void main(String[] args) {
        Bank itau = new Itau(false);
        Bank nubank = new Nubank(true);
        Bank inter = new Inter(true);
        Bank bradesco = new Bradesco(false);

        System.out.println("Is Itau a digital bank?: " + itau.isDigitalBank);
        System.out.println("Is Nubank a digital bank?: " + nubank.isDigitalBank);
        System.out.println("Is Inter a digital bank?: " + inter.isDigitalBank);
        System.out.println("Is Bradesco a digital bank?: " + bradesco.isDigitalBank);
    }
}
