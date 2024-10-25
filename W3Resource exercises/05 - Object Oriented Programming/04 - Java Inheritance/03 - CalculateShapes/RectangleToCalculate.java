public class RectangleToCalculate extends ShapesToCalculate {
    private final double width;
    private final double height;

    public RectangleToCalculate(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
