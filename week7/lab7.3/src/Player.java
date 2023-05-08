/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public abstract class Player {

    private double HP;
    private double MP;
    private double EXP;
    private double Money;
    private double ATK;

    public double getHP() {
        return HP;
    }

    public double getMP() {
        return MP;
    }

    public double getEXP() {
        return EXP;
    }

    public double getATK() {
        return ATK;
    }

    public double getMoney() {
        return Money;
    }

    public void setATK(double ATK) {
        this.ATK = ATK;
    }

    public void setEXP(double EXP) {
        this.EXP = EXP;
    }

    public void setHP(double HP) {
        if (HP <= 0) {
            this.HP = 0;
        } else {

            this.HP = HP;
        }
    }

    public void setMP(double MP) {
        this.MP = MP;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }

    @Override
    public String toString() {
        return "HP : " + HP + " MP : " + MP + " ATK : " + ATK;
    }

    public abstract void attack(Player p);

    public abstract void attacked(double n);

}
