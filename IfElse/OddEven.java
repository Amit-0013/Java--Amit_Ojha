//Checking for odd or even.
package IfElse;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("The number is Even.");
        }
        else{
            System.out.println("The number is Odd.");
        }

    }
}
