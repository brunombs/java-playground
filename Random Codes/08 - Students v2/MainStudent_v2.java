public class MainStudent_v2 {
    public static void main(String[] args) {
        Student_v2 alice = new Student_v2("Alice", 21, "female", "chemistry");
        Student_v2 bruno = new Student_v2("Bruno", 27, "male", "computer science");

        bruno.setName("Bruno Barreto");
        alice.setAge(23);
        alice.setGender("Female");
        alice.setMajor("history");
        alice.printDetails();
        bruno.printDetails();
    }
}
