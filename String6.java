Input : S = "I am :IronnorI Ma, i"
Output : YES
Explanation:
Ignore all the symbol and whitespaces S = "IamIronnorIMai".
Now, Check for pallandrome ignoring uppercase and lowercase
english letter.
  
Input : S = Ab?/Ba 
Output :  YES 

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String str = br.readLine();
            Solution obj = new Solution();
            boolean ans = obj.saveIronman(str);
            if(ans == true)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}

class Solution {
    public boolean saveIronman(String s)
    {
        int i,j;
        int n = s.length();
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(i=0;i<n;i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
                sb.append(s.charAt(i));
            }
        }
        int n1 = sb.length()-1;
        for(i=0,j=n1;i<=j;i++,j--)
        {
            if(sb.charAt(i) != sb.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}
