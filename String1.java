Given a string S, check if it is palindrome or not.
Input: S = "abba"
Output: 1
Explanation: S is a palindrome

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ispalindrome(s));
        }
    }
}

class Solution {
    int ispalindrome(String s)
    {
        int n = s.length()-1;
        int i,j;
        for(i=0,j=n;i<=j;i++,j--)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return 0;
            }
        }
        return 1;
    }
}


//String.length() method returns the number of characters present in a string
//String.charAt(int index) method returns the character which is present in the specified index
