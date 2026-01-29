//Given a list of strings, use stream operations to filter out
//strings that have length of 10 or more and then
//concatenate the remaining strings.
package lambdaAndStreams;

import java.util.List;

public class StringLength {
    public static void main(String[] args) {
        List<String> list = List.of("Java" , "is" , "Wonderful" , "Object-Oriented language.");
        String result = list.stream()
                .filter(lists -> lists.length() < 10)
                .reduce("",(a,b) -> a + " "+b);
        System.out.println(result);
    }
}
