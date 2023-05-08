/*
 * IG : i_am_bnkt
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author BNKT
 */
public class CountNumNewLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                System.out.println("|");
            } else {
                System.out.print("|");
            }
        }
        System.out.println("");
    }
}
