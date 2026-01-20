//To calculate Simple Intertest.
package basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principle: ");
        int principle = in.nextInt();
        System.out.print("Enter time: ");
        int time = in.nextInt();
        System.out.print("Enter rate : ");
        double rate = in.nextDouble();
        double interest = (principle * rate * time)/100;
        System.out.println("The simple interest is: "+interest);

    }
}
