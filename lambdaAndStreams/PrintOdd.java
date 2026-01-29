//Given a list of integers, use stream operations to filter odd
//numbers and print them.
package lambdaAndStreams;

import java.util.Arrays;
import java.util.List;

public class PrintOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,6,4,6,7,9);
        list.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);
    }
}
