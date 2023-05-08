/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public class Food {

    private final static int energy = 10;
    private static double price = 50;

    public static void setPrice(double price) {
        if (Food.price > price) {
            System.out.println("Cannot update the food price.");
        }
        Food.price = price;
    }

    public static double getPrice() {
        return price;
    }

    public static int getEnergy() {
        return energy;
    }
}
