//Convert an array of strings into a stream. Then, use the
//stream to print each string to the console.
package lambdaAndStreams;

import java.util.List;

public class StringToStream {
    public static void main(String[] args) {
        List<String> names = List.of("Amit" , "Harsh" , "Rishi" , "Aayan");
        names.stream()
                .forEach(System.out::println);
    }
//public static void main(String[] args) {
//    List<String> names = List.of("Prashant", "Sanchit", "Kg Coding");
//    names.stream()
//            .forEach(name -> System.out.println(name));

}
