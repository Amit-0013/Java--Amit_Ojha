//Write a program that sorts a list of String objects in descending
//order using a custom Comparator.
package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Lion" ,"Zebra" , "Elephant" , "Dog" , "Cat" , "Animal");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);

    }
    public static void sortInDescending(List<String> list){
        Comparator<String> com = new Comparator<String>(){
            
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)) {
                    return 0;
                }else if(o1.charAt(0) > o2.charAt(0)){
                    return -1;
                }else{
                    return 1;
                }
            }


        };
        Collections.sort(list , com);


    }
}
