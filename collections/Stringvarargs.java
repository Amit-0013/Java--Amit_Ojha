//Write a method concatenate Strings that takes variable arguments
//of String type and concatenates them into a single string
package collections;

public class Stringvarargs {
    public static void main(String[] args) {
        System.out.println(concat("Amit" , "ojha"));
        System.out.println(concat("Java" , "is" , "Great."));

    }
    public static String concat(String... str){
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
