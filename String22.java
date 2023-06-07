Given a string  N representing a positive number. The task is to round N to the nearest multiple of 10.
Note: If you are having two multiple equally apart from N then we will choose the smallest element among them.

 

Example 1:
 

Input : N = 15
Output : 10
Explanation:
Here N is 15. So, the number which is
multiple of 10 are 10, 20, 30. We can
see 10 and 20 are equally distant
from 20. So, we will choose the
smallest element among them i.e., 10.
Example 2:

Input : N = 29 
Output : 30 
  
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String [] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            String line1 = br.readLine().trim();
            Solution ob = new Solution();
            String res = ob.round(line1);
            System.out.println(res);
            t--;
        }
    }
}

class Solution {
    public String round(String N)
    {
        int len = N.length();
        int lastdig = N.charAt(len-1)-'0';
        if(lastdig!=0)
        {
            if(lastdig<=5)
            {
                N = N.substring(0,len-1)+'0';
            }
            else
            {
                StringBuilder sb = new StringBuilder(N);
                sb.setCharAt(len-1,'0');
                int sum,carry=1;
                for(int i=len-2;i>=0;i--)
                {
                    int currdig = N.charAt(i)-'0';
                    sum = currdig+carry;
                    if(sum>9)
                    {
                        sb.setCharAt(i,'0');
                    }
                    else
                    {
                        sb.setCharAt(i,(char)(sum+'0'));
                        carry = 0;
                        break;
                    }
                }
                if(carry==1)
                {
                    sb.insert(0,"1");
                }
                N = sb.toString();
            }
        }
        return N;
    }
}
