/* bai 2.2.5 */

package Lab01;

import java.util.Scanner;

public class Calc2Double{
    public static void main(String [] args){
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("num1: ");
        a = sc.nextDouble();
        System.out.print("num2: ");
        b = sc.nextDouble();
        System.out.println("sum: "+ (a+b));
        System.out.println("difference: "+ (a-b));
        System.out.println("product: "+ (a*b));
        if(b == 0) System.out.println("divisor error");
        else System.out.print("quotient: "+ (a/b));
    }
}