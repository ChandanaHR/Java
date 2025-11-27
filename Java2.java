Accepting an input from the keyboard using Scanner class
  import java.io.*;
  import java.util.*;
  import java.lang.*;
  
  public class Main
  {
  	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		System.out.println("Enter a byte value: ");
          byte a = sc.nextByte();
          System.out.println("Enter a short value: ");
          short b = sc.nextShort();
          System.out.println("Enter a int value: ");
          int c = sc.nextInt();
          System.out.println("Enter a long value: ");
          long d = sc.nextLong();
          System.out.println("Enter a float value: ");
          float e = sc.nextFloat();
          System.out.println("Enter a double value: ");
          double f = sc.nextDouble();
          System.out.println("Enter a character value: ");
          char g = sc.next().charAt(0);
          System.out.println("Enter a boolean value: ");
          boolean h = sc.nextBoolean();
  	}
  }

BigInteger : In Java, BigInt does not exist as a primitive type, but Java provides two special classes for handling very large numbers:
BigInteger: Used when the integer value is bigger than long (64-bit).
BigInteger has unlimited size (only limited by RAM).
  BigInteger(Used when the integer value is bigger than long (64-bit).)
      import java.math.BigInteger;

      public class Main {
          public static void main(String[] args) {
      
              BigInteger a = new BigInteger("987654321012345678909876543210");
              BigInteger b = new BigInteger("12345678901234567890");
      
              BigInteger sum = a.add(b);
              BigInteger product = a.multiply(b);
              BigInteger diff = a.subtract(b);
      
              System.out.println("Sum: " + sum);
              System.out.println("Product: " + product);
              System.out.println("Difference: " + diff);
          }
      }
  BigDecimal (for very large decimals with precision)
      import java.math.BigDecimal;

      public class Main {
          public static void main(String[] args) {
      
              BigDecimal x = new BigDecimal("12345.678901234567890");
              BigDecimal y = new BigDecimal("0.000000000123456789");
      
              BigDecimal result = x.add(y);
      
              System.out.println("Result: " + result);
          }
      }

    Operators
      Unary,Binary,Ternary
      Unary operators (a++, ++a, --a, a--)

      Binary operators :
      Arithmetic operators: +, -, *, /, %
      Comparison operators: ==, !=, >,<,>=,<=
      Logical operators: &&, ||, !
      Bitwise operators
          AND - &, OR-`, NOT - ~, XOR-^, Left shift:<<, Right shift: >>, Unsigned right shift: >>>
