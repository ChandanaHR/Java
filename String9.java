Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String s = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.reversewords(s));
            t--;
        }
    }
}

class Solution {
    public String reversewords(String S)
    {
        int i;
        String str[] = S.split("[.]");
        String ans = "";
        for(String a: str)
        {
            System.out.println(a);
        }
        for(i=str.length-1;i>=0;i--)
        {
            ans+=str[i]+".";
        }
        return ans.substring(0,ans.length()-1);
    }
}
