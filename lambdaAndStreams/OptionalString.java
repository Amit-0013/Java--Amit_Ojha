//Write a function that accepts a string and returns an
//Optional<String>. If the string is empty or null, return an
//empty Optional, otherwise, return an Optional containing the
//uppercase version of the string.
package lambdaAndStreams;

import java.util.Locale;
import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(isOptional(null));
        System.out.println(isOptional("Amit"));
        System.out.println(isOptional(""));

    }
    public static Optional<String> isOptional(String str){
        if(str == null || str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
