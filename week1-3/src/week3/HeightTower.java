/*
 * IG : i_am_bnkt
 */
package week3;

import java.util.*;

/**
 *
 * @author BNKT
 */
public class HeightTower {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please specify the height of the tower : ");
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            System.out.println("#-#-#-#-#");
        }
    }
}
