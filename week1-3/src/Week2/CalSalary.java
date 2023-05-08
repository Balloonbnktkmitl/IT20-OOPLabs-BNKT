/*
 * IG : i_am_bnkt
 */

package Week2;
import java.util.*;
/**
 *
 * @author BNKT
 */
public class CalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        int numDay1 = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = sc.nextInt();
        System.out.print("Please insert  your body weight : ");
        double weight = sc.nextDouble();
        System.out.println("Hi, "+ name);
        int salary = 1;
        if (age >= 51 && age <= 60){
            salary = numDay1*3000;
        }else if (age >= 41){
            salary = (numDay1 * 1000) - (numDay2 * 25);
        }else if (age >= 31){
            salary = (numDay1 * 500) - (numDay2 * 50);
        }else if (age >= 21){
            salary = (numDay1 * 300) - (numDay2 * 50);
        }
        System.out.println("Your salary is " + salary + " Baht");
        if (weight >= 10 && weight <= 60){
            salary += 5000;
        }else if (weight <= 90){
            salary += 5000-((weight-60)*10);
        }
        System.out.println("Your salary and bonus is " + salary + " Baht");
    }
}
