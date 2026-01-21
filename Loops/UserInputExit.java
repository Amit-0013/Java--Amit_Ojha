//Create a program using break to read inputs from the user in a loop and break
//the loop if a specific keyword (like "exit") is entered.
package Loops;

import java.util.Scanner;

public class UserInputExit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Please enter the string: ");
            String str = in.next();
            if(str.equalsIgnoreCase("Exit")){
                break;
            }
        }
        System.out.println("You have successfully exited the program.");
    }
}
