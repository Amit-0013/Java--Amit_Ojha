// Write a function that calculates the factorial of a given number.
package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int fact = 1;
        for(int i = 1; i<= num; i++){
            fact *= i;
        }
        System.out.println("The factorial of given number is: "+fact);
    }
}
