Java Syntax and Structure explanation
  Basic syntax elements
    Java is casesensitive
    Every statement ends with a semicolon (;)
    Curly braces define blocks (class body, method body, loops, if-else, etc.)

  Java program structure
      public class Main {
        public static void main(String[] args) {
            System.out.println("Hello Java!");
        }
      }
      Class declaration
        public → access modifier (visible to everyone)
        class → keyword to declare a class
        Main → class name (same as file name, Main.java)

      Main method: 
          public static void main(String[] args)
            public → accessible to JVM
            static → JVM can call it without creating an object
            void → does not return anything
            main → method name
            String[] args → command-line arguments
        Printing output: 
            System.out.println("Hello");
            System → predefined class
              out → output stream
              println() → method to print with a new line

  Import statements:
              Import statements allow you to use predefined classes from other packages without writing the full package name.
              java.util.Scanner sc = new java.util.Scanner(System.in);
              import java.util.Scanner;
              Scanner sc = new Scanner(System.in);

              import java.io.*;
              java.io = Input/Output package
                Reading files

                Writing files
                
                Working with streams
                
                Reading keyboard input (older method)
                
                Handling serialization

                import java.util.*;
                Import all classes and interfaces from the java.util package.
                  Common classes included in java.util.*;
                  Collections Framework

                    ArrayList
                    LinkedList
                    HashSet
                    
                    TreeSet
                    
                    HashMap
                    
                    TreeMap
                    
                    Vector
                    
                    Stack
                    
                    Queue
                    
                    PriorityQueue
                    
                    Collections (utility class)
                    
                    Comparator
                    
                    Iterator
                    
                    ✔ Input
                    
                    Scanner
                    
                    ✔ Utilities
                    
                    Random
                    
                    Objects
                    
                    Optional
                    
                    ✔ Date/Time (old API)
                    
                    Date
                    
                    Calendar

                    import java.lang.*;
                    Import all classes from the java.lang package.
                      java.lang contains the most fundamental classes required for every Java program.
                      Core Data Type Wrappers

Integer

Float

Double

Long

Short

Byte

Character

Boolean

✔ Basic Utility Classes

Math

System

Runtime

Process

Thread

Object (superclass of all classes)

✔ String Handling Classes

String

StringBuffer

StringBuilder

✔ Exception Classes

Exception

RuntimeException

Error


  Datatypes: Primitive data types, nonprinitve data types
  byte  Byte : BYTE.SIZE(bits), BYTE.BITS(bytes)
  short Short : Short.SIZE, Short.BITS
  int Integer
  long Long
  float Float
  double Double
  char Character
  boolean Boolean
  
  Wrapper classes in Java are classes that convert primitive data types into objects.
They “wrap” the primitive values inside an object — hence the name wrapper class.
