Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

  import java.io.*;
import java.util.*;
import java.lang.*;

class Dog {
    private String name;
    private String breed;
    public Dog(String name,String breed)
    {
        this.name = name;
        this.breed = breed;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getbreed()
    {
        return breed;
    }
    public void setbreed(String breed)
    {
        this.breed = breed;
    }
}


public class Main {
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Buddy","Golden retriever");
        Dog d2 = new Dog("Charlie","Bulldog");
        System.out.println(d1.getname()+" is a "+d1.getbreed());
        System.out.println(d2.getname()+" is a "+d2.getbreed());
        d1.setbreed("Labrador retriever");
        d2.setname("Daisy");
        System.out.println(d1.getname()+" is a "+d1.getbreed());
        System.out.println(d2.getname()+" is a "+d2.getbreed());
    }
}
