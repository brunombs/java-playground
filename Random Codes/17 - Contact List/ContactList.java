import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private final List<Contact> contactList;

    public ContactList() {
        contactList = new ArrayList<>();
    }

    public void addContact(String name, String phone) {
        contactList.add(new Contact(name, phone));
    }

    public void removeContact(String name) {
        List<Contact> contactsToRemove = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contactsToRemove.add(contact);
            }
        }
        contactList.removeAll(contactsToRemove);
    }

    public Contact getContact(String name) {
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public int getTotalContacts() {
        return contactList.size();
    }

    public void obtainDescriptionContacts() {
        System.out.println(contactList);
    }

    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        contactList.addContact("Bruno Barreto", "bruno@barreto.com");
        contactList.addContact("Julia Amorim", "julia@amorim.com");
        System.out.println("Total contacts: " + contactList.getTotalContacts());
        contactList.obtainDescriptionContacts();
        contactList.removeContact("Bruno Barreto");
        contactList.obtainDescriptionContacts();
        Contact contacFound = contactList.getContact("Julia Amorim");
        System.out.println("Contact found: " + contacFound);
    }
}