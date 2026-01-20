//Create a program to reverse an array.
package Array;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int[] revArray = ReversedArray(arr);
        ArrayUtility.displayArray(revArray);
    }
    public static int[] ReversedArray(int[] arr){
        int i = 0;
        while(i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1)-i] = swap;
            i++;
        }
        return arr;
    }
}
