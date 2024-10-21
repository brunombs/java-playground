// Write a Java method to display the first 50 pentagonal numbers.

public class FiftyPentagonalNumbers {
    public static void main(String[] args) {
        displayPentagonalNumbers(50);
    }

    public static void displayPentagonalNumbers(int count) {
        System.out.println("First " + count + " pentagonal numbers:");

        for (int i = 1; i <= count; i++) {
            int pentagonalNumber = getPentagonalNumber(i);
            System.out.printf("%4d ", pentagonalNumber);

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
