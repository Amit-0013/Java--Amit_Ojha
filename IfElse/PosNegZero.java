//Checking for positive , negative , or zero.
package IfElse;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int num = in.nextInt();
        if(num>0){
            System.out.println("The number is positive.");
        }
        else if(num<0){
            System.out.println("The number is negative.");
        }
        else
            System.out.println("The number is zero.");
    }
}
