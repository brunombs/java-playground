public class Paladin extends Vocation {
    public Paladin(int level, boolean promoted) {
        super(level, promoted);
        this.vocation = promoted ? "Royal Paladin" : "Paladin";
    }

    @Override
    protected int calculateLifePoints(int level) {
        int baseLifePoints = 185;
        int lifeIncrement = 10;
        return baseLifePoints + (level - 8) * lifeIncrement;
    }

    @Override
    protected int calculateManaPoints(int level) {
        int baseManaPoints = 35;
        int manaIncrement = 15;
        return baseManaPoints + (level - 8) * manaIncrement;
    }

    @Override
    protected int calculateCapacity(int level) {
        int baseCapacity = 470;
        int capacityIncrement = 20;
        return baseCapacity + (level - 8) * capacityIncrement;
    }
}
