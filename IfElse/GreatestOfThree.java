//Finding greatest of three numbers.
package IfElse;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = in.nextInt();
        if(num1 > num2){
            if(num1 > num3){
                System.out.printf("%d is greatest",num1);
            }
            else{
                System.out.printf("%d is greatest",num3);
            }
        }
        else if(num2 > num1){
            if(num2 > num3){
                System.out.printf("%d is greatest",num2);
            }
            else{
                System.out.printf("%d is greatest",num3);
            }
        }
        else{
            System.out.printf("%d is greatest",num3);
        }
    }
}
