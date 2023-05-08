/*
 * IG : i_am_bnkt
 */
package week1;
import java.util.Scanner;
/**
 *
 * @author BNKT
 */
public class CalVat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        System.out.println(price * 107 / 100);
    }
}
