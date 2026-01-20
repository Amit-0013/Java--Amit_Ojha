//Create a program to sum all odd numbers from 1 to a specified number N.
package Loops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number up to which sum is to be calculated: ");
        int num = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("The sum of odd numbers is: "+sum);
    }
}
