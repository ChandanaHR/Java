Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

  import java.io.*;
import java.util.*;
import java.lang.*;

class Person {
    String name;
    int age;
    public Person(String nam,int ag)
    {
        this.name = nam;
        this.age = ag;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Person p1 = new Person("Chandu",23);
        Person p2 = new Person("Asha",45);
        Person p3 = new Person("Ravi",50);
        System.out.println(p1.getname()+" is "+p1.getage()+" years old");
        System.out.println(p2.getname()+" is "+p2.getage()+" years old");
        System.out.println(p3.getname()+" is "+p3.getage()+" years old");
    }
}
