// Create a program to check if a number is an Armstrong number.
package Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be checked for Armstrong: ");
        int num = in.nextInt();
        boolean isArmstrong = Armstrong(num);
        if(isArmstrong) System.out.println("The number is Armstrong number.");
        else System.out.println("The number is not Armstrong.");

    }
    public static int numberOfDigits(int num){
        int count = 0;
        for(int i = 1; num > 0; i++){
            count++;
            num /= 10;
        }
        return count;
    }
    public static boolean Armstrong(int num){
        int numberOFDigits = numberOfDigits(num);
        int sum = 0;
        int copyNum = num;
        for(int i = 1; num > 0; i++){
            int lastDigits = num % 10;
            num /= 10;
            sum += (int) Math.pow(lastDigits , numberOFDigits);
        }
        return sum == copyNum;
    }
}
