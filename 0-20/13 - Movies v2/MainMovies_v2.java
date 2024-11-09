public class MainMovies_v2 {
    public static void main(String[] args) {
        Movies_v2 Saw = new Movies_v2("Saw", 2004);

        System.out.println("The movie name is: " + Saw.getTitle());
        System.out.println("The release date of " + Saw.getTitle() + " is: " + Saw.getYear());
        Saw.setTitle("Saw 1");
        System.out.println("The movie name after update is: " + Saw.getTitle());
        Saw.setTitle("Saw 2");
        Saw.setYear(2005);
        System.out.println("The release date of " + Saw.getTitle() + " is: " + Saw.getYear());
    }
}
