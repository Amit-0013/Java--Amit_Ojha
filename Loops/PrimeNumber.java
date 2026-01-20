// Create a program to check whether a given number is prime.
package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be checked for prime: ");
        int num = in.nextInt();
        int counter = 0;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                counter = 1;
            }
        }
        if(num == 1) System.out.println("The number is neither prime nor composite.");
        else if(counter == 1) System.out.println("The number is non-prime.");
        else System.out.println("The number is Prime.");
    }
}
