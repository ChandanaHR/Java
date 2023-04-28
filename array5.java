Given a sorted array A[] of size N, delete all the duplicated elements from A[]. Modify the array such that if there are X distinct elements in it then the first X positions of the array should be filled with them in increasing order and return the number of distinct elements in the array.
Input:
N = 3
Array = {1, 2, 2}
Output: {1, 2}

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            Solution s = new Solution();
            int N = s.getduplicates(a,n);
            for(int i=0;i<N;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
            t--;
        }
    }
}

class Solution {
    public int getduplicates(int a[],int n)
    {
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(i==0 || a[i]!=a[i-1])
            {
                a[j++] = a[i];
            }
        }
        return j;
    }
}
