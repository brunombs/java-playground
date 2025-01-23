import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to play as a CT or Terror?");
        String team = input.nextLine();
        if (team.equalsIgnoreCase("CT")) {
            System.out.println("You're playing as CT");
        } else if (team.equalsIgnoreCase("Terror")) {
            System.out.println("You're playing as Terror");
        } else {
            System.out.println("Invalid option. Please choose either CT or Terror.");
        }

        System.out.println("Would you like to play against real players or bots?");
        String oponentTeam = input.nextLine();
    }
}
