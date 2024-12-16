import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        contacts.add(new Contact("Bruno", 12345));
        contacts.add(new Contact("Julia", 54321));

        for (Contact contact : contacts) {
            System.out.println(contact.getName() + ", number: " + contact.getNumber());
        }
    }
}
