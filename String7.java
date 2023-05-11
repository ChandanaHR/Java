In this problem, a String S is composed of lowercase alphabets and wildcard characters i.e. '?'. Here, '?' can be replaced by any of the lowercase alphabets. Now you have to classify the given String on the basis of following rules:

If there are more than 3 consonants together or more than 5 vowels together, the String is considered to be "BAD". A String is considered "GOOD" only if it is not “BAD”.
  Input:
S = aeioup??
Output:
1
Explanation: The String doesn't contain more
than 3 consonants or more than 5 vowels together.
So, it's a GOOD string.
Input:
S = bcdaeiou??
Output:
0
Explanation: The String contains the
Substring "aeiou??" which counts as 7
vowels together. So, it's a BAD string.
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.isGoodorBad(s));
        }
    }
}

class Solution {
    public int isGoodorBad(String s)
    {
        char ch[] = s.toCharArray();
        int vowels = 0;
        int consonants = 0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
            {
                vowels++;
                consonants = 0;
            }
            else if(ch[i]=='?')
            {
                vowels++;
                consonants++;
            }
            else
            {
                vowels = 0;
                consonants++;
            }
            if(vowels==6 || consonants==4)
            {
                return 0;
            }
        }
        return 1;
    }
}
