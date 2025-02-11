import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("London");
        cities.add("Sydney");
        cities.add("Rome");
        cities.add("Berlin");
        cities.add("Dubai");
        cities.add("Barcelona");
        cities.add("Cape Town");

        Random random = new Random();
        int randomIndex = random.nextInt(cities.size());
        System.out.println("You should visit: " + cities.get(randomIndex));
    }
}
