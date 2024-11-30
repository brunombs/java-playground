import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Buyer buyer = new Buyer(1000);
        ArrayList<String> items = new ArrayList<>();
        items.add("mana potion");
        items.add("sudden death rune");
        items.add("ultimate healing rune");
        System.out.println("Eremo says: Hello, what do you wanna buy today?");
        String answer = scanner.nextLine();

        if (!items.contains(answer.toLowerCase())) {
            System.out.println("Sorry, I only sell those items: " + items);
        } else {
            int itemPrice = 0;
            String itemName = "";
            int quantity = 0;

            if (answer.equalsIgnoreCase("mana potion")) {
                itemPrice = 56;
                itemName = "mana potion";
                System.out.println("How many mana potions?");
                quantity = scanner.nextInt();
            } else if (answer.equalsIgnoreCase("sudden death rune")) {
                itemPrice = 162;
                itemName = "sudden death rune";
                System.out.println("How many sudden death runes?");
                quantity = scanner.nextInt();
            } else if (answer.equalsIgnoreCase("ultimate healing rune")) {
                itemPrice = 175;
                itemName = "ultimate healing rune";
                System.out.println("How many ultimate healing runes?");
                quantity = scanner.nextInt();
            }


            int totalCost = cost(itemPrice, quantity);

            if (buyer.balance >= totalCost) {
                buyer.balance -= totalCost;
                System.out.println("OK, here you are " + quantity + " " + itemName);
                System.out.println("Your remaining balance is: " + buyer.balance);
            } else {
                System.out.println("Sorry, you don't have enough money for that.");
            }
        }
    }

    public static int cost(int itemPrice, int quantity) {
        return (itemPrice * quantity);
    }
}
