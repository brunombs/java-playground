// Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). Implement a parameterized constructor that initializes these variables. Print the values of the variables.

public class Classroom {
    private final String className;
    private final String[] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    public void Print(){
        System.out.println("Class name: " + className);
        System.out.println("Students: ");
        for(String student : students){
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        String[] studentArray = {"Bruno", "Aline", "Julia"};
        String[] studentsOfPython = {"Bruno", "Theodoro", "Lucas"};
        Classroom c1 = new Classroom("Java Constructors", studentArray);
        Classroom c2 = new Classroom("Python 2", studentsOfPython);
        c1.Print();
        c2.Print();
    }
}
