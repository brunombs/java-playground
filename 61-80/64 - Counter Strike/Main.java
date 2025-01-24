import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to play as a CT or Terror?");
        String team = input.nextLine();
        while (!team.equalsIgnoreCase("CT") && !team.equalsIgnoreCase("Terror")) {
            System.out.println("Invalid option. Please choose either CT or Terror.");
            team = input.nextLine();
        }
        System.out.println("You're playing as " + team);

        int ctPoints = 0;
        int terrorPoints = 0;
        int round = 1;

        while (round <= 30 && ctPoints < 16 && terrorPoints < 16) {
            System.out.println("\nRound " + round + " - CT: " + ctPoints + " | Terror: " + terrorPoints);
            System.out.println("Who won this round? (CT or Terror)");
            String roundWinner = input.nextLine();

            if (roundWinner.equalsIgnoreCase("CT")) {
                ctPoints++;
            } else if (roundWinner.equalsIgnoreCase("Terror")) {
                terrorPoints++;
            } else {
                System.out.println("Invalid option. Please choose either CT or Terror.");
                continue;
            }

            round++;
        }

        System.out.println("\nFinal Score - CT: " + ctPoints + " | Terror: " + terrorPoints);
        if (ctPoints == 16) {
            System.out.println("CT Wins!");
        } else if (terrorPoints == 16) {
            System.out.println("Terror Wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}