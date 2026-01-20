// Converting temperature from Fahrenheit to Celsius
package basic;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double faren = in.nextDouble();
        double cel = (faren - 32) * 5/9;
        System.out.println("The temperature in Celsius is: "+cel);
    }
}
