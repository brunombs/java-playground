public abstract class Attraction {
    public String name;
    public int capacity;
    public int duration;

    public Attraction(String name, int capacity, int duration) {
        this.name = name;
        this.capacity = capacity;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDuration() {
        return duration;
    }

    public abstract void displayInfo();
}
