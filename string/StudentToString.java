// Define a Student class with fields like name and age, and use
//toString to print student details.
package string;

public class StudentToString {
    String name;
    int age;
    Long rollNo;

    StudentToString(String name , int age , long rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    public String toString(){
        return "Student Details:\nName -  " + name + " \nAge - "+ age+" \nRollNo - "+rollNo;

    }

    public static void main(String[] args) {
        StudentToString s1 = new StudentToString("Amit Kumar" , 21 , 11);
        System.out.println(s1.toString());
    }
}
