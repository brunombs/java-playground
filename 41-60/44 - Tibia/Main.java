// improvements:
// set initial hp and mp 185/35 for level 8
// ask level and define hp and mp for that level
// ref: http://tutoriais.mundotibiabr.com/2008/04/tudo-sobre-vocaes.html
// add oz capacity (initial = 470oz, mage+10, rp+20, ek+25)


public class Main {
    public static void main(String[] args) {
        Druid druid = new Druid(10, true);
        druid.printDetails();
        Druid druid2 = new Druid(8, false);
        druid2.printDetails();
    }
}
