/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public class Sword extends Item {

    public void use(Player P) {
        P.setATK(P.getATK() + 10);
    }
}
