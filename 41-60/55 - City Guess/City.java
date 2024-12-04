import java.util.Arrays;
import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cities = {"Salvador", "Rio de Janeiro", "Brasília", "São Paulo", "Porto Alegre", "Curitiba", "Maceió"};
        String myCity = cities[0];
        int attempts = 3;

        System.out.println("Let's play a guessing game!");
        System.out.println("""
                Game rules:
                -> You have 3 attempts.
                -> You need to guess in which city the creator of this game was born.
                """);
        System.out.println("Here's the list of cities: " + Arrays.toString(cities));

        while (attempts > 0) {
            System.out.print("Make a guess: ");
            String guess = scanner.nextLine();

            if (guess.equalsIgnoreCase(myCity)) {
                System.out.println("Congratulations! You guessed it right! You still had " + attempts + " attempts remaining.");
                break;
            } else {
                attempts--;
                if (attempts == 1) {
                    System.out.println("Try again! That's your last guess.");
                } else if (attempts > 0) {
                    System.out.println("Try again! You have " + attempts + " attempts remaining.");
                } else {
                    System.out.println("Sorry, you've run out of attempts. Game over!");
                }
            }
        }
    }
}
