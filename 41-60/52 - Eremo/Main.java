import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Buyer buyer = new Buyer(100);
        ArrayList<String> items = new ArrayList<>();
        items.add("mana potion");
        items.add("sudden death rune");
        items.add("ultimate healing rune");
        System.out.println("Eremo says: Hello, what do you wanna buy today?");
        String answer = scanner.nextLine();

        if (!items.contains(answer.toLowerCase())) {
            System.out.println("Sorry, I only sell those items: " + items);
        }

        if (answer.equals("mana potion".toLowerCase())) {
            int mpPrice = 56;
            System.out.println("How many mana potions?");
            int mana = scanner.nextInt();
            if (buyer.balance > )
            System.out.println("OK, here you are " + mana + " mana potions");
        } else if (answer.equals("sudden death rune".toLowerCase())) {
            int sdPrice = 162;
            System.out.println("How many sudden death runes?");
            int sudden = scanner.nextInt();
            System.out.println("OK, here you are " + sudden + " sudden deaths");
        } else if (answer.equals("ultimate healing rune".toLowerCase())) {
            int uhPrice = 175;
            System.out.println("How many ultimate healing runes?");
            int ultimate = scanner.nextInt();
            System.out.println("OK, here you are " + ultimate + " ultimate healing");
        }

        void cost(mpPrice){
            mpPrice * mana
        }

    }
}
