package com.employee;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String empId;

    public Employee(String name , String empId , int age , double salary){
        this.name = name;
        this.empId = empId;
        this.age = age;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}
