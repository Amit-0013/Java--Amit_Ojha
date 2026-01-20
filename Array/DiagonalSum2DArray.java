// Create a program to do sum and average of all elements in a 2-D array
package Array;

public class DiagonalSum2DArray {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2D();
        long sum = SumOfDiagonals(arr);
        System.out.println("The sum of diagonal element of array is: "+sum);
    }
    public static long SumOfDiagonals(int[][] arr){
        long rightSum = RightDiagonal(arr);
        long leftSum = LeftDiagonal(arr);
        long totalSum = rightSum + leftSum;
        if(arr.length % 2 != 0){
            int ind =  arr.length / 2;
            totalSum -= arr[ind][ind];
        }
        return totalSum;
    }
    public static long RightDiagonal(int[][] arr){
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int col = arr.length - 1 - i;
            sum += arr[i][col];
        }
        return sum;
    }
    public static long LeftDiagonal(int[][] arr){
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i][i];
        }
        return sum;
    }
}
