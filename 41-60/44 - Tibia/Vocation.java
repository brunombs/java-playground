public class Vocation {
    private final int lifePoints;
    private final int manaPoints;
    private final int level;
    private final int capacity;
    public boolean promoted;
    public String vocation;

    public Vocation(int lifePoints, int manaPoints, int level, int capacity, boolean promoted) {
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
        this.level = level;
        this.capacity = capacity;
        this.promoted = promoted;
    }

    public void printDetails() {
        System.out.println("----------CHARACTER INFO----------");
        System.out.println("Vocation: " + vocation);
        System.out.println("Level: " + level);
        System.out.println("Life Points: " + lifePoints);
        System.out.println("Mana Points: " + manaPoints);
        System.out.println("Capacity: " + capacity);
    }
}
