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
            System.out.println("Is this a knife round or a normal round? (knife/normal)");
            String roundType = input.nextLine();

            while (!roundType.equalsIgnoreCase("knife") && !roundType.equalsIgnoreCase("normal")) {
                System.out.println("Invalid option. Please choose either knife or normal.");
                roundType = input.nextLine();
            }

            if (roundType.equalsIgnoreCase("knife")) {
                System.out.println("This is a knife round! Only knives are allowed.");
            } else {
                System.out.println("This is a normal round.");
            }

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