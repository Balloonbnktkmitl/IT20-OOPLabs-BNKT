/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public class Main3 {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setCarInfo(60, "High", "Diesel");
        c1.showCarInfo();
        c1.move();
        c1.showCarInfo();
        c1.move();
        c1.showCarInfo();
    }
}
