import java.text.NumberFormat;
import java.util.Locale;

public static void main(String[] args) {
    City Salvador = new City("Salvador", 2886698, 693.8, "Bahia", true);
    City SP = new City("São Paulo", 12325232, 152.1, "São Paulo", true);
    City Curitiba = new City("Curitiba", 1948626, 434.9, "Paraná", true);
    City Campinas = new City("Campinas", 1223237, 795.7, "São Paulo", false);

    City[] cities = {Salvador, SP, Curitiba, Campinas};
    NumberFormat numberFormat = NumberFormat.getInstance(new Locale("pt", "BR"));



    for (City city : cities) {
        String formattedPopulation = numberFormat.format(city.getPopulation());
        System.out.println("City name: " + city.getName() + "\nPopulation: " + formattedPopulation + "\nArea: " + city.getArea() + "\nState: " + city.getState() + "\nIs capital? " + city.isCapital());
        System.out.println("-------------------");
    }
}
