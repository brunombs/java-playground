public class Carousel extends Attraction{
    int numberOfHorses;
    public Carousel(String name, int capacity, int duration, int numberOfHorses) {
        super(name, capacity, duration);
        this.numberOfHorses = numberOfHorses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Attraction: " + getName() + ", Capacity: " + getCapacity() + ", Duration: " + getDuration() + "min, Number of horses: " + numberOfHorses);
    }
}
