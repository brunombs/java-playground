// improvements:
// set initial hp and mp 185/35 for level 8
// ask level and define hp and mp for that level
// ref: http://tutoriais.mundotibiabr.com/2008/04/tudo-sobre-vocaes.html
// add oz capacity (initial = 470oz, mage+10, rp+20, ek+25)


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
}
