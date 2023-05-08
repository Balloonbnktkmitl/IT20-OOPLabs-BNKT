/*
 * IG : i_am_bnkt
 */
package week1;
import java.util.Scanner;
/**
 *
 * @author BNKT
 */
public class ChangeHour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : Hours : ");
        int hours = sc.nextInt();
        System.out.print("\tMins : ");
        int minutes = sc.nextInt();
        int second = ((hours * 60) + minutes) * 60;
        System.out.println("Output : Secs = " + second);
    }
}
