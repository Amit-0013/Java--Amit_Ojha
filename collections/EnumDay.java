//Create an enum called Day that represents the days of the
//week. Write a program that prints out all the days of the
//week from this enum.
package collections;

public enum EnumDay {
    Monday , Tuesday, Wednesday, Thursday , Friday , Saturday , Sunday;

}
class Demo{
    public static void main(String[] args) {
        EnumDay[] str = EnumDay.values();
        for (EnumDay s : str){
            System.out.println(s);
        }
    }

}