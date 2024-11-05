import java.util.Scanner;

public class WhichOS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a OS type (macOS, Linux, Windows, Raspberry): ");
        String input = scanner.nextLine();

        String result = switch (input.toLowerCase()) {
            case "macos" -> "It's a macOS.";
            case "linux" -> "It's a Linux.";
            case "windows" -> "It's a WindowsOS.";
            case "raspberrypi" -> "It's a RaspberrypiOS.";
            case "" -> "It's null or empty!";
            default -> "Unknown type!";
        };

        System.out.println(result);
        scanner.close();
    }
}