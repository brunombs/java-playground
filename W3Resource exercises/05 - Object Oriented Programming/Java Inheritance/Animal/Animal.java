// Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

public class Animal {
    public void makeSound() {
        System.out.println("Animal sound.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        CatAnimal cat = new CatAnimal();

        animal.makeSound();
        cat.makeSound();
    }
}
