public class MainBook_v2 {
    public static void main(String[] args) {
        Book_v2 Book1 = new Book_v2("Code: The Hidden Language of Computer Hardware and Software", "Charles Petzold", 978073561);
        System.out.println(Book1.getTitle());
        System.out.println(Book1.getAuthor());
        System.out.println(Book1.getISBN());
        Book1.setTitle("Clean Code");
        Book1.setAuthor("Robert C. Martin");
        Book1.setISBN(978013235);
        System.out.println(Book1.getTitle());
        System.out.println(Book1.getAuthor());
        System.out.println(Book1.getISBN());
    }
}
