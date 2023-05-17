Given two strings s1 and s2. The task is to check if s2 is a rotated version of the string s1. The characters in the strings are in lowercase.
Input:
geeksforgeeks
forgeeksgeeks
Output: 
1
Explanation: s1 is geeksforgeeks, s2 is
forgeeksgeeks. Clearly, s2 is a rotated
version of s1 as s2 can be obtained by
left-rotating s1 by 5 units.
  
Input:
mightandmagic
andmagicmigth
Output: 
0
Explanation: Here with any amount of
rotation s2 can't be obtained by s1.
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            Solution obj = new Solution();
            if(obj.isrotation(s1,s2))
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
            t--;
        }
    }
}

class Solution {
    public boolean isrotation(String s1,String s2)
    {
        int n1 = s1.length();
        int n2 = s2.length();
        if(s1==null || s2==null)
        {
            return false;
        }
        if(n1!=n2)
        {
            return false;
        }
        String concatenated = s1+s1;
        if(concatenated.contains(s2))
        {
            return true;
        }
        return false;
    }
}
