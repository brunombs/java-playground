import java.util.Random;
import java.util.Scanner;

public class Lup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of players:");
        int numPlayers = sc.nextInt();
        sc.nextLine();

        String[] players = new String[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter name of player " + (i + 1) + ":");
            players[i] = sc.nextLine();
        }

        int secretNumber = random.nextInt(100) + 1;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            for (String player : players) {
                System.out.println(player + ", enter your guess (1-100):");
                int guess = sc.nextInt();

                if (guess == secretNumber) {
                    System.out.println("Congratulations, " + player + "! You guessed the number!");
                    guessedCorrectly = true;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
        }
    }
}