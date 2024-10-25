import java.util.Scanner;

public class Airplanes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an aircraft type (Airplane, Jet, Helicopter): ");
        String input = scanner.nextLine();

        String result = switch (input.toLowerCase()) {
            case "airplane" -> "It's an airplane.";
            case "jet" -> "It's a jet.";
            case "helicopter" -> "It's a helicopter.";
            case "" -> "It's null or empty!";
            default -> "Unknown type!";
        };

        System.out.println(result);
        scanner.close();
    }
}
