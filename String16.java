Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.
Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
  
Input:
S = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is
the character which is non-repeating. 
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String st = sc.next();
            Solution obj = new Solution();
            char ans = obj.nonrepeatingcharacter(st);
            if(ans!='$')
            {
                System.out.println(ans);
            }
            else
            {
                System.out.println(-1);
            }
            t--;
        }
    }
}

class Solution {
    public char nonrepeatingcharacter(String S)
    {
        int freq[] = new int[26];
        Arrays.fill(freq,0);
        int n = S.length();
        for(int i=0;i<n;i++)
        {
            freq[S.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++)
        {
            if(freq[S.charAt(i)-'a']==1)
            {
                return S.charAt(i);
            }
        }
        return '$';
    }
}
