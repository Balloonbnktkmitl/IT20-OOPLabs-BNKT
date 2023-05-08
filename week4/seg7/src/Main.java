/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public class Main {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.defineCat("Mew", "White");
        c.speak();
        c.upWeight(5);
        c.upHeight(10);
        c.speak();
        c.upWeight(-5);
        c.upHeight(-10);
        c.speak();
    }
}
