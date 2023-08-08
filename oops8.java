Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.

import java.io.*;
import java.util.*;
import java.lang.*;

class Trafficlight {
    String color;
    int duration;
    
    Trafficlight(String color,int duration)
    {
        this.color = color;
        this.duration = duration;
    }
    
    public int getduration()
    {
        return duration;
    }
    
    public void setduration(int duration)
    {
        this.duration = duration;
    }
    
    public void changecolor(String newcolor)
    {
        color = newcolor;
    }
    
    public boolean isRed()
    {
        return color.equals("red");
    }
    
    public boolean isGreen()
    {
        return color.equals("green");
    }
}

public class Main {
    public static void main(String[] args)
    {
        Trafficlight light1 = new Trafficlight("red",10);
        System.out.println("Is the light is red:" +light1.isRed());
        System.out.println("Is the light is green:" +light1.isGreen());
        
        light1.changecolor("green");
        
        System.out.println("Is the light is red:" +light1.isRed());
        System.out.println("Is the light is green:" +light1.isGreen());
        
        int a = light1.getduration();
        System.out.println(a);
        light1.setduration(20);
        a = light1.getduration();
        System.out.println(a);
    }
}
