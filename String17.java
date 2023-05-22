Given a string S, find the length of the longest substring with all distinct characters. 
  
Input:
S = "geeksforgeeks"
Output: 7
Explanation: "eksforg" is the longest 
substring with all distinct characters.
  
Input: 
S = "aaa"
Output: 1
Explanation: "a" is the longest substring 
with all distinct characters.
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t>0)
        {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longest(s));
            t--;
        }
    }
}

class Solution {
    public int longest(String S)
    {
        String test = "";
        int maxlength = -1;
        if(S.isEmpty())
        {
            return 0;
        }
        else if(S.length()==1)
        {
            return 1;
        }
        for(char c: S.toCharArray())
        {
           String current = String.valueOf(c);
           if(test.contains(current))
           {
              test = test.substring(test.indexOf(current)+1); 
           }
           test = test+current;
            System.out.println(test);
           maxlength = Math.max(test.length(),maxlength);
        }
        return maxlength;
    }
}
