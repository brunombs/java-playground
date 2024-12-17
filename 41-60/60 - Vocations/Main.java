import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String[]> content = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("41-60/vocations.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");
                String vocation = tokens[0];
                String promotedVocation = tokens[1];

                content.add(new String[] {vocation, promotedVocation});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (String[] pair : content) {
            String vocation = pair[0];
            String promotedVocation = pair[1];
            System.out.println("Vocation: " + vocation.toUpperCase() + " and the promoted vocation: " + promotedVocation.toUpperCase());
        }
    }
}
