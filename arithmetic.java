//ARITHMETIC OPERATIONS IN JAVA
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();
        double sum = num1+num2;
        double difference = num1-num2;
        double product = num1*num2;
        double modulus = num1%num2;
        System.out.println("Addition of two numbers:" +sum);
        System.out.println("Subtraction of two numbers:" +difference);
        System.out.println("Multiplication of two numbers:" +product);
        if(num2==0)
        {
            System.out.println("Division error");
        }
        else
        {
            double div = num1/num2;
            System.out.println("Division of two numbers:" +div);
        }
        System.out.println("Modulus of two numbers:" +modulus);
    }
}
