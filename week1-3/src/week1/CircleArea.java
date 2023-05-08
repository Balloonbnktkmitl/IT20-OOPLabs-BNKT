/*
 * IG : i_am_bnkt
 */
package week1;
import java.util.Scanner;
/**
 *
 * @author BNKT
 */
public class CircleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.PI*Math.pow(radius, 2);
        System.out.print(area);
    }
}