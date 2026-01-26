//Arithmetic Exception Handling
//Write a program that asks the user to enter two integers and
//then divides the first by the second. The program should
//handle any arithmetic exceptions that may occur (like
//                                                         division by zero) and display an appropriate message.
//Key Points:
//        • Use Scanner to read user input.
//        • Implement a try-catch block to handle ArithmeticException.
//        • Display a user-friendly message if division by zero occurs.
package exception;

import java.util.Scanner;

public class ArithmeticExceptionEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = in.nextInt();
        try{
           int result = num1 / num2;
            System.out.println("The quotient is: "+result);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero : "+e);
        }

    }
}
