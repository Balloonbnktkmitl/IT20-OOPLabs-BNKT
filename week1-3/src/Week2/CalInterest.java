/*
 * IG : i_am_bnkt
 */
package Week2;

import java.util.*;

/**
 *
 * @author BNKT
 */
public class CalInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = sc.nextDouble();
        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        char account = sc.next().charAt(0);
        switch (account) {
            case 'A':
            case 'C':
                money = money * 101.5 / 100;
                break;
            case 'B':
                money = money * 102 / 100;
                break;
            case 'X':
                money = money * 105 / 100;
                break;
        }
        System.out.println("Your total money in one year = " + money);
    }
}
