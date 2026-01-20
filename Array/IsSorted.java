// Create a program to check if the given array is sorted.
package Array;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        boolean dec = isDecreasing(arr);
        boolean increasing = isIncreasing(arr);
        if(dec || increasing){
            System.out.println("The array is sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }

    }
    public static boolean isDecreasing(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isIncreasing(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
