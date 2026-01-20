// Create a program to merge two sorted arrays.
package Array;

public class MergeTwoArrays {
    public static void main(String[] args) {
        System.out.println("Please enter the first Array");
        int[] arr1 = ArrayUtility.inputArray();
        System.out.println("Please enter the second array");
        int[] arr2 = ArrayUtility.inputArray();
        int[] newArr = merge(arr1 , arr2);
        ArrayUtility.displayArray(newArr);
    }
    public static int[] merge(int[] arr1 , int[] arr2){
        int newSize  = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0 , j = 0 , k = 0;
        while(i < arr1.length || j < arr2.length){
            if(j == arr2.length  || (i < arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}
