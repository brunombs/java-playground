// Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

public class MainBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("The Pragmatic Programmer", "David Thomas and Andrew Hunt", 393.08);

        printBookDetails("Book 1", book1);
        printBookDetails("Book 2", book2);
        printBookDetails("Book 3", book3);
    }

    private static void printBookDetails(String label, Book book) {
        System.out.println("Book Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Price: R$" + book.price);
        System.out.println();
    }
}
