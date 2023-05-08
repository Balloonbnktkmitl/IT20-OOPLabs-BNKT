/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public class Player {

    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;

    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public Houses getHouses() {
        return houses;
    }

    public int getMana() {
        return mana;
    }

    public void setHp(int hp) {
        if (hp > 20) {
            this.hp = 20;
        } else if (hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }

    }

    public void setMana(int mana) {
        if (mana < 0) {
            this.mana = 0;
        } else if (mana > 50) {
            this.mana = 50;
        } else {
            this.mana = mana;
        }
    }

    public void setHouses(Houses house) {
        this.houses = house;
    }

    @Override
    public String toString() {
        return "[Player} : " + name + " HP: " + hp + " Mana: " + mana + " || " + houses;
    }

    public boolean equals(Player player) {
        return ((player.getName().equals(getName())) && (player.getHouses().equals(getHouses())));
    }

    public void attack(Player target, Spell spell) {
        if (getHouses() instanceof Gryffindor) {
            ((Gryffindor) houses).attackSpell(this, target, spell);
        } else if ((getHouses() instanceof Hufflepuff)) {
            ((Hufflepuff) houses).attackSpell(this, target, spell);
        } else if (target.getHp() == 0) {
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + getName());
        }
    }

    public void protectFromPlayer(Player target) {
        if (getHouses() instanceof Gryffindor) {
            ((Gryffindor) houses).defense(this, target);
        } else if ((getHouses() instanceof Hufflepuff)) {
            ((Hufflepuff) houses).defense(this, target);
        }
    }
}
