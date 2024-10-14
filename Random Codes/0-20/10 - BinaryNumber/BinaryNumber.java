import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write a binary number: ");
        String binary = input.nextLine();
        try{
            int binary_converted = Integer.parseInt(binary, 2);
            System.out.println(binary_converted);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }
    }
}
