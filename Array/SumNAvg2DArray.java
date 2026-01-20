//Create a program to do sum and average of all elements in a 2-D array
package Array;

public class SumNAvg2DArray {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2D();
        long sum = Sum(arr);
        double avg = Avg(arr);
        System.out.println("The sum of 2D array is: "+sum);
        System.out.println("The average of 2D array is: "+avg);
    }
    public static long Sum(int[][] arr){
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }
        }
        return sum;
    }
    public static double Avg(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int size = rows * cols;
        if(size == 0) return 0;
        double avg = (double) Sum(arr) / size;
        return avg;
    }
}
