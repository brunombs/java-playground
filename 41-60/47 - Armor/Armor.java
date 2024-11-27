public class Armor {
    final private String name;
    final private int def;

    public Armor(String name, int def) {
        this.name = name;
        this.def = def;
    }

    public String getName() {
        return name;
    }

    void printDetails(){
        System.out.println("----------ARMOR DETAILS----------");
        System.out.println("Name: " + name);
        System.out.println("Def: " + def);
    }
}
