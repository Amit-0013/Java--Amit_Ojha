// Create a program to find the maximum and minimum element in an array.
package Array;

public class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int MaxNumber = Max(arr);
        int MinNumber = Min(arr);
        System.out.println("The maximum number in the array is: "+MaxNumber);
        System.out.println("The minimum number in the array is: "+MinNumber);

    }

    public static int Min(int[] arr) {
        int min = arr[arr.length - 1];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }

    public static int Max(int[] arr) {
        int max = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }
}
