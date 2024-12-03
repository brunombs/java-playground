import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cities = {"Thais", "Venore", "Carlin"};
        System.out.println("Which one of those is your favorite city?");
        for (String city : cities) {
            System.out.println(city);
        }
        String favoriteCity = scanner.nextLine();
        System.out.println("Your favorite city is " + favoriteCity);
    }
}
