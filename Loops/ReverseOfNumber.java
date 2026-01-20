//  Create a program to reverse the digits of a number.
package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int revNum = 0;
        for(int i = 1; num > 0; i++){
            int lastDigit = num % 10;
            revNum *= 10;
            revNum += lastDigit;
            num /= 10;

        }
        System.out.println("The reverse of digits of a number is: " +revNum);
    }
    
}
