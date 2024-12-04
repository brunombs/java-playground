import java.util.Arrays;
import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cities = {"Salvador", "Rio de Janeiro", "Brasília", "São Paulo", "Porto Alegre", "Curitiba", "Maceió"};
        String myCity = cities[0];
        int attempts = 3;
        System.out.println("Let's play a game!");
        System.out.println("""
                Game rules:
                ->You have 3 attempts\
                
                ->You gotta guess in which city the creator of this game was born.""");
        System.out.println("Let's start it. Make a guess based on this list: " + Arrays.toString(cities));
        while (attempts > 0) {
            String guess = scanner.nextLine();
            if (guess.equals(myCity)) {
                System.out.println("That's right :), you still had " + attempts + " attempts");
                break;
            } else {
                System.out.println("Try again");
                attempts--;
            }
        }
    }
}
