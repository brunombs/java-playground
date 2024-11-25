// improvements:
// set initial hp and mp 185/35 for level 8
// ask level and define hp and mp for that level
// ask if it's promoted and if so update the vocation name

public class Main {
    public static void main(String[] args) {
        Druid druid = new Druid(185, 35, 8);
        druid.printDetails("Druid");
    }
}
