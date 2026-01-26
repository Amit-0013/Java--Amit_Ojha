package com.example.utils;
import com.example.geometry.*;


public class Calculator {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        Rectangle r1 = new Rectangle(10 , 12);
        double areaCir = Math.PI * c1.radius * c1.radius;
        double areaRect = r1.length * r1.breadth;
        System.out.println("The area of circle is: "+areaCir);
        System.out.println("The area of rectangle is: "+areaRect);
    }
}
