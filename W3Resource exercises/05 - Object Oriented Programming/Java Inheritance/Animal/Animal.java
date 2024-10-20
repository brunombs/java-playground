public class Animal {
    public void makeSound() {
        System.out.println("Animal sound.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        CatAnimal cat = new CatAnimal();
        cat.makeSound();
    }
}
