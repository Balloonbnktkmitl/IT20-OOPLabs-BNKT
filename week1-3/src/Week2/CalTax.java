/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;
import java.util.*;
/**
 *
 * @author USER
 */
public class CalTax {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salary = sc.nextDouble();
    if (salary > 50000){
        salary = salary*0.1;
    }else{
        salary = salary*0.05;
    }
    System.out.println("Tax : "+salary);
    }
}
