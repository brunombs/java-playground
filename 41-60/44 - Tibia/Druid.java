public class Druid extends Vocation {

    public Druid(int lifePoints, int manaPoints, int level, boolean promoted) {
        super(lifePoints, manaPoints, level, promoted);
        this.vocation = getVocation(promoted);
    }

    private String getVocation(boolean promoted) {
        if (promoted) {
            return "Elder Druid";
        } else {
            return "Druid";
        }
    }
}
