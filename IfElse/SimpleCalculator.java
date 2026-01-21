package IfElse;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter first Number: ");
        int num1 = in.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = in.nextInt();
        System.out.println("Please select the operation");
        System.out.printf("1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Remainder\n 5. Division\n");
        int op = in.nextInt();
        switch(op){
            case 1 -> System.out.println("The sum of two numbers is: "+(num1+num2));
            case 2 -> System.out.println("The difference of two numbers is: "+(num1-num2));
            case 3 -> System.out.println("The product of two numbers is: "+(num1*num2));
            case 4 -> System.out.println("The remainder of two numbers is: "+(num1%num2));
            case 5 -> System.out.println("The quotient of two numbers is: "+(num1/num2));
        }
    }

}
