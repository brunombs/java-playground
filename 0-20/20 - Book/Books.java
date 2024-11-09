public class Books {
    private String title;
    private String author;

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Books book1 = new Books("Book 1", "Author 1");
        Books book2 = new Books("Book 2", "Author 2");

        book1.setTitle("Lovely Day");
        book1.setAuthor("Simon");
        book2.setTitle("Lonely Week");
        book2.setAuthor("Chris");

        System.out.println("Book 1: " + book1.getTitle() + ", author: " + book1.getAuthor());
        System.out.println("Book 2: " + book2.getTitle() + ", author: " + book2.getAuthor());
    }
}
