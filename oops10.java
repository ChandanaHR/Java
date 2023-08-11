Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.

import java.io.*;
import java.util.*;
import java.lang.*;

class Student {
    String name;
    int grade;
    ArrayList<String> courses;
    
    Student(String name,int grade)
    {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }
    
    public String getname() 
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    
    public int getgrade()
    {
        return grade;
    }
    public void setgrade(int grade)
    {
        this.grade = grade;
    }
    
    public ArrayList<String> getcourses()
    {
        return courses;
    }
    
    public void addcourse(String course)
    {
        courses.add(course);
    }
    
    public void removecourse(String course)
    {
        courses.remove(course);
    }
    
    public void Studentdetails()
    {
        System.out.println("Name:-> " +name);
        System.out.println("Grade:-> " +grade);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Student s1 = new Student("Chandu",8);
        Student s2 = new Student("Asha",9);
        Student s3 = new Student("Ravi",10);
        
        s1.Studentdetails();
        System.out.println();
        s2.Studentdetails();
        System.out.println();
        s3.Studentdetails();
        System.out.println();
        
        System.out.println("Adding courses for:" +s1.getname());
        s1.addcourse("Java");
        s1.addcourse("html");
        s1.addcourse("css");
        System.out.println(s1.getcourses());
        
        System.out.println();
        
        System.out.println("Adding courses for:" +s2.getname());
        s2.addcourse("C");
        s2.addcourse("AI");
        s2.addcourse("Operating system");
        System.out.println(s2.getcourses());
        
        System.out.println();
        
        System.out.println("Adding courses for:" +s3.getname());
        s3.addcourse("Python");
        s3.addcourse("dbms");
        s3.addcourse("javascript");
        s3.addcourse("typescript");
        System.out.println(s3.getcourses());
        
        System.out.println();
        
        System.out.println("After removing typescript course from: " +s3.getname());
        s3.removecourse("typescript");
        System.out.println(s3.getcourses());
        
        
    }
}
