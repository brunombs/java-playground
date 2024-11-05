public class Bookpol extends Media {
    public int pageCount;

    public Bookpol(String title, int year, int pageCount) {
        super(title, year);
        this.pageCount = pageCount;
    }

    @Override
    void displayInfo() {
        System.out.println("Book: " + title + ", year: " + year + ", pages: " + pageCount);
    }
}
