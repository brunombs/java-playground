import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which cities have you visited?");
        ArrayList<String> cities = new ArrayList<>();
        boolean keepGoing = true;


        while (keepGoing){
            String city = scanner.nextLine();

            if (city.equalsIgnoreCase("OK")) {
                keepGoing = false;
            } else {
                cities.add(city);
                System.out.println(city + " has been added to the list of cities that you have visited.");
                System.out.println("Any other? If you don't have another city you can write: 'OK'");
            }
        }

        System.out.println("That's all the cities that you have visited: " + cities);
    }
}
