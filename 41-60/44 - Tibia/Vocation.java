public class Vocation {
    private final int lifePoints;
    private final int manaPoints;
    private final int level;
    private final int capacity;
    public boolean promoted;
    public String vocation;

    public Vocation(int level, boolean promoted) {
        this.level = level;
        this.promoted = promoted;
        this.lifePoints = calculateLifePoints(level);
        this.manaPoints = calculateManaPoints(level);
        this.capacity = calculateCapacity(level);
        this.vocation = getVocation(promoted);
    }

    private String getVocation(boolean promoted) {
        return promoted ? "Promoted Vocation" : "Base Vocation";
    }

    protected int calculateLifePoints(int level) {
        int baseLifePoints = 100;
        int lifeIncrement = 10;
        return baseLifePoints + (level - 1) * lifeIncrement;
    }

    protected int calculateManaPoints(int level) {
        int baseManaPoints = 50;
        int manaIncrement = 20;
        return baseManaPoints + (level - 1) * manaIncrement;
    }

    protected int calculateCapacity(int level) {
        int baseCapacity = 200;
        int capacityIncrement = 15;
        return baseCapacity + (level - 1) * capacityIncrement;
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
