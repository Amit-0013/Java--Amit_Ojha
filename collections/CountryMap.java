// Create a Map where the keys are country names (as String)
//and the values are their capitals (also String). Populate the
//map with at least five countries and their capitals. Write a
//program that prompts the user to enter a country name
//and then displays the corresponding capital, if it exists in
//the map.
package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> cap = new HashMap<>();
        cap.put("India", "New Delhi");
        cap.put("America", "New York");
        cap.put("Nepal", "Katmandu");
        cap.put("Afganistan", "Kabul");
        cap.put("SriLanka", "Colombo");
        System.out.print("Please enter the name of the country: ");
        String country = in.next();
        if (cap.containsKey(country)) {
            System.out.printf("The capital of %s is: %s",country , cap.get(country));
        }else{
            System.out.println("The country does not exist in the database.");
        }
    }
}
