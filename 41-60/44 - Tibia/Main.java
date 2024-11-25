public static void main(String[] args) {
    Druid druid = new Druid(150, true);
    druid.printDetails();
    Druid druid2 = new Druid(8, false);
    druid2.printDetails();

    Paladin paladin = new Paladin(150, true);
    paladin.printDetails();
    Paladin paladin2 = new Paladin(8, false);
    paladin2.printDetails();

    Knight knight = new Knight(150, true);
    knight.printDetails();
    Knight knight2 = new Knight(8, false);
    knight2.printDetails();

    Sorcerer sorcerer = new Sorcerer(150, true);
    sorcerer.printDetails();
    Sorcerer sorcerer2 = new Sorcerer(8, false);
    sorcerer2.printDetails();
}
