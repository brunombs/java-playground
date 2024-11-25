public class Vocation {
    private int lifePoints = 185;
    private int manaPoints = 35;
    private int level = 8;

    public Vocation(int lifePoints, int manaPoints, int level) {
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
        this.level = level;
    }

    public void printDetails(String vocation) {
        System.out.println("Vocation: " + vocation);
        System.out.println("Life Points: " + lifePoints);
        System.out.println("Mana Points: " + manaPoints);
        System.out.println("Level: " + level);
    }
}
