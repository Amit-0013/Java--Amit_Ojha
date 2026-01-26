package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        System.out.print("Enter the index of first element: ");
        int index1 = in.nextInt();
        System.out.print("Enter the index of second element: ");
        int index2 = in.nextInt();
        System.out.println(list);
        swap(list , index1 , index2);
        System.out.println("Changed list: "+list);
    }
    public static void swap(List<Integer> list, int x, int y){
        int swap = list.get(x);
        list.set(x , list.get(y));
        list.set(y , swap);
    }
}
