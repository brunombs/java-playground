public class MainPark {
    public static void main(String[] args) {
        RollerCoaster rollerCoaster = new RollerCoaster("Dragon RollerCoaster", 50, 5, 100);
        Carousel carousel = new Carousel("Lizard Carousel", 16, 3, 8);
        rollerCoaster.displayInfo();
        carousel.displayInfo();
    }
}
