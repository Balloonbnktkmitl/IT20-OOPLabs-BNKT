/*
 * IG : i_am_bnkt
 */
package Week2;

import java.util.*;

/**
 *
 * @author BNKT
 */
public class BuyComputer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 375.99;
        System.out.println("please insert your mornitor size 38 to 43 only");
        int monitor = sc.nextInt();
        System.out.println("Do you want DVD-ROM? 1 is Yes / 0 is No");
        int dvd = sc.nextInt();
        System.out.println("Do you want printer? 1 is Yes / 0 is No");
        int printer = sc.nextInt();
        System.out.println("======= Your order =======");
        System.out.println("* computer >>> 375.99$");
        if (monitor == 38) {
            price += 75.99;
            System.out.println("* " + monitor + "'Monitor >>> 75.99");
        } else if (monitor == 43) {
            price += 99.99;
            System.out.println("* " + monitor + "'Monitor >>> 99.99");
        }
        if (dvd == 1) {
            price += 65.99;
            System.out.println("* DVD-Rom >>> 65.99");
        }
        if (printer == 1) {
            price += 125;
            System.out.println("* Printer >>> 125.00");
        }
        System.out.println("======= Total price >>> " + price + " ==========");
    }
}
