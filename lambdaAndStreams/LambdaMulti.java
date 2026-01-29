//.Write a lambda expression that takes two integers and
//returns their multiplication. Then, apply this lambda to a
//pair of numbers
package lambdaAndStreams;

import java.util.function.BinaryOperator;

public class LambdaMulti {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi = (a , b) -> a * b;
        int result = multi.apply(4 , 5);
        System.out.println(result);
    }
}
