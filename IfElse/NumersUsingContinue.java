//Create a program using continue to print only even numbers using continue for
//odd numbers.
package IfElse;

import java.util.Scanner;

public class NumersUsingContinue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            if(i % 2 != 0){
                continue;

            }
            System.out.println(i);

        }
    }
}
