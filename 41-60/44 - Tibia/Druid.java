public class Druid extends Vocation {
    public Druid(int lifePoints, int manaPoints, int level, boolean promoted) {
        super(lifePoints, manaPoints, level, promoted);
        if (promoted) {
            vocation = "Elder Druid";
        }
        else{
            vocation = "Druid";
        }
    }
}
