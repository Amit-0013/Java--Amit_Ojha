//Create a list of strings representing numbers ("1", "2", ...).
//Convert each string to an integer, then again calculating
//squares of each number using the map operation and sum
//up the resulting integers.
package lambdaAndStreams;

import java.util.List;

public class IntegerString {
    public static void main(String[] args) {
        List<String> num = List.of("2" , "3" , "4");
        num.stream()
                .map(Integer::parseInt)
                .map(nums ->Math.pow(nums , 2))
                .reduce(Double :: sum)
                .ifPresent(System.out::println);
    }
}
