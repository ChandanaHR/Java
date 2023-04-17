//MULTIPLICATION TABLE
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList <Integer> ans = ob.getTable(N);
            for(Integer val : ans)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
class Solution {
    static ArrayList <Integer> getTable(int N)
    {
        ArrayList <Integer> ans1 = new ArrayList <Integer>();
        for(int i=1;i<=10;i++)
        {
            ans1.add(i*N);
        }
        return ans1;
    }
}
