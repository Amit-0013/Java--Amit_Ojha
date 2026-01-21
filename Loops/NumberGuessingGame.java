//Create a program using do-while to implement a number guessing game.
package Loops;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int random = (int) (Math.random() * 100);
        int count = 0; int guessedNumber;
        do{
            System.out.print("Please enter a number: ");
            guessedNumber = in.nextInt();
            count++;
            if(guessedNumber < random){
                System.out.println("Please enter a higher number.");
            }
            else if(guessedNumber > random){
                System.out.println("Please enter a lower number.");
            }

        }while(guessedNumber != random);
        System.out.printf("Congratulations you have guessed the number in %d attempts.",count);
    }

}
