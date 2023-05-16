Given two strings A and B, find if A is a subsequence of B.

Input:
A = AXY 
B = YADXCP
Output: 0 
Explanation: A is not a subsequence of B
as 'Y' appears before 'A'.
  
Input:
A = gksrek
B = geeksforgeeks
Output: 1
Explanation: A is a subsequence of B.
  
import java.io.*;
import java.util.*;

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
            if(ob.subsequence(a,b))
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
            t--;
        }
    }
}

class Solution {
    public boolean subsequence(String A,String B)
    {
        int l = A.length();
        int n = B.length();
        int i,j=0;
        for(i=0;i<n;i++)
        {
            if(A.charAt(j)==B.charAt(i))
            {
                j++;
            }
            if(j==l)
            {
                return true;
            }
        }
        return false;
    }
}
