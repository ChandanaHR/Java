Given a string S, Check if characters of the given string can be rearranged to form a palindrome.
Note: You have to return 1 if it is possible to convert the given string into palindrome else return 0. 
Input:
S = "geeksogeeks"
Output: Yes
Explanation: The string can be converted
into a palindrome: geeksoskeeg
Input: 
S = "geeksforgeeks"
Output: No
Explanation: The given string can't be
converted into a palindrome.
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0)
        {
            String s = in.next();
            Solution obj = new Solution();
            if(obj.ispossible(s)==1)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}

class Solution{
    int ispossible(String s)
    {
        int[] freq = new int[256];
        Arrays.fill(freq,0);
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        
        for(int i=0;i<256;i++)
        {
            System.out.println(i+" "+freq[i]);
        }
        
        int count=0;
        for(int i=0;i<256;i++)
        {
            if(freq[i]%2 == 1)
            {
                count++;
            }
        }
        return (count<=1) ? 1:0;
    }
}
