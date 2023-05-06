Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.
Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.
Input:a = allergy, b = allergic
Output: NO
Explanation: Characters in both the strings are 
        not same, so they are not anagrams.

import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String str = br.readLine();
            String s1 = str.split(" ")[0];
            String s2 = str.split(" ")[1];
            Solution obj = new Solution();
            if(obj.isanagram(s1,s2))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}

class Solution {
    public static boolean isanagram(String s1,String s2)
    {
        int n1 = s1.length();
        int n2 = s2.length();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if(n1!=n2)
        {
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<n1;i++)
        {
            if(c1[i] != c2[i])
            {
                return false;
            }
        }
        return true;
    }
}

//Strings cant be sorted hence it has to be converted to array
//String.toCharArray method is used to convert string to array
