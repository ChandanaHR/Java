Given a alphanumeric string S, extract maximum numeric value from S.
Input:
S = 100klh564abc365bg
Output: 564
Explanation: Maximum numeric value 
among 100, 564 and 365 is 564.
Input:
S = abcdefg
Output: -1
Explanation: Return -1 if no numeric 
value is present. 
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t>0)
        {
            String S = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.extractmax(S));
            t--;
        }
    }
}

class Solution {
    public int extractmax(String S)
    {
        int x=-1,i;
        String str="";
        for(i=0;i<S.length();i++)
        {
            if(Character.isDigit(S.charAt(i)))
            {
                str = str+S.charAt(i);
            }
            else if(!Character.isDigit(S.charAt(i)))
            {
                str = "";
            }
            if(str.length()!=0)
            {
                if(Integer.parseInt(str)>x)
                {
                    x = Integer.parseInt(str);
                }
            }
        }
        return x;
    }
}
