//Create a program to find the Least Common Multiple (LCM) of two numbers.
package Loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        int max = num1 > num2 ? num1 : num2;
        int lcm = 0;
        for(int i = max; i <= num1 * num2; i++){
            if(i % num1 == 0 && i % num2 == 0){
               lcm = i;
               break;
            }
        }
        System.out.println("The LCM of two numbers is: "+lcm);


    }
}
