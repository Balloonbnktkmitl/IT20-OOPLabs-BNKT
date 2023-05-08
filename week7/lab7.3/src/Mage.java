/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public class Mage extends Player {

    public Mage() {
        setATK(5);
        setHP(10);
        setMP(20);
    }

    public void addEquipment(Item i) {
        i.use(this);
    }

    @Override
    public void attack(Player p) {
        p.attacked(getATK() * 2.5);
        this.setMP(this.getMP() - 5);
    }

    @Override
    public void attacked(double n) {
        this.setHP(this.getHP() - n);
    }

}
