// All Arithmetic operations.
package basic;
import java.util.Scanner;

public class Airthmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 =  in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        System.out.println("The sum of two number is: "+(num1+num2));
        System.out.println("The difference of two number is: "+(num1-num2));
        System.out.println("The product of two number is: "+(num1*num2));
        System.out.println("The quotient of two number is: "+(num1/num2));
        System.out.println("The remainder of two number is: "+(num1%num2));



    }
}
