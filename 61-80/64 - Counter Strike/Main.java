import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
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

            System.out.println("Is the first round a knife round? (yes/no)");
            String knifeRound = input.nextLine();
            while (!knifeRound.equalsIgnoreCase("yes") && !knifeRound.equalsIgnoreCase("no")) {
                System.out.println("Invalid option. Please choose either yes or no.");
                knifeRound = input.nextLine();
            }

            if (knifeRound.equalsIgnoreCase("yes")) {
                System.out.println("The first round is a knife round! Only knives are allowed.");
            } else {
                System.out.println("The first round is a normal round.");
            }

            System.out.println("Do you want to input the results manually or let the game be automatic? (manual/auto)");
            String gameMode = input.nextLine();
            while (!gameMode.equalsIgnoreCase("manual") && !gameMode.equalsIgnoreCase("auto")) {
                System.out.println("Invalid option. Please choose either manual or auto.");
                gameMode = input.nextLine();
            }

            while (round <= 30 && ctPoints < 16 && terrorPoints < 16) {
                System.out.println("\nRound " + round + " - CT: " + ctPoints + " | Terror: " + terrorPoints);

                if (round == 1 && knifeRound.equalsIgnoreCase("yes")) {
                    System.out.println("This is a knife round!");
                } else {
                    System.out.println("This is a normal round.");
                }

                String roundWinner;
                if (gameMode.equalsIgnoreCase("manual")) {
                    System.out.println("Who won this round? (CT or Terror) or type 'exit' to end the game.");
                    roundWinner = input.nextLine();

                    if (roundWinner.equalsIgnoreCase("exit")) {
                        System.out.println("Connection failed. Game finished.");
                        break;
                    }
                } else {
                    roundWinner = random.nextBoolean() ? "CT" : "Terror";
                    System.out.println("The winner of this round is: " + roundWinner);
                }

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

            if (round > 30 || ctPoints == 16 || terrorPoints == 16) {
                System.out.println("\nFinal Score - CT: " + ctPoints + " | Terror: " + terrorPoints);
                if (ctPoints == 16) {
                    System.out.println("CT Wins!");
                } else if (terrorPoints == 16) {
                    System.out.println("Terror Wins!");
                } else {
                    System.out.println("It's a draw!");
                }
            }

            System.out.println("Do you want to play another match? (yes/no)");
            String playAgainInput = input.nextLine();
            while (!playAgainInput.equalsIgnoreCase("yes") && !playAgainInput.equalsIgnoreCase("no")) {
                System.out.println("Invalid option. Please choose either yes or no.");
                playAgainInput = input.nextLine();
            }

            if (playAgainInput.equalsIgnoreCase("no")) {
                playAgain = false;
            }
        }
    }
}