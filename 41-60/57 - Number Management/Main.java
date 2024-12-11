import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        while(true){
            System.out.println("Please enter an integer number: ");
            System.out.println("If you want to finish, enter a negative number");
            int number = scanner.nextInt();
            if(number <= -1){
                break;
            }
            sum += number;
            numbers.add(number);
        }

        System.out.println(numbers);
        System.out.println("Total sum: " + sum);
        System.out.println("Total amount of numbers: " + numbers.size());
    }
}
