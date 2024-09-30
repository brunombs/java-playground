public class Magazine extends Media{
    private final int issueNumber;

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    void displayInfo() {
        System.out.println("Book: " + title + ", year: " + year + ", issue: " + issueNumber);
    }
}
