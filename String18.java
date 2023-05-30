Given a decimal number m. Convert it into a binary string and apply n iterations, in each iteration 0 becomes 01, and 1 becomes 10. Find the kth (1-indexing) character in the string after the nth iteration.

Example 1:

Input: m = 5, n = 2, k = 5
output: 0
Explanation: Binary representation of m 
is "101", after one iteration binary 
representation will be "100110", and after 
second iteration binary representation 
will be "100101101001". 
Example 1:

Input: m = 5, n = 2, k = 1
output: 1
Explanation: Binary representation of m 
is "101", after one iteration binary 
representation will be "100110", and after 
second iteration binary representation
will be "100101101001". 
  
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t>0)
        {
            String input[] = read.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);
            Solution ob = new Solution();
            System.out.println(ob.kthcharacter(m,n,k));
            t--;
        }
    }
}

class Solution {
    public char kthcharacter(int m,int n,int k)
    {
        String s = Integer.toBinaryString(m);
        while(n>0)
        {
            String ans = "";
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='0')
                {
                    ans = ans+"01";
                }
                else if(s.charAt(i)=='1')
                {
                    ans = ans+"10";
                }
            }
            s = ans;
            n--;
        }
        return s.charAt(k-1);
    }
}
