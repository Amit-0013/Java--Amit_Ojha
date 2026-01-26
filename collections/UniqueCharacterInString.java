//Write a program that takes a string and returns the number of
//unique characters using a Set.
package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacterInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your String: ");
        String userStr = in.next();
        Set<Character> unique = new HashSet<>();
        for (char c : userStr.toCharArray()) {
            unique.add(c);


        }
        System.out.printf("Your String has %d unique characters.",unique.size());
    }
}
