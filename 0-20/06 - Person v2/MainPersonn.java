import java.util.Scanner;

public class MainPersonn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the person: ");
        String name = input.nextLine();
        System.out.print("Enter the age of the person: ");
        int age = input.nextInt();

        Personn you = new Personn(name, age);

        you.printDetails();
    }
}
