// Overloading Constructors with Different Data Types
//Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors.

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(5,3);
        Point p2 = new Point(4);

        System.out.println("Point 1 X, Y: " + p1.getX() + ", " + p1.getY());
        System.out.println("Point 2 X: " + p2.getX());

        p2.setX(5);
        p1.setY(4);

        System.out.println("Point 1 X, Y: " + p1.getX() + ", " + p1.getY());
        System.out.println("Point 2 X: " + p2.getX());
    }
}
