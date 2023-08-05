Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

import java.io.*;
import java.util.*;
import java.lang.*;

class Employee {
    String name;
    String jobtitle;
    double salary;
    Employee(String name,String jobtitle,double salary)
    {
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getjobtitle()
    {
        return jobtitle;
    }
    public void setjobtitle(String jobtitle)
    {
        this.jobtitle = jobtitle;
    }
    public double getsalary()
    {
        return salary;
    }
    public void setsalary(double salary)
    {
        this.salary = salary;
    }
    public void modify(double percentage)
    {
        salary = salary+salary*percentage/100;
    }
    public void printemployeedetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Job title: "+jobtitle);
        System.out.println("Salary: "+salary);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Chandu","SE",60000);
        Employee e2 = new Employee("Asha","QA",70000);
        Employee e3 = new Employee("Ravi","SDE",80000);
        e1.printemployeedetails();
        e2.printemployeedetails();
        e3.printemployeedetails();
        System.out.println();
        e1.modify(5);
        e2.modify(6);
        e3.modify(7);
        System.out.println();
        e1.printemployeedetails();
        e2.printemployeedetails();
        e3.printemployeedetails();
        System.out.println();
        System.out.println(e1.getname()+ " role is " +e1.getjobtitle()+ " for the salary " +e1.getsalary());
        System.out.println(e2.getname()+ " role is " +e2.getjobtitle()+ " for the salary " +e2.getsalary());
        System.out.println(e3.getname()+ " role is " +e3.getjobtitle()+ " for the salary " +e3.getsalary());
    }
}
