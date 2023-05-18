Given two strings of lowercase alphabets and a value K, your task is to complete the given function which tells if  two strings are K-anagrams of each other or not.

Two strings are called K-anagrams if both of the below conditions are true.
1. Both have same number of characters.
2. Two strings can become anagram by changing at most K characters in a string.
  
Input:
str1 = "fodr", str2="gork"
k = 2
Output:
1
Explanation: Can change fd to gk

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String str1 = sc.next();
            String str2 = sc.next();
            int k = sc.nextInt();
            Solution ob = new Solution();
            if(ob.areanagrams(str1,str2,k)==true)
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
    public boolean areanagrams(String s1,String s2,int k)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int[] count = new int[256];
        for(int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            count[s2.charAt(i)]--;
        }
        int positive = 0;
        int negative = 0;
        for(int i=0;i<256;i++)
        {
            if(count[i]>0)
            {
                positive+=count[i];
            }
            if(count[i]<0)
            {
                negative+=count[i];
            }
        }
        int value = Math.max(positive,negative);
        if(value>k)
        {
            return false;
        }
        return true;
    }
}
