//BASIC INPUT OPERATIONS USING SCANNER CLASS 
import java.io.*;
import java.util.*;
class Main {
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
        String name;
        int rollno;
        float marks;
        System.out.println("Enter the name");
        name = obj.nextLine();
        System.out.println("Enter the rollno");
        rollno = obj.nextInt();
        System.out.println("Enter the marks");
        marks = obj.nextFloat();
        System.out.println("Name=" + name);
        System.out.println("Rollno=" + rollno);
        System.out.println("Marks=" + marks);
    }
}
