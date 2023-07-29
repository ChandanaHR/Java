Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle rec = new Rectangle();
        System.out.println("Perimeter of the rectangle is " + rec.perimeter(l,b));
        System.out.println("Area of the rectangle is " + rec.area(l,b));
    }
}

class Rectangle {
    public static int perimeter(int l,int b)
    {
        int c = (2*l)+(2*b);
        return c;
    }
    public static int area(int l,int b)
    {
        int d = l*b;
        return d;
    }
}
