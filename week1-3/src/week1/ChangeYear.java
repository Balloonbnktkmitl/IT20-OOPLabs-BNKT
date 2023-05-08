/*
 * IG : i_am_bnkt
 */
package week1;
import java.util.Scanner;
/**
 *
 * @author BNKT
 */
public class ChangeYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int budYear =  sc.nextInt();
        int chistYear = budYear-543;
        System.out.println(budYear + " = " + chistYear + " + " + "543");
    }
}
