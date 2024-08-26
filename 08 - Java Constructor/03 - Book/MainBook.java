// Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

public class MainBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("The Pragmatic Programmer", "David Thomas and Andrew Hunt", 393.08);

        System.out.println("Book 1 Title: " + book1.title);
        System.out.println("Book 1 Author: " + book1.author);
        System.out.println("Book 1 Title: " + book1.price);
        System.out.println("Book 2 Title: " + book2.title);
        System.out.println("Book 2 Title: " + book2.author);
        System.out.println("Book 2 Title: " + book2.price);
        System.out.println("Book 3 Title: " + book3.title);
        System.out.println("Book 3 Title: " + book3.author);
        System.out.println("Book 3 Title: " + book3.price);
    }
}
