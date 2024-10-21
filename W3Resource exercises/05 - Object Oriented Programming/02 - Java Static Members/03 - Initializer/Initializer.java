// Write a Java program to create a class called "Initializer" with a static block that initializes a static variable 'initialValue' to 1000. Print the value of 'initialValue' before and after creating an instance of "Initializer".

public class Initializer {
    static int initialValue = 1000;

    public static void main(String[] args) {
        System.out.println("Initial value before creating instance: " + Initializer.initialValue);
        Initializer initializer = new Initializer();
        System.out.println("Initial value after creating instance: " + Initializer.initialValue);
    }
}
