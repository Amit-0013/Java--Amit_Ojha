//Create a program using for-each to the occurrences of a specific element in an
//array.
package Array;

import java.util.Scanner;

public class OccurenceOfElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter the element to be searched: ");
        int element = in.nextInt();
        int occur = Occur(arr , element);
        System.out.printf("The given element occurs %d times in the array.",occur);
    }
    public static int Occur(int[] arr , int element){
        int occur = 0;
        for (int num : arr){
            if(num == element){
                occur++;
            }
        }
        return occur;
    }
}
