public class City {
    private String name;
    private int population;
    private double area;
    private String state;
    private boolean capital;

    public City(String name, int population, double area, String state, boolean capital) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.state = state;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public String getState() {
        return state;
    }

    public boolean isCapital() {
        return capital;
    }
}
