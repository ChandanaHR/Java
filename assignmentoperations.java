//ASSIGNMENT OPERATIONS IN JAVA
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        System.out.println("Simple Assignment=" +num1);
        System.out.println("Addition Compound Assignment=" +(num+=10));
        System.out.println("Subtraction Compound Assignment=" +(num-=10));
        System.out.println("Multiplication Compound Assignment=" +(num*=10));
        System.out.println("Division Compound Assignment=" +(num/=10));
        System.out.println("Modulus Compound Assignment=" +(num%=10));
    }
}
