//Create a program that computes the sum of the digits of an integer.
package Loops;

import java.util.Scanner;

public class SumOFDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int sum = 0;
        for(int i = 1; i>0; i++){
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;

        }
        System.out.println("The sum of digits of the integer is: "+sum);
    }

}
