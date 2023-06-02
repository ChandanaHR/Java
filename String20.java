Given two binary strings A and B consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.


Example 1:

Input:
A = "1101", B = "111"
Output: 10100
Explanation:
 1101
+ 111
10100
Example 2:

Input: 
A = "10", B = "01"
Output: 11
Explanation: 
  10
+ 01
  11
    
 import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t>0)
        {
            String input[] = read.readLine().split(" ");
            String a = input[0];
            String b = input[1];
            Solution ob = new Solution();
            System.out.println(ob.addbinary(a,b));
            t--;
        }
    }
}

class Solution {
    public String addbinary(String A,String B)
    {
        java.math.BigInteger x = new java.math.BigInteger(A,2);
        java.math.BigInteger y = new java.math.BigInteger(B,2);
        java.math.BigInteger z = x.add(y);
        return z.toString(2);
    }
}
