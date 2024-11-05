public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        Rectangle rectangle = new Rectangle(7.5, 5.5);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
