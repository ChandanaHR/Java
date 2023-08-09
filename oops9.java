Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.

import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;

class Employee {
    String name;
    double salary;
    LocalDate hiredate;
    
    Employee(String name,double salary,LocalDate hiredate)
    {
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }
    
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    
    public double getsalary()
    {
        return salary;
    }
    public void setsalary(double salary)
    {
        this.salary = salary;
    }
    
    public LocalDate gethiredate()
    {
        return hiredate;
    }
    public void sethiredate(LocalDate hiredate)
    {
        this.hiredate = hiredate;
    }
    
    public int getyearsofservice()
    {
        return Period.between(hiredate,LocalDate.now()).getYears();
    }
    
    public void printemployeedetails()
    {
        System.out.println("Name : -> " +name);
        System.out.println("Salary: -> " +salary);
        System.out.println("Hiredate: -> " +hiredate);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Chandu", 50000, LocalDate.parse("2021-02-15"));
        Employee e2 = new Employee("Asha", 60000, LocalDate.parse("2020-03-20"));
        Employee e3 = new Employee("Ravi", 70000, LocalDate.parse("2018-01-01"));
        
        e1.printemployeedetails();
        System.out.println();
        e2.printemployeedetails();
        System.out.println();
        e3.printemployeedetails();
        System.out.println();
        
        System.out.println("Years of service: " +e1.getyearsofservice());
        System.out.println("Years of service: " +e2.getyearsofservice());
        System.out.println("Years of service: " +e3.getyearsofservice());
        
    }
}
