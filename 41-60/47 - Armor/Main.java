public class Main {
    public static void main(String[] args) {
        Armor plate = new Armor("Plate Armor", 10);
        Armor golden = new Armor("Golden Armor", 14);
        Armor mpa = new Armor("Magic Plate Armor", 18);
        Armor scale = new Armor("Scale Armor", 9);
        Armor brass = new Armor("Brass Armor", 8);

        plate.printDetails();
        golden.printDetails();
        mpa.printDetails();
        scale.printDetails();
        brass.printDetails();
    }
}
