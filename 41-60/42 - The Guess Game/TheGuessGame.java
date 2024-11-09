import java.util.Random;
import java.util.Scanner;

public class TheGuessGame {
    private int numberToGuess;
    private int numberOfTries;
    private boolean hasWon;
    private final int maxTries = 10;

    public TheGuessGame() {
        Random rand = new Random();
        this.numberToGuess = rand.nextInt(100) + 1;
        this.numberOfTries = 0;
        this.hasWon = false;
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the guessing game");
        System.out.println("Please enter your number to guess (between 0-100): ");

        while (!hasWon && numberOfTries < maxTries) {
            System.out.println("Write your guess");
            int guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                hasWon = true;
                System.out.println("You guessed the number " + numberToGuess);
                System.out.println("You used " + numberOfTries + " tries");
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }
        }

        if (!hasWon) {
            System.out.println("Game Over! You've used all " + maxTries + " tries. The number was " + numberToGuess);
        }
    }

    public static void main(String[] args) {
        TheGuessGame game = new TheGuessGame();
        game.play();
    }
}
