//Printing multiplication table of given number.
package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of which table is to printed: ");
        int num = in.nextInt();
        for(int i = 1; i <= 10; i++){
            int product = num * i;
            System.out.printf("%d * %d = %d ", num,i,product);
            System.out.println();
        }
    }
}
