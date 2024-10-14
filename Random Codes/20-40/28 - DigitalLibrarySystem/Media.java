public abstract class Media {
    public final String title;
    public final int year;

    public Media(String title, int year) {
        this.title = title;
        this.year = year;
    }

    abstract void displayInfo();
}
