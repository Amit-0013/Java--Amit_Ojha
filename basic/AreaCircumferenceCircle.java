package basic;

import java.util.Scanner;

public class AreaCircumferenceCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = in.nextInt();
        double area = Math.PI * Math.pow(radius , 2);
        double circum = 2 * Math.PI * radius;
        System.out.println("The area of circle is: "+area);
        System.out.println("The circumference of circle is: "+circum);
    }
}
