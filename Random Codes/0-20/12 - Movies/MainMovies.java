public class MainMovies {
    public static void main(String[] args) {
        Movie Saw1 = new Movie("Saw", 2004);
        Movie Saw2 = new Movie("Saw II", 2005);
        Movie Saw3 = new Movie("Saw III", 2006);
        Movie Saw4 = new Movie("Saw IV", 2007);
        System.out.println("Movie name: " + Saw1.title + ", release year: " + Saw1.year);
        System.out.println("Movie name: " + Saw2.title + ", release year: " + Saw2.year);
        System.out.println("Movie name: " + Saw3.title + ", release year: " + Saw3.year);
        System.out.println("Movie name: " + Saw4.title + ", release year: " + Saw4.year);

        Saw1.title = "Saw 1";
        System.out.println("Movie name: " + Saw1.title + ", release year: " + Saw1.year);
    }

}
