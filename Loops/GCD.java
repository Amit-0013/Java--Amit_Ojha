//Create a program to find the Greatest Common Divisor (GCD) of two integers.
package Loops;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        int min = Math.min(num1,num2);
        int gcd = 1;
        for(int i = 2; i <= min; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("The gcd of two numbers is: "+gcd);
    }
}
