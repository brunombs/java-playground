// Write a Java program to implement an enum called "Direction" with constants representing the cardinal directions (North, South, East, West).

public class Direction {
    public static void main(String[] args) {
        DirectionType direction1 = DirectionType.valueOf("EAST");
        DirectionType direction2 = DirectionType.WEST;
        System.out.println("First go to the " + direction1.name() + " and then to the" + direction2.name());

    }

    public enum DirectionType {
        NORTH, EAST, SOUTH, WEST
    }
}
