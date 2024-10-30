public class MainCity {
    public static void main(String[] args) {
        City Salvador = new City("Salvador", 2886698, 693.8, "Bahia", true);
        City SP = new City("São Paulo", 12325232, 1521, "São Paulo", true);
        City Curitiba = new City("Curitiba", 1948626, 4349, "Paraná", true);
        City Campinas = new City("Campinas", 1223237, 7953, "São Paulo", false);

        City[] cities = {Salvador, SP, Curitiba, Campinas};

        for (City city : cities) {
            System.out.println("City name: " + city.getName() + "\nPopulation: " + city.getPopulation() + "\nArea: " + city.getArea() + "\nState: " + city.getState() + "\nIs capital? " + city.isCapital());
            System.out.println("-------------------");
        }
    }
}
