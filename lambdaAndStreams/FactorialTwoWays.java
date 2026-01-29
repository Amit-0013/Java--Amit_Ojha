//Write two versions of a program that calculates the factorial
//of a number: one using structural (procedural) programming,
//and the other using functional programming.
package lambdaAndStreams;

import java.util.stream.IntStream;

public class FactorialTwoWays {
    public static void main(String[] args) {
        System.out.println("Printing factorial using two ways: ");
        int number = 5;
        System.out.println(fact(number));
        IntStream.rangeClosed(2 , number)
                .reduce((a,b) -> a * b)
                .ifPresent(System.out::println);

    }
    public static int fact(int number){
        int result = 1;
        if(number == 0 || number == 1){
            return 1;
        }
        for(int i = 2; i<= number; i++){
            result *= i;
        }
        return result;
    }
}
