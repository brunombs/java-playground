public class Personn {
    String name;
    int age;

    public Personn(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
