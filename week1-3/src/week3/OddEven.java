/*
 * IG : i_am_bnkt
 */
package week3;

import java.util.*;

/**
 *
 * @author BNKT
 */
public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddNum = 0, evenNum = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                evenNum += 1;
            } else {
                oddNum += 1;
            }
        }
        System.out.println("Odd number = " + oddNum + " and Even number = " + evenNum);
    }

}
