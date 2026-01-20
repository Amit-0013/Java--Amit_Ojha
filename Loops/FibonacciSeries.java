package Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the term up to which Fibonacci series is to be printed: ");
        int num = in.nextInt();
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");

        if(num == 1) System.out.println("0 1");
        int first = 0;
        int second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }
    }
}
