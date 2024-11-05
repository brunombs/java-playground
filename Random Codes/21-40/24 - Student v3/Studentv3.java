public class Studentv3 {
    private final String name;
    private double grade1;
    private double grade2;
    private double finalGrade;

    public Studentv3(String name) {
        this.name = name;
    }

    public void addGrade1(double grade1) {
        this.grade1 += grade1;
    }

    public void addGrade2(double grade2) {
        this.grade2 += grade2;
    }

    public void calculateFinalGrade() {
        this.finalGrade += (grade1 + grade2) / 2;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grade for 1st exam: " + grade1);
        System.out.println("Grade for 2nd exam: " + grade2);
        System.out.println("Average: " + finalGrade);
    }

    public static void main(String[] args) {
        Studentv3 student1 = new Studentv3("Bruno");
        student1.addGrade1(9.5);
        student1.addGrade2(8.7);
        student1.calculateFinalGrade();
        student1.displayDetails();
    }
}
