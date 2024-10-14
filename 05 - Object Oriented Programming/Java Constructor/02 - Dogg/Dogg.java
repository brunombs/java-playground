public class Dogg {
    String name;
    String color;

    public Dogg(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printDetails(){
        System.out.println("Dog name: " + name);
        System.out.println("Dog color: " + color);
    }
}
