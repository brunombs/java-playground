public class Vocation {
    private int lifePoints = 185;
    private int manaPoints = 35;

    public Vocation(int lifePoints, int manaPoints) {
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
    }

    public void printDetails() {
        System.out.println("Life Points: " + lifePoints);
        System.out.println("Mana Points: " + manaPoints);
    }
}
