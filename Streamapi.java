1a) What is Stream API
  Before Java 8, if we wanted to process data from a collection (like a List or Set), we usually wrote loops.
Example:

Suppose we have the numbers:

10
15
20
25
30
We want only the even numbers.
Before Java 8
We write:
for(int number : numbers){
if(number % 2 == 0){
System.out.println(number);}
}

We manually write:

Loop
Condition
Print

Lots of code.

Java 8 Stream API

Now we simply write

numbers.stream()
       .filter(number -> number % 2 == 0)
       .forEach(System.out::println);

Java does all the looping internally.
A Stream is a sequence of elements that allows us to process data in a simple, readable, and efficient way.
  Stream API is used to process collections like List, Set, and Map using functional programming.

  1b) Stream Lifecycle
  Collection

↓

Stream

↓

Intermediate Operations

↓

Terminal Operation

↓

Result

  Step 1: Collection

                Example
                
                List<Integer> numbers =
                List.of(10,20,30,40);
                
                This is the source.
  Step 2: Convert to Stream
          numbers.stream()
          Now Java creates a Stream.
                  Step 3

                    Intermediate Operations
                    
                    These process the data.
                    
                    Examples
                    
                    filter()
                    
                    map()
                    
                    sorted()
                    
                    distinct()
                    
                    These operations prepare the data but do not execute immediately.
  Step 4: Terminal Operation
                Examples
                collect()
                forEach()
                count()
                This triggers the execution of the Stream pipeline.

1c) Creating streams
                  Creating Stream from Array
                   Suppose we have an array.
                   int[] numbers = {10,20,30,40,50};
                    Arrays.stream(arrayName)
                      import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        Arrays.stream(numbers)
              .forEach(System.out::println);

    }

}

Creating Stream from List

A List is the most commonly used collection in Java.

Suppose we have

List<String> names =
List.of("Java","Spring","Python");

We convert it into a Stream.

Syntax
list.stream()

  import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names =
                List.of("Java","Spring","Python");

        names.stream()
             .forEach(System.out::println);

    }

}

Creating Stream from Set

A Set stores unique elements.

Suppose

Set<Integer> numbers =
Set.of(10,20,30,40);
Syntax
set.stream()
Example
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> numbers =
                Set.of(10,20,30,40);

        numbers.stream()
               .forEach(System.out::println);

    }

}
We simply tell Java

"Give me the even numbers."


  Creating Stream from Map Values

Many beginners ask
Can we write
map.stream()
Answer
No.
A Map itself doesn't provide a direct stream() method.

Instead,

we create Streams from

Keys
Values
Entries
  Suppose

Map<Integer,String> students =
new HashMap<>();
1 → Rahul

2 → Amit

3 → Kiran
Stream from Values
map.values().stream()

  import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer,String> students =
                new HashMap<>();

        students.put(1,"Rahul");
        students.put(2,"Amit");
        students.put(3,"Kiran");

        students.values()
                .stream()
                .forEach(System.out::println);

    }

}

Stream from Keys
students.keySet()
        .stream()
        .forEach(System.out::println);
Stream from Entries
students.entrySet()
        .stream()
        .forEach(System.out::println);

1d) Intermediate operations
  Intermediate operations process the data in a stream.

They do not produce the final result immediately.

  a) filter()
What is filter()?

filter() is used to select only the elements that satisfy a condition.

Easy Definition

filter() removes unwanted elements and keeps only the required elements.
  example:
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10,15,20,25,30);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }

}
b) map()
What is map()?

map() is used to convert one value into another.

Easy Definition

map() transforms every element.

  List<Integer> numbers =
        List.of(2,3,4,5);

numbers.stream()
        .map(n -> n * n)
        .forEach(System.out::println);
example 2) Convert to uppercase
  List<String> names =
        List.of("java","spring","python");

names.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);

c) distinct()
What is distinct()?

distinct() removes duplicate elements.

Easy Definition

Returns only unique elements.
  List<Integer> numbers =
        List.of(10,20,20,30,30,40);

numbers.stream()
        .distinct()
        .forEach(System.out::println);
d) sorted()
What is sorted()?

sorted() arranges elements in order.

Easy Definition

Sorts elements in ascending order by default.
  List<Integer> numbers =
        List.of(50,10,30,20);

numbers.stream()
        .sorted()
        .forEach(System.out::println);
example 2) import java.util.Comparator;

List<Integer> numbers =
        List.of(50,10,30,20);

numbers.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);

e) limit()
What is limit()?

limit() returns only the first N elements from a Stream.

Easy Definition

limit() is used to restrict the number of elements in a Stream.
  import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10,20,30,40,50,60);

        numbers.stream()
               .limit(3)
               .forEach(System.out::println);

    }

}

f) skip()
What is skip()?

skip() ignores the first N elements and returns the remaining elements.

Easy Definition

skip() skips unwanted elements from the beginning.
  import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10,20,30,40,50);

        numbers.stream()
               .skip(2)
               .forEach(System.out::println);

    }

}

g) peek()
What is peek()?

peek() performs an action on each element without changing it.

It is mainly used for debugging.

Easy Definition

peek() lets us look at each element while it is moving through the Stream.
  List<Integer> numbers =
        List.of(10,20,30);

numbers.stream()
       .peek(n -> System.out.println("Before: " + n))
       .map(n -> n * 2)
       .peek(n -> System.out.println("After: " + n))
       .forEach(System.out::println);

h) flatMap()
  flatMap() converts multiple Streams (or collections) into a single Stream.
  flatMap() flattens nested collections into one Stream.
  import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<List<String>> names = List.of(

                List.of("Java","Spring"),

                List.of("Python","React"),

                List.of("Go","Node")

        );

        names.stream()
             .flatMap(List::stream)
             .forEach(System.out::println);

    }

}
example 2) List<List<Integer>> numbers =
        List.of(

                List.of(10,20),

                List.of(30,40)

        );

numbers.stream()
       .forEach(System.out::println);


1e) Terminal operation
  A Terminal Operation produces the final result and executes the stream pipeline.
  a) collect(): collect() gathers the processed elements from the Stream and stores them into a collection like a List, Set, or Map.
  Syntax: stream.collect(Collectors.toList());
import java.util.*;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10,15,20,25,30);

        List<Integer> evenNumbers =
                numbers.stream()
                       .filter(n -> n % 2 == 0)
                       .collect(Collectors.toList());

        System.out.println(evenNumbers);

    }
}

b) 
