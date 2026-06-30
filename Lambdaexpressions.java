1a) What is a Lambda Expression?
Before Understanding Lambda

Let's first understand a problem.

Suppose we have a Functional Interface.

@FunctionalInterface
interface Greeting{
    void sayHello();
}

To implement it before Java 8, we used an Anonymous Class.

Greeting g = new Greeting() {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

};

This is a lot of code just to print one line.

Java 8 introduced Lambda Expressions to make this much simpler.


  1b) Definition
A Lambda Expression is a short and concise way to implement a Functional Interface.
Or simply,
A Lambda Expression is an anonymous function used to implement a Functional Interface.
  What is Anonymous function
  Normally every method has a name.
Example
public void add() {
}
Method name: add
  But a lambda has no method name.
  It is an anonymous function.
  Lambda syntax: (parameters) -> expression
                  or
                  (parameters) -> {statements;}
  Components of Lambda (a,b)->a+b

  Benefits of Lambda
1. Less Code
Before Java 8
20–30 lines
After Lambda
2–3 lines
2. Easy to Read
Small and clean.
3. Easy to Maintain
Less code means easier maintenance.
4. Supports Functional Programming
Lambda works with Functional Interfaces.
 5. Used in Stream API
Example
list.stream()
.filter(n -> n > 10)
.forEach(System.out::println);

1c)Anonymous Class vs Lambda
  interface Greeting{
    void hello();
}
Anonymous Class
  Greeting g = new Greeting() {

    @Override
    public void hello() {

        System.out.println("Hello");

    }

};
Lambda
  Greeting g = () -> System.out.println("Hello");

1d) Lambda syntax examples
 ** No Parameter
  ()->{

    System.out.println("Hello");

} Input: Nothing
** One parameter
  (name)->{

    System.out.println(name);

}
Example: Consumer<String> c =

(name)->System.out.println(name);

c.accept("Chandana");
** Multiple parameters
  (a,b)->{

    System.out.println(a+b);

}
  example
  interface Add{

    int sum(int a,int b);

}

Add add=(a,b)->a+b;

System.out.println(add.sum(10,20));

1e) Lambda with Functional Interfaces
  Predicate: Checks condition
  import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {

        Predicate<Integer> even =

                n -> n % 2 == 0;

        System.out.println(even.test(8));

    }

}
Consumer: Consumes data
  import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {

        Consumer<String> c =

                name -> System.out.println("Hello " + name);

        c.accept("Chandana");

    }

}
Supplier: Supplies data
  import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {

        Supplier<String> s =

                () -> "Java Backend";

        System.out.println(s.get());

    }

}
Runnable: Runnable itself is a Functional Interface.
Runnable r=

()->System.out.println("Running");

r.run();

Problems
  1) Add two numbers
  Functional Interface
@FunctionalInterface
interface Addition {
    int add(int a, int b);
}
Implementation
public class Main {

    public static void main(String[] args) {

        Addition addition = (a, b) -> a + b;

        System.out.println("Sum = " + addition.add(10, 20));
    }
}

2) Find Maximum
@FunctionalInterface
interface Maximum {
    int max(int a, int b);
}

public class Main {

    public static void main(String[] args) {

        Maximum maximum = (a, b) -> a > b ? a : b;

        System.out.println("Maximum = " + maximum.max(15, 25));
    }
}

3) Greeting Message
@FunctionalInterface
interface Greeting {
    void greet(String name);
}

public class Main {

    public static void main(String[] args) {

        Greeting greeting = name -> System.out.println("Hello, " + name);

        greeting.greet("Chandana");
    }
}

4) Sort Employees by Name
  Employee Class
class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}
Main Class
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 50000));
        employees.add(new Employee(102, "Amit", 70000));
        employees.add(new Employee(103, "Kiran", 60000));

        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));

        employees.forEach(System.out::println);
    }
}
Sort Employees by Salary
employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
