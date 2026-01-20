package Loops;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int copyNum = num;
        int revNum = 0;
        for(int i = 1; num > 0; i++){
            int lastDigit = num % 10;
            revNum *= 10;
            revNum += lastDigit;
            num /= 10;

        }
        if(revNum == copyNum){
            System.out.println("The number is a palindrome number.");
        }
        else{
            System.out.println("The number is not a palindrome number.");
        }

    }
}
