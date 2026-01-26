//Use the Collections class to count the frequency of a particular
//element in an ArrayList.
package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,2,3,4,4,4,5,5,6,7,8);
        System.out.println(Collections.frequency(list ,1));
        System.out.println(Collections.frequency(list ,4));
        System.out.println(Collections.frequency(list ,5));
        System.out.println(Collections.frequency(list ,8));
    }
}
