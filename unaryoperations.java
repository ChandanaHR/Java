//UNARY OPERATIONS IN JAVA
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean cond = true;
        int num = sc.nextInt();
        int a = num;
        int b = -num;
        int c = num++;
        int d = num--;
        int e = ++num;
        int f = --num;
        int g = ~num;
        System.out.println("Unary plus:" +a);
        System.out.println("Unary minus:" +b);
        System.out.println("Post increment:" +c);
        System.out.println("Post decrement:" +d);
        System.out.println("Pre increment:" +e);
        System.out.println("Pre decrement:" +f);
        System.out.println("Bitwise Complement:" +g);
        System.out.println("NOT Operator:" +!(cond));
    }
}
