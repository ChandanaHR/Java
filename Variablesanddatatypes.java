//Given two integers a and b, you need to concatenate them so the output is ab and print it.

Examples:

Input: a = 5, b = 6
Output: 56
Explanation: Concatenate them.

  import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Write Your Code to Concatenate and print
        String result = String.valueOf(a)+String.valueOf(b);
        System.out.println(result);
    }
}

//Given two numbers a and b, you need to swap their values so a holds the value of b and b holds the value of a. Just write the code to swap values of a and b at the specified place.

Examples

Input: a = 1, b = 2
Output: 2 1
Explanation: Initially a = 1 and b = 2, now a = 2 and b = 1.
  // User function Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Write Code to Swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}

//Given a double value d, typecast it to an integer value and print it.

Example:

Input: d = 10.23
Output: 10
Explanation: The integer value of 10.23 is 10

  import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        // Typecast and print
        int res = (int)d;
        System.out.println(res);
    }
}
