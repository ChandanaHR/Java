Given two numbers as strings s1 and s2. Calculate their Product.

Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers.


Example 1:

Input:
s1 = "33"
s2 = "2"
Output:
66
Example 2:

Input:
s1 = "11"
s2 = "23"
Output:
253
  
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String a = sc.next();
            String b = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.multiplystrings(a,b));
            t--;
        }
    }
}

class Solution {
    public  String multiplystrings(String s1,String s2)
    {
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        BigInteger mul = num1.multiply(num2);
        return mul.toString();
    }
}
