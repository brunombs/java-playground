// Encapsulamento

public class MainStudent {
    public static void main(String[] args) {
        Student_v2 alice = new Student_v2("Alice", 21, "female", "chemistry");
        Student_v2 bruno = new Student_v2("Bruno", 27, "male", "computer science");

        alice.printDetails();
        bruno.printDetails();
    }
}
