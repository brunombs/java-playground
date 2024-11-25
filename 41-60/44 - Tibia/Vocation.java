public class Vocation {
    private final int lifePoints;
    private final int manaPoints;
    private final int level;
    public boolean promoted;
    public String vocation;

    public Vocation(int lifePoints, int manaPoints, int level, boolean promoted) {
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
        this.level = level;
        this.promoted = promoted;
    }

    void isPromoted() {
        System.out.println("Vocation");
    }


    public void printDetails() {
        System.out.println("Vocation: " + vocation);
        System.out.println("Life Points: " + lifePoints);
        System.out.println("Mana Points: " + manaPoints);
        System.out.println("Level: " + level);
    }
}
