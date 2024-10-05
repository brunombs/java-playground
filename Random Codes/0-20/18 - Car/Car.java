public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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
        System.out.println("Marca: " + car.getMake());
        System.out.println("Modelo: " + car.getModel());
        System.out.println("Ano: " + car.getYear());
    }

    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Fit", 2004);

        myCar.exibirDetalhes(myCar);

        myCar.setYear(2015);
        myCar.setMake("Toyota");
        myCar.setModel("SW4");

        myCar.exibirDetalhes(myCar);
    }
}
