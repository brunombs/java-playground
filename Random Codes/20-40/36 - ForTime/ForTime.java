import java.util.Scanner;

public class ForTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many minutes left?: ");
        int timeRemaining = input.nextInt();

        if (timeRemaining <= 0) {
            System.out.println("You've arrived at your destination.");
        } else {
            while (timeRemaining > 0) {
                timeRemaining -= 30;
                if (timeRemaining > 0) {
                    System.out.println("There is " + timeRemaining + " minutes left");
                }
            }
            System.out.println("You've arrived at your destination.");
        }
    }
}
