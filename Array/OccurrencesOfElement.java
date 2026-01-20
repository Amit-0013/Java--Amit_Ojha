// Create a program to find number of occurrences of an element in an array.
package Array;

import java.util.Scanner;

public class OccurrencesOfElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter the number whose number of occurrences is to be found: ");
        int num = in.nextInt();
        int NumberOfOccurrences = Occurrences(arr , num);
        System.out.printf("The number %d occurs %d times.",num,NumberOfOccurrences);

    }
    public static int Occurrences(int[] arr , int num){
        int count = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                count++;
            }
            i++;
        }
        return count;

    }
}
