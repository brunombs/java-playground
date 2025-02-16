import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GameNameGenerator {
    private final String[] prefixes = {"Cyber", "Medieval", "Zombie", "Space", "Steampunk", "Post-Apocalyptic"};
    private final String[] suffixes = {"Quest", "Simulator", "Survival", "Tycoon", "Chronicles", "Legacy"};
    private final String[] absurdElements = {"of the Toasters", "with Disco Dancing", "and the Carrot Uprising",
            "in Sock Dimension", "vs. Sentient Broccoli", "Featuring Misplaced Penguins"};

    private final Random random = new Random();
    private final Set<String> usedNames = new HashSet<>();
    private final List<String> realGames = Arrays.asList(
            "Cyberpunk 2077", "The Witcher", "Space Quest", "Medieval Survival", "Zombie Tycoon"
    );

    public List<String> generateUniqueNames(int count) {
        List<String> results = new ArrayList<>();
        while (results.size() < count) {
            String name = generateName();
            if (validateName(name)) {
                results.add(name);
                usedNames.add(name);
            }
        }
        return results;
    }

    private String generateName() {
        String prefix = getRandomElement(prefixes);
        String suffix = getRandomElement(suffixes);
        String absurd = getRandomElement(absurdElements);
        return String.format("%s %s %s", prefix, suffix, absurd);
    }

    private boolean validateName(String name) {
        // Check against real games and duplicates
        return !realGames.contains(name.split(" ")[0] + " " + name.split(" ")[1])
                && !usedNames.contains(name);
    }

    private String getRandomElement(String[] array) {
        return array[random.nextInt(array.length)];
    }

    public static void main(String[] args) {
        GameNameGenerator generator = new GameNameGenerator();
        List<String> gameNames = generator.generateUniqueNames(3);

        System.out.println("Generated Game Names:");
        for (int i = 0; i < gameNames.size(); i++) {
            System.out.println((i + 1) + ". " + gameNames.get(i));
        }
    }
}