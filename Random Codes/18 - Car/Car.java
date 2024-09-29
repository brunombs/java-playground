public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void exibirDetalhes(Car car) {
        System.out.println("Marca: " + car.getBrand());
        System.out.println("Modelo: " + car.getModel());
        System.out.println("Ano: " + car.getYear());
    }

    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Fit", 2004);

        myCar.exibirDetalhes(myCar);

        myCar.setYear(2015);
        myCar.setBrand("Toyota");
        myCar.setModel("SW4");

        myCar.exibirDetalhes(myCar);
    }
}
