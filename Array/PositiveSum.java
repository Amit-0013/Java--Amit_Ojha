//Create a program using continue to sum all positive numbers entered by the
//user; skip any negative numbers
package Array;

public class PositiveSum {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int sum = 0;
        for (int num : arr){
            if(num > 0){
                sum += num;
            }
        }
        System.out.println("The sum of positive numbers in the array is: "+sum);
    }
}
