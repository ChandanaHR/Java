Given two strings S and P. Find the smallest window in the string S consisting of all the characters(including duplicates) of the string P.  Return "-1" in case there is no such window present. In case there are multiple such windows of same length, return the one with the least starting index.
Note : All characters are in Lowercase alphabets. 

Example 1:

Input:
S = "timetopractice"
P = "toc"
Output: 
toprac
Explanation: "toprac" is the smallest
substring in which "toc" can be found.
Example 2:

Input:
S = "zoomlazapzo"
P = "oza"
Output: 
apzo
Explanation: "apzo" is the smallest 
substring in which "oza" can be found.
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test>0)
        {
            String s = scan.next();
            String t = scan.next();
            System.out.println(new Solution().smallestwindow(s,t));
            test--;
        }
    }
}

class Solution {
    public String smallestwindow(String S,String P)
    {
        int m[] = new int[256];
        char s[] = S.toCharArray();
        char p[] = P.toCharArray();
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int count=0;
        for(int i=0;i<p.length;i++)
        {
            if(m[p[i]] == 0)
            {
                count++;
            }
            m[p[i]]++;
        }
        int i=0,j=0;
        while(j<s.length)
        {
            m[s[j]]--;
            if(m[s[j]] == 0)
            {
                count--;
            }
            
            if(count==0)
            {
                while(count==0)
                {
                    if(ans>j-i+1)
                    {
                        ans = Math.min(ans,j-i+1);
                        start = i;
                    }
                    
                    m[s[i]]++;
                    if(m[s[i]]>0)
                    {
                        count++;
                    }
                    i++;
                }
            }
            j++;
        }
        if(ans != Integer.MAX_VALUE)
        {
            return String.valueOf(s).substring(start,ans+start);
        }
        else
        {
            return "-1";
        }
    }
}
