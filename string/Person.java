//Create a class Person with attributes name and age. Override
//equals() to compare Person objects based on their attributes.
//Override hashCode() consistent with the definition of equal
package string;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Amit Kumar" , 21);
        Person p2 = new Person("Amit Kumar" , 21);
        if(p1.equals(p2)){
            System.out.println("Equals.");
        }else{
            System.out.println("Not equals.");
        }
    }
}
