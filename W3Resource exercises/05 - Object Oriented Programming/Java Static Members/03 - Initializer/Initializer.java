public class Initializer {
    static int initialValue = 1000;

    public static void main(String[] args) {
        System.out.println("Initial value before creating instance: " + Initializer.initialValue);
        Initializer initializer = new Initializer();
        System.out.println("Initial value after creating instance: " + Initializer.initialValue);
    }
}
