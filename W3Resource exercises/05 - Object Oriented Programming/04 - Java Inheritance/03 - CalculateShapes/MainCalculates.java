import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the width: ");
    double n1 = input.nextFloat();
    System.out.println("Enter the height: ");
    double n2 = input.nextFloat();
    RectangleToCalculate rectangle = new RectangleToCalculate(n1, n2);
    double area = rectangle.getArea();

    System.out.println("The area of the rectangle is " + area);
}
