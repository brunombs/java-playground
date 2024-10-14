// Write a Java program to create a class called Car with instance variables make, model, and year. Implement a parameterized constructor that initializes these variables and assigns default values if not provided. Print the values of the variables.

public class CarDefault {
    private final String make;
    private final String model;
    private final int year;

    public CarDefault(String make, String model, int year) {
        this.make = (make == null || make.isEmpty()) ? "Unknown Make" : make;
        this.model = (model == null || model.isEmpty()) ? "Unknown Model" : model;
        this.year = (year<= 0) ? 2000 : year;
    }

    public void details(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        CarDefault car1 = new CarDefault("Honda", "Fit", 2004);
        CarDefault car2 = new CarDefault("Maze", null, 0);
        car1.details();
        car2.details();
    }
}
