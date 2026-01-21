//  Create a program using do-while to find password checker until a valid password is entered
package Loops;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to password checker.");
        String password;
        do{
            System.out.print("Please enter your password: ");
            password = in.next();

        }while(!isValidPassword(password));
        System.out.println("Thanks for entering valid password.");

    }
    public static boolean isValidPassword(String password){
         return password.length() > 6 && Character.isUpperCase(password.charAt(0));
    }
}

