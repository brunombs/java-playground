public class RollerCoaster extends Attraction {
    private final int speed;
    public RollerCoaster(String name, int capacity, int duration, int speed) {
        super(name, capacity, duration);
        this.speed = speed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Attraction: " + getName() + ", Capacity: " + getCapacity() + ", Duration: " + getDuration() + "min, Speed: " + speed + "kmhr");
    }
}
