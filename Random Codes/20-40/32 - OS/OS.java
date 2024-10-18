import java.util.*;

public class OS {
    public static void main(String[] args) {
        Random random = new Random();

        String[] systems = {"Linux", "MacOS", "Windows"};

        int index = random.nextInt(systems.length);

        String chosen = systems[index];

        System.out.println("The selected OS is " + chosen);
    }
}
