Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find the minimum number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.
Input:
S1 = bcadeh
S2 = hea
Output: 3
Explanation: We need to remove b, c
and d from S1.
  
Input:
S1 = cddgk
S2 = gcd
Output: 2
Explanation: We need to remove d and
k from S1.
  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String s = sc.next();
            String s1 = sc.next();
            Gfg g = new Gfg();
            System.out.println(g.remanagram(s,s1));
            t--;
        }
    }
}

class Gfg {
    public int remanagram(String s,String s1)
    {
        int first[] = new int[256];
        Arrays.fill(first,0);
        int second[] = new int[256];
        Arrays.fill(second,0);
        int sum=0,result;
        for(int i=0;i<s.length();i++)
        {
            first[s.charAt(i)]++;
        }
        for(int i=0;i<s1.length();i++)
        {
            second[s1.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if((first[i]!=0 || second[i]!=0) && (first[i]>=second[i]))
            {
                result = first[i]-second[i];
                sum = sum+result;
            }
            else if((first[i]!=0 || second[i]!=0) && (second[i]>first[i]))
            {
                result = second[i]-first[i];
                sum = sum+result;
            }
        }
        return sum;
    }
}
