//Assigning grade for given marks.
package IfElse;

import java.util.Scanner;

public class GradeCard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = in.nextInt();
        if(marks >= 90) System.out.println("Grade A");
        else if(marks >= 75) System.out.println("Grade B");
        else if(marks >= 60) System.out.println("Grade C");
        else if(marks >= 45) System.out.println("Grade D");
        else System.out.println("Grade F");
    }
}
