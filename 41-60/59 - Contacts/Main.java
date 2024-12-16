import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Bruno", 12345));
        contacts.add(new Contact("Julia", 54321));

        while (true){
            System.out.println("""
                What do you want to do?
                Type 1 for: 'Show contacts'
                Type 2 for: 'Add contact'""");

            String answer = scanner.nextLine();

            if (answer.equals("1")) {
                System.out.println("Here are your contacts: ");
                for (Contact contact : contacts) {
                    System.out.println(contact.getName() + ", number: " + contact.getNumber());
                }
            } else if (answer.equals("2")) {
                System.out.println("Input name and phone number of the contact you want to add separated by a comma: ");
                String nameAndNumber = scanner.nextLine();
                String[] parts = nameAndNumber.split(",");
                String name = parts[0];
                int phone = Integer.parseInt(parts[1]);
                contacts.add(new Contact(name, phone));
            } else {
                System.out.println("Invalid input!");
                break;
            }
        }
    }
}
