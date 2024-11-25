public class Druid extends Vocation {

    public Druid(int level, boolean promoted) {
        super(level, promoted);
        this.vocation = promoted ? "Elder Druid" : "Druid";
    }

    @Override
    protected int calculateLifePoints(int level) {
        int baseLifePoints = 185;  // Ajustado para o Druid
        int lifeIncrement = 5;
        return baseLifePoints + (level - 8) * lifeIncrement;
    }

    @Override
    protected int calculateManaPoints(int level) {
        int baseManaPoints = 35;
        int manaIncrement = 30;
        return baseManaPoints + (level - 8) * manaIncrement;
    }

    @Override
    protected int calculateCapacity(int level) {
        int baseCapacity = 470;
        int capacityIncrement = 10;
        return baseCapacity + (level - 8) * capacityIncrement;
    }
}
