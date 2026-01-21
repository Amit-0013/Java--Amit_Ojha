// Concatenate and Convert: Take two strings, concatenate them,
//and convert the result to uppercase.
package string;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = in.next();
        System.out.print("Enter second name: ");
        String lastName = in.next();
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
     }
}
