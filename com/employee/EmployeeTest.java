package com.employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit Kumar" , "A101" , 21 , 50000.);
        e1.setAge(20);
        System.out.println(e1.getAge());
        System.out.println(e1.getEmpId());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
