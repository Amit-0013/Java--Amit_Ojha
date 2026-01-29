//Enhance the Day enum by adding an attribute that
//indicates whether it is a weekday or weekend. Add a
//method in the enum that returns whether it's a weekday or
//weekend, and write a program to print out each day along
//with its type
package collections;

public enum EnhancedEnumDay {
    Monday(true) , Tuesday(true) , Wednesday(true) , Thursday(true) , Friday(true) , Saturday(false) , Sunday(false);
    private final boolean isWeekday;

    EnhancedEnumDay( boolean isWeekday){
        this.isWeekday = isWeekday;
    }
    public String getType(){
        return isWeekday? "Weekday" : "Weekend";
    }

}
class DayTest{
    public static void main(String[] args) {
        EnhancedEnumDay[] str = EnhancedEnumDay.values();
        System.out.println("Printing the days with their type: ");
        for (EnhancedEnumDay s : str){
            System.out.println(s+ ":"+s.getType());
        }
    }
}
