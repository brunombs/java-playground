import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to play as a CT or Terror?");
        String team = input.nextLine();
        if (team.equals("CT")) {
            System.out.println("You're playing as a CT");
        } else {
            System.out.println("You're playing as a Terror");
        }

    }
}
