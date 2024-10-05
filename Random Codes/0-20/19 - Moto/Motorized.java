public class Motorized {
    public static void main(String[] args) {
        Quadricycle cascadeQuad = new Quadricycle("Red", 1990);
        Moto fernandoMoto = new Moto("Yamaha", "R15");
        Moto myMoto = new Moto("Yamaha", "Nmax");

        System.out.println("Quadricycle: " +
                "Color: " + cascadeQuad.getColor() +
                " Year: " + cascadeQuad.getYear());

        cascadeQuad.setYear(2010);
        cascadeQuad.setColor("Blue");

        System.out.println("New Quadricycle: " +
                "Color: " + cascadeQuad.getColor() +
                " Year: " + cascadeQuad.getYear());

        System.out.println("Fernando's Moto: " +
                "Brand: " + fernandoMoto.getBrand() +
                " Model: " + fernandoMoto.getModel());

        System.out.println("My Moto: " +
                "Brand: " + myMoto.getBrand() +
                " Model: " + myMoto.getModel());

        myMoto.setBrand("None");
        myMoto.setModel("None");

        System.out.println("My Moto: " +
                "Brand: " + myMoto.getBrand() +
                " Model: " + myMoto.getModel());
    }
}
