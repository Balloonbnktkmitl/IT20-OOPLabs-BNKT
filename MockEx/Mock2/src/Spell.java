/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public abstract class Spell {

    private final String name;
    private int damage;

    public Spell(String name) {
        this.name = name;
        damage = 0;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
