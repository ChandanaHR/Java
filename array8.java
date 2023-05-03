You are given an array A, of N elements. Find minimum index based distance between two elements of the array, x and y such that (x!=y).
Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are
two distances between x and y, which are
1 and 3 out of which the least is 1.
  
import java.io.*;
import java.util.*;

public class Main  {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int a[] = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minimum(a,n,x,y));
        }
    }
}

class Solution {
    public int minimum(int a[],int n,int x,int y)
    {
        int p=-1,mind = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]==x || a[i]==y)
            {
                if(p!=-1 && a[i]!=a[p])
                {
                    mind = Math.min(mind,i-p);
                }
                p = i;
            }
        }
        if(mind==Integer.MAX_VALUE)
        {
            return -1;
        }
        return mind;
    }
}
