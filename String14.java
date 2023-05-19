Given two strings A and B. Find the characters that are not common in the two strings. 

Note :- Return the string in sorted order.
Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation: 
The characters 'f', 'i', 'o', 'q', 'r', 'u','z' 
are either present in A or B, but not in both.
  
Input:
A = characters
B = alphabets
Output: bclpr
Explanation: The characters 'b','c','l','p','r' 
are either present in A or B, but not in both.
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String a = sc.next();
            String b = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.uncommoncharacters(a,b));
            t--;
        }
    }
}

class Solution {
    public String uncommoncharacters(String A,String B)
    {
        String ans = "";
        int i,j;
        boolean used[] = new boolean[26];
        for(i=0;i<A.length();i++)
        {
            boolean found = false;
            for(j=0;j<B.length();j++)
            {
               if(A.charAt(i)==B.charAt(j))
               {
                   found = true;
                   break;
               }
            }
            if(!found && !used[A.charAt(i)-'a'])
            {
                used[A.charAt(i)-'a'] = true;
                ans+=A.charAt(i);
            }
        }
        for(i=0;i<B.length();i++)
        {
            boolean found = false;
            for(j=0;j<A.length();j++)
            {
               if(B.charAt(i)==A.charAt(j))
               {
                   found = true;
                   break;
               }
            }
            if(!found && !used[B.charAt(i)-'a'])
            {
                used[B.charAt(i)-'a'] = true;
                ans+=B.charAt(i);
            }
        }
        char temparray[] = ans.toCharArray();
        Arrays.sort(temparray);
        if(temparray.length==0)
        {
            return "-1";
        }
        return new String(temparray);
    }
}
