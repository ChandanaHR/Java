Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).
Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the
string GeeksForGeeks as substring.
  
Input:
s = GeeksForGeeks, x = For
Output: 5
Explanation: For is present as substring
in GeeksForGeeks from index 5 (0 based
indexing).
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String line = sc.nextLine();
            String a = line.split(" ")[0];
            String b = line.split(" ")[1];
            Solution obj = new Solution();
            System.out.println(obj.strstr(a,b));
            t--;
        }
    }
}

class Solution {
    public int strstr(String s,String x)
    {
        int index = -1;
        int l = x.length();
        int n = s.length()-l;
        for(int i=0;i<=n;i++)
        {
            if(s.substring(i,i+l).equals(x))
            {
                index = i;
                break;
            }
        }
        return index;
    }
}
