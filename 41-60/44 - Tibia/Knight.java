public class Knight extends Vocation{
    public Knight(int level, boolean promoted) {
        super(level, promoted);
        this.vocation = promoted? "Elite Knight" : "Knight";
    }

    @Override
    protected int calculateLifePoints(int level) {
        int baseLifePoints = 185;
        int lifeIncrement = 15;
        return baseLifePoints + (level - 8) * lifeIncrement;
    }

    @Override
    protected int calculateManaPoints(int level) {
        int baseManaPoints = 35;
        int manaIncrement = 5;
        return baseManaPoints + (level - 8) * manaIncrement;
    }

    @Override
    protected int calculateCapacity(int level) {
        int baseCapacity = 470;
        int capacityIncrement = 25;
        return baseCapacity + (level - 8) * capacityIncrement;
    }
}
