public class Druid extends Vocation {

    public Druid(int level, boolean promoted) {
        super(calculateLifePoints(level), calculateManaPoints(level), level, calculateCapacity(level), promoted);
        this.vocation = getVocation(promoted);
    }

    private String getVocation(boolean promoted) {
        if (promoted) {
            return "Elder Druid";
        } else {
            return "Druid";
        }
    }

    private static int calculateLifePoints(int level) {
        int baseLifePoints = 185;
        int lifeIncrement = 5;
        return baseLifePoints + (level - 8) * lifeIncrement;
    }

    private static int calculateManaPoints(int level) {
        int baseManaPoints = 35;
        int manaIncrement = 30;
        return baseManaPoints + (level - 8) * manaIncrement;
    }

    private static int calculateCapacity(int level) {
        int baseCapacity = 470;
        int capacityIncrement = 10;
        return baseCapacity + (level - 8) * capacityIncrement;
    }
}
