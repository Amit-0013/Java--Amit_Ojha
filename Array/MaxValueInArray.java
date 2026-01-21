//Create a program using for-each to find the maximum value in an integer array.
package Array;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        System.out.println("The maximum element in array is: "+Max(arr));
    }
    public static int Max(int[] arr){
        int max = 0;
        for (int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
