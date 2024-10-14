import java.util.Arrays;
import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            numeros[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(numeros));
    }
}
