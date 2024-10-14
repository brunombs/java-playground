// Write a Java program to swap two variables.


public class SwapTwoVariables_v2 {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
