package Array;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i < size){
            System.out.printf("Please enter the element number %d: ",(i+1));
            arr[i] = in.nextInt();
            i++;
        }
        return arr;
    }
    public static void displayArray(int[] arr){
        int i = 0;
        while(i < arr.length){
            System.out.printf("The element number %d is: %d",(i+1),arr[i]);
            i++;
            System.out.println();
        }

    }
    public static int[][]  input2D(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = in.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.printf("Please enter the element of row %d: and column %d: ",(i+1),(j+1));
                 arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }
}
