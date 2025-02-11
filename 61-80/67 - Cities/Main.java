import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<String> cities = List.of(
                "New York", "Tokyo", "Paris", "London", "Sydney",
                "Rome", "Berlin", "Dubai", "Barcelona", "Cape Town"
        );

        int randomIndex = ThreadLocalRandom.current().nextInt(cities.size());

        System.out.println("You should visit: " + cities.get(randomIndex));
    }
}
