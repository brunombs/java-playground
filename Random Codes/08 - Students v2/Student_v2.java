public class Student_v2 {
    private String name;
    private int age;
    private String gender;
    private String major;

    public Student_v2(String name, int age, String gender, String major) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Major: " + major);
    }
}
