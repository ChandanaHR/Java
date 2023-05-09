Given two strings S1 and S2 as input, the task is to merge them alternatively i.e. the first character of S1 then the first character of S2 and so on till the strings end.
NOTE: Add the whole string if other string is empty.
Input:
S1 = "Hello" S2 = "Bye"
Output: HBeylelo
Explanation: The characters of both the 
given strings are arranged alternatlively.
  
Input: 
S1 = "abc", S2 = "def"
Output: adbecf
Explanation: The characters of both the
given strings are arranged alternatlively.
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String inputline[] = br.readLine().trim().split("\\s+");
            String s1 = inputline[0];
            String s2 = inputline[1];
            Solution obj = new Solution();
            System.out.println(obj.merge(s1,s2));
        }
    }
}

class Solution{
    String merge(String S1, String S2)
    {
        int i,j;
        int m = S1.length();
        int n = S2.length();
        StringBuilder result = new StringBuilder();
        for(i=0,j=0;i<m||j<n;i++,j++)
        {
            result.append(i<m?S1.charAt(i):"");
            result.append(j<n?S2.charAt(j):"");
        }
        return result.toString();
    }
}
