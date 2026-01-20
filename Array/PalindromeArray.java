//Create a program to check is the array is palindrome or not.
package Array;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        boolean isPalindrome = isPalin(arr);
        if(isPalindrome){
            System.out.println("The array is palindrome.");
        }
        else {
            System.out.println("The array is not palindrome.");
        }
    }
    public static boolean isPalin(int[] arr){
        int i = 0;
        while(i < arr.length/2){
            if(arr[i] != arr[arr.length - 1-i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
