package Loops;

import java.util.Scanner;

public class ReverseRightHalfPyramind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = 0; j <= num - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
