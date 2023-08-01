Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.

import java.io.*;
import java.util.*;
import java.lang.*;

class Circle {
    double radius;
    Circle(double r)
    {
        this.radius = r;
    }
    public double getradius()
    {
        return radius;
    }
    public void setradius(double radius)
    {
        this.radius = radius;
    }
    public double area(double r)
    {
        double a = Math.PI*r*r;
        return a;
    }
    public double circumference(double r)
    {
        double c = 2*Math.PI*r;
        return c;
    }
}


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextInt();
        Circle ob = new Circle(rad);
        System.out.println("Present radius is " + ob.getradius());
        System.out.println("Area of the circle is " + ob.area(rad));
        System.out.println("Circumference of the circle is " + ob.circumference(rad));
        rad = 6;
        ob.setradius(rad);
        System.out.println("Present radius is " + ob.getradius());
        System.out.println("Area of the circle is " + ob.area(rad));
        System.out.println("Circumference of the circle is " + ob.circumference(rad));
    }
}
