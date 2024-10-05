public class Student {
    String name;
    int age;
    String gender;
    String major;

    public Student(String name, int age, String gender, String major) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
    }

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Major: " + major);
    }
}