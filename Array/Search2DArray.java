// Create a program to search an element in a 2-D array
package Array;

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2D();
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the element to be searched: ");
        int element = in.nextInt();
        boolean found = isFound(arr , element);
        if(found) System.out.println("The element exists in the array.");
        else System.out.println("The element is not found in the array.");
    }
    public static boolean isFound(int[][] arr , int element){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == element){
                    return true;
                }
            }
        }
        return false;
    }
}
