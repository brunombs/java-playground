// Write a Java program to swap two variables.


public class SwapTwoVariables {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
