//LOGICAL OPERATIONS (AND,OR,NOT) IN JAVA
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int d;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a<b) && (b==c))
        {
            d = a+b+c;
            System.out.println("The sum is=" +d);
        }
        else
        {
            System.out.println("False condition");
        }
        if((a<b) || (b==c))
        {
            d = a+b+c;
            System.out.println("The sum is=" +d);
        }
        else
        {
            System.out.println("False condition");
        }
        System.out.println("!(a<b)=" +!(a<b));
        System.out.println("!(b<c)=" +!(b<c));
    }
}
