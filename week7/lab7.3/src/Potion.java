/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public class Potion extends Item {

    public void use(Player P) {
        P.setHP(P.getHP() + 10);
    }
}
