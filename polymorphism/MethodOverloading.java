// In a class Calculator, create multiple add() methods that
//overload each other and can sum two integers, three
//integers, or two doubles. Demonstrate how each can be
//called with different numbers of parameters.
package polymorphism;

import java.util.Scanner;

public class MethodOverloading {

    int add(int num1, int num2){
        return num1+num2;
    }
    int add(int num1 , int num2 , int num3){
        return num1+num2+num3;
    }
    double add(double num1 , double num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        MethodOverloading calc = new MethodOverloading();
        System.out.println("Sum of two integers is: "+calc.add(5 , 6));
        System.out.println("Sum of three integers is: "+calc.add(4 , 5 , 8));
        System.out.println("Sum of two double is: "+calc.add(5.6 , 7.6));

    }
}
