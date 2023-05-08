Input : dbca   Output: dcba

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s = br.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.reverseorder(s));
        }
    }
}

class Solution {
    public String reverseorder(String s)
    {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder str = new StringBuilder();
        for(int i=ch.length-1;i>=0;i--)
        {
            str.append(ch[i]);
        }
        return str.toString();
    }
}
