// Create a program to return a new array deleting a specific element.
package Array;

import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element to be deleted: ");
        int num = in.nextInt();
        int[] DeletedArr = DeleteElement(arr , num);
        ArrayUtility.displayArray(DeletedArr);

    }
    public static int[] DeleteElement(int[] arr , int num){
        int[] newArr = new int[arr.length - 1];
        int i = 0;
        while(i < arr.length){
            if(arr[i] != num){
                newArr[i] = arr[i];
            }
            i++;
        }
        return newArr;
    }
}
