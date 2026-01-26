//Create a program that reverses the elements of a List and prints
//the reversed list.
package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(list);
        reverse(list);
        System.out.println("Reversed list: "+list);
    }
    public static void reverse(List<Integer> list){
        for (int i = 0; i < list.size() / 2; i++) {
            int swap = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, swap);
        }
    }
}
