// Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.

public class MainStudentt {
    public static void main(String[] args) {
        Studentt Bruno = new Studentt(1, "Bruno", 9.7);
        Studentt Julia = new Studentt(2, "Julia", 9.9);

        System.out.println("StudentID: " + Bruno.studentID + ", name: " + Bruno.studentName + ", grade: " + Bruno.grade);
        System.out.println("StudentID: " + Julia.studentID + ", name: " + Julia.studentName + ", grade: " + Julia.grade);
    }
}
