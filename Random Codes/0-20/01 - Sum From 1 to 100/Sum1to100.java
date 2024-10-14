// This Java program calculates and displays the sum of all integers from 1 to 100 using a for loop.

public class Sum1to100 {
    public static void main(String[] args) {
        int sum = 0;
        for(int num = 1; num <=100; num++){
            sum += num;
        }
        System.out.println("The sum from 1 to 100 is: " + sum);
    }
}
