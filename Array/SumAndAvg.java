// Create a program to find the sum and average of all elements in an array.
package Array;

public class SumAndAvg {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        long sum = SumOfArray(arr);
        System.out.println("The sum of Array is: "+sum);
        double avg = AverageOfArray(arr);
        System.out.println("The average of given array is: "+avg);


    }
    public static long SumOfArray(int[] arr){
        long sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }
    public static double AverageOfArray(int[] arr){
        double sum = SumOfArray(arr);
        return (sum / arr.length);
    }
}
