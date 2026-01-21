package string;

public class StringBuilderExample {
    public static void main(String[] args) {
        String[] str = new String[]{"Java" , "is" , "a" , "wonderful" , "language."};
        StringBuilder sb = new StringBuilder();
        for (String st : str){
            sb.append(st).append(" ");
        }
        System.out.println(sb);
    }
}
