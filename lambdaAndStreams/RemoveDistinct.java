//Given an array of integers, create a stream, use the distinct
//operation to remove duplicates, and collect the result into
//a new list.
package lambdaAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDistinct {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,6,7,7,7,8,9,1);
        List<Integer> distinctList = list.stream()
                .distinct()
                .toList();
        System.out.println("Original list: "+list);
        System.out.println("New List: " +distinctList);
    }
}
