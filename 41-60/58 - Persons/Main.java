import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();

        while (true){
            System.out.println("Brand and year: ");
            String input = sc.nextLine();
            if(input.equals("exit")) break;

            String[] parts = input.split(",");
            String brand = parts[0];
            int year = Integer.parseInt(parts[1]);

            cars.add(new Car(brand, year));
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
