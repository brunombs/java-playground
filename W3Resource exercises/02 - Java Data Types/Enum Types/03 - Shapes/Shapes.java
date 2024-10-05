// Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.

public class Shapes {
    public static void main(String[] args) {
        Shape format1 = Shape.SQUARE;
        System.out.println(format1);

    }

    public enum Shape {
        SQUARE, CIRCLE, TRIANGLE, HEXAGON
    }
}
